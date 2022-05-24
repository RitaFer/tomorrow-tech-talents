package oopi.stock;
import java.util.ArrayList;
import java.util.List;

public class Stock {
    private int idStock;
    private static int contStock = 0;
    public String name;
    private List<Product> products = new ArrayList<Product>();

    public Stock(String name, List<Product> products) {
        this.name = name;
        this.products = products;
        contStock++;
        this.idStock = contStock;
    }

    public void registerProduct(String name, String session, String type, String mark, int quantityStock){
        int index = 0;
        boolean productExists = false;
        for(int i = 0; i < this.products.size(); i++){
            if (this.products.get(i).getName().equals(name) && this.products.get(i).getMark().equals(mark)) {
                index = i;
                productExists = true;
            }
        }

        if(productExists){
            int newQuantity = quantityStock + this.products.get(index).getQuantityStock();
            this.products.get(index).setQuantityStock(newQuantity);
            System.out.println("\nQuantidade de produtos em estoque atualizada.");
        } else {
            this.products.add(new Product(name, session, type, mark, quantityStock));
            System.out.println("\nProduto "+ name +" foi cadastrado no estoque: "+ this.name.toUpperCase());
        }
    }

    public void readProducts(){
        System.out.println("\nProdutos cadastrados no estoque: "+ this.name.toUpperCase());
        if (this.products.isEmpty()){
            System.out.println("\nNão existem produtos cadastrados.");
        } else {
            for(Product product : this.products){
                System.out.println(
                        "\nID do Produto: "+product.getIdProduct()
                        +".\nProduto: "+product.getName()
                        +".\nSeção: "+product.getSession()
                        +".\nTipo: "+product.getType()
                        +".\nQuantidade em estoque: "+product.getQuantityStock()
                        +".\nMarca: "+product.getMark()
                );
            }
        }
    }

    public void updateProduct(String name, String session, String type, int quantityStock, String mark, Product product){
        int index = this.products.indexOf(product);
        this.products.get(index).setName(name);
        this.products.get(index).setSession(session);
        this.products.get(index).setType(type);
        this.products.get(index).setQuantityStock(quantityStock);
        this.products.get(index).setMark(mark);
        System.out.println("\nProduto atualizado com sucesso.");
    }

    public void deleteProduct(Product product){
        this.products.remove(product);
        System.out.println("\nProduto deletado.");
    }

    public Product findProduct(int id){
        Product productFound = null;
        boolean elementFound = false;

        for (Product product : this.products) {
            if (product.getIdProduct() == id) {
                productFound = product;
                elementFound = true;
            }
        }
        if (elementFound){
            System.out.println("\nProduto de ID " + id + " encontrado.");
        } else {
            System.out.println("\nProduto não existe no estoque.");
        }
        return productFound;
    }

    @Override
    public String toString() {
        return "Estoque: " + this.name.toUpperCase() + " .\nID : " + this.idStock + ".\nProdutos cadastrados: " + this.products.size();
    }

    public int getIdStock() {
        return idStock;
    }
}