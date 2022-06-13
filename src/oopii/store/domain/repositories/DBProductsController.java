package oopii.store.domain.repositories;

import oopii.store.domain.model.Product;

import java.util.ArrayList;
import java.util.List;

public class DBProductsController <T extends Product>{
    private final List<T> productsList;

    public DBProductsController() {
        this.productsList = new ArrayList<>();
    }

    public void registerProduct(T product) {
        if(productsList.contains(product)){
            System.out.println("O produto já está cadastrado.");
        }else{
            productsList.add(product);
        }
    }

    public void getProductsList() {
        for (Product product:productsList){
            product.productInfo();
        }
    }

    public T findById(long id) {
        for (T product : productsList){
            if (product.getId() == id){
                return product;
            }
        }
        System.out.println("Produto não encontrado.");
        return null;
    }

    public void deleteProduct(long id) {
        T product = findById(id);
        if(product != null){
            productsList.remove(product);
        }
    }

    public void updateProduct(long id, T product) {
         T item = findById(id);
        if (item != null){
            item.update(product);
        }
    }
}