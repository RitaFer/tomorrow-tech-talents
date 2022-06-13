package oopii.store.domain.repositories;
import oopii.store.domain.model.*;
import oopii.store.services.ICashierController;

public class CashierController implements ICashierController {
    public DBStockController stock = new DBStockController();
    private final Cashier cashier = new Cashier();

    @Override
    public boolean purchase(long id, int quantity) {
        StockItem item = stock.getProductById(id);
        if (item != null && item.getQuantity() > 0) {
            if (item.getQuantity() >= quantity) {
                cashier.setCash(cashier.getCash() + (item.getProduct().getPrice() * quantity));
                stock.removeProductFromStock(id, quantity);
                System.out.println("Comprado com sucesso.");
                return true;
            }
        }
        return false;
    }

    @Override
    public void inCash() {
        double cash = cashier.getCash();
        System.out.printf("O caixa possui $%.2f disponível.\n", cash);
    }

    @Override
    public boolean verifyPurchase(long id, int quantity, Customer customer) {
        if(stock.getProductById(id) instanceof AdultItem){
            return purchaseAdultProduct(id, quantity, customer);
        }else{
            return purchase(id,quantity);
        }
    }

    @Override
    public void applyBookPurchaseDiscount(double amountSpentOnBooks) {
        if(amountSpentOnBooks >= 200){
            amountSpentOnBooks *= 0.15;
            cashier.setCash(cashier.getCash()-amountSpentOnBooks);
        }

    }

    @Override
    public boolean purchaseAdultProduct(long id, int quantity, Customer custumer) {
        AdultItem adultItem = (AdultItem) stock.getProductById(id);
        if ( adultItem != null && adultItem.getQuantity() > 0) {
            if (custumer.isOfAge()) {
                return purchase(id, quantity);
            }
        }
        return false;
    }

    @Override
    public void purchaseMultiplesItems(long[][] idAndQuantity, Customer custumer) {
        double amountSpentOnBooks = 0;
        for (long[] longs : idAndQuantity) {
            long id = longs[0];
            int quantity = (int) longs[1];
            if (stock.getProductById(id).getProduct().getType() == ProductType.BOOKS) {
                if (verifyPurchase(id, quantity, custumer)) {
                    amountSpentOnBooks++;
                } else {
                    verifyPurchase(id, quantity, custumer);
                }
            }
        }
        if (amountSpentOnBooks >= 200) {
            applyBookPurchaseDiscount(amountSpentOnBooks);
        }
    }
}