package oopii.store.domain.model;

public class Toy extends Product{
    private String toyType;

    public Toy(String name, double price, String toyType) {
        super(name, price, ProductType.TOYS);
        this.toyType = toyType;
    }

    public String getToyType() {
        return toyType;
    }

    private void setToyType(String toyType) {
        this.toyType = toyType;
    }

    @Override
    public void update(Product product) {
        if(product instanceof Toy){
            setName(product.getName());
            setPrice(product.getPrice());
            setToyType(((Toy) product).toyType);
        }
    }

    @Override
    public void productInfo() {
        System.out.printf("""
                Nome do Brinquedo: %s
                ID: %d
                Tipo: %s
                Preço: R$ %.2f
                """,
                getName(),getId(),getToyType(),getPrice());
    }
}