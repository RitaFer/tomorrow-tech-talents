package oopi.stock;

public class Product {
    private int idProduct;
    private static int contProduct = 0;
    private String name;
    private String session;
    private String type;
    private String mark;
    private int quantityStock;

    public Product(String name, String session, String type, String mark, int stock) {
        contProduct++;
        this.name = name;
        this.session = session;
        this.type = type;
        this.mark = mark;
        this.quantityStock = stock;
        idProduct = contProduct;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSession() {
        return mark;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public String getType() {
        return mark;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getQuantityStock() {
        return quantityStock;
    }

    public void setQuantityStock(int quantityStock) {
        this.quantityStock = quantityStock;
    }
}