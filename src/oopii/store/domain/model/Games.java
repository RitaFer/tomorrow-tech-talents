package oopii.store.domain.model;

public class Games extends Product{
    private String genre;
    private String distributor;
    private String studio;

    public Games(String name, double price, String genre, String distributor, String studio) {
        super(name, price, ProductType.GAMES);
        this.genre = genre;
        this.distributor = distributor;
        this.studio = studio;
    }

    public String getGenre() {
        return genre;
    }

    private void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDistributor() {
        return distributor;
    }

    private void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    public String getStudio() {
        return studio;
    }

    private void setStudio(String studio) {
        this.studio = studio;
    }

    @Override
    public void update(Product product) {
        if (product instanceof Games){
            setName(product.getName());
            setPrice(product.getPrice());
            setGenre(((Games) product).getGenre());
            setDistributor(((Games) product).getDistributor());
            setStudio(((Games) product).getStudio());
        }
    }

    @Override
    public void productInfo() {
        System.out.printf("""
                Nome do Jogo: %s
                ID: %d
                Gênero: %s
                Distribuidor: %s
                Estúdio: %s
                Preço: R$ %.2f
                """,
                getName(),getId(),getGenre(),getDistributor(),getStudio(),getPrice());
    }
}