package oopii.store.services;
import oopii.store.domain.model.ProductType;
import oopii.store.domain.model.StockItem;
import java.util.List;

public interface IDBStockController {
    List<StockItem> getStock();
    List<StockItem> getProductsOfAType(ProductType type);
    StockItem getProductById(long id);
    void addProductToStock(long id, int quantity);
    void removeProductFromStock(long id, int quantity);
    void stockItemsInfo(List<StockItem> listOfStockItems);
}