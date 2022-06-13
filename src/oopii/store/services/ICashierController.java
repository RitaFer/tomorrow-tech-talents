package oopii.store.services;
import oopii.store.domain.model.Customer;

public interface ICashierController {
    boolean purchase(long id, int quantity);
    void inCash();
    boolean verifyPurchase(long id,int quantity, Customer customer);
    void applyBookPurchaseDiscount(double amountSpentOnBooks);
    boolean purchaseAdultProduct(long id, int quantity, Customer customer);
    void purchaseMultiplesItems(long[][] idAndQuantity, Customer customer);
}