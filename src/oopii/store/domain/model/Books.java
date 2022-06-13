package oopii.store.domain.model;
import java.util.List;

public class Books extends Product {
    private List<String> genres;
    private String author;
    private String publisher;

    public Books(String name, double price, List<String> genres, String author, String publisher) {
        super(name, price, ProductType.BOOKS);
        this.genres = genres;
        this.author = author;
        this.publisher = publisher;
    }

    public List<String> getGenre() {
        return genres;
    }

    private void setGenre(List<String> genres) {
        this.genres = genres;
    }

    public String getAuthor() {
        return author;
    }

    private void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    private void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public void update(Product product) {
        if(product instanceof Books){
            setName(product.getName());
            setGenre(((Books) product).getGenre());
            setPrice(product.getPrice());
            setType(product.getType());
            setAuthor(((Books) product).getAuthor());
            setPublisher(((Books) product).getPublisher());
        }
    }

    @Override
    public void productInfo() {
        System.out.printf("""
                Nome do Livro: %s
                ID: %d
                Gêneros: %s
                Autor: %s
                Editora: %s
                Preço: R$ %.2f
                """,
                getName(),getId(),getGenre(),getAuthor(),getPublisher(),getPrice());

    }
}