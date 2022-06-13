package oopii.store.domain.model;

import java.util.List;

public class Movies extends Product{
    private List<String> genres;
    private List<String> directors;
    private List<String> producers;
    private String studio;

    public Movies(String name, double price, List<String> genres, List<String> directors, List<String> producers, String studio) {
        super(name, price, ProductType.MOVIES);
        this.genres = genres;
        this.directors = directors;
        this.producers = producers;
        this.studio = studio;
    }

    public List<String> getGenres() {
        return genres;
    }

    private void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public List<String> getDirectors() {
        return directors;
    }

    private void setDirectors(List<String> directors) {
        this.directors = directors;
    }

    public List<String> getProducers() {
        return producers;
    }

    private void setProducers(List<String> producers) {
        this.producers = producers;
    }

    public String getStudio() {
        return studio;
    }

    private void setStudio(String studio) {
        this.studio = studio;
    }

    @Override
    public void update(Product product) {
        if(product instanceof Movies) {
            setName(product.getName());
            setPrice(product.getPrice());
            setGenres(((Movies) product).getGenres());
            setDirectors(((Movies) product).getDirectors());
            setProducers(((Movies) product).getProducers());
            setStudio(((Movies) product).getStudio());
        }
    }

    @Override
    public void productInfo() {
        System.out.printf("""
                Nome do Filme: %s
                ID: %d
                Gêneros: %s
                Diretores: %s
                Produtores: %s
                Estúdio: %s
                Preço: R$ %.2f
                """,
                getName(),getId(),getGenres(),getDirectors().toString(),getProducers().toString(),getStudio(),getPrice());
    }
}
