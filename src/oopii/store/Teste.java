package oopii.store;
import oopii.store.domain.repositories.*;
import oopii.store.domain.model.*;
import java.util.List;

public class Teste {
    public static <T extends Product> void main(String[] args) {
        Books book = new Books("Como cuidar da sua vida",55.99, List.of("Drama","Autocuidado"),"Alguém","Nova Editora");
        Movies movie = new Movies("It",19.99, List.of("Suspense","Terror"), List.of("Fulano","Joaquina"),List.of("Maiara","Maraisa"),"Pixel");

        CashierController cashierController = new CashierController();
        DBStockController stock = cashierController.stock;
        stock.dbProductsController.registerProduct(book);
        stock.dbProductsController.registerProduct(movie);
        stock.dbProductsController.getProductsList();
        stock.dbProductsController.findById(10001).productInfo();
        stock.dbProductsController.deleteProduct(10001);
        stock.dbProductsController.getProductsList();
        stock.addProductToStock(10002,100);
        stock.getProductById(10002).showStockQuantity();
        stock.stockItemsInfo(stock.getProductsOfAType(ProductType.BOOKS));
        stock.stockItemsInfo(stock.getStock());
        cashierController.inCash();
        cashierController.purchase(10002,500);
        cashierController.inCash();
    }
}