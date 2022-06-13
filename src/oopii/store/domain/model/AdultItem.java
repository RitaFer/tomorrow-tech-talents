package oopii.store.domain.model;

public class AdultItem extends StockItem{
    private final boolean isAnAdultProduct;

    public AdultItem(Product product, int quantity) {
        super(product, quantity);
        this.isAnAdultProduct = true;
    }

    public boolean isAnAdultProduct() {
        return isAnAdultProduct;
    }

    @Override
    public void showStockQuantity() {
        super.showStockQuantity();
        System.out.println("This is an adult product!");
    }
}