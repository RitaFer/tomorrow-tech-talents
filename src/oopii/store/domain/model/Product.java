package oopii.store.domain.model;

import oopii.store.services.IProduct;

public abstract class Product implements IProduct {
    private static long idGenerator = 10001;
    private long id;
    private String name;
    private double price;
    private ProductType type;


    public Product(String name, double price, ProductType type) {
        this.id = idGenerator;
        idGenerator++;
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    public ProductType getType() {
        return type;
    }

    protected void setType(ProductType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Produto {" +
                "ID = " + id +
                ", Nome = '" + name + '\'' +
                ", Preço = R$ " + price +
                ", Tipo = " + type.type +
                '}';
    }
}
