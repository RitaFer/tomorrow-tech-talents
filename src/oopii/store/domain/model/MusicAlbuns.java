package oopii.store.domain.model;

import java.util.List;

public class MusicAlbuns extends Product{
    private List<String> genres;
    private List<String> band;
    private List<String> stamps;

    public MusicAlbuns(String name, double price, List<String> genres, List<String> band, List<String> stamps) {
        super(name, price, ProductType.MUSIC_ALBUNS);
        this.genres = genres;
        this.band = band;
        this.stamps = stamps;
    }

    public List<String> getGenres() {
        return genres;
    }

    private void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public List<String> getMusisians() {
        return band;
    }

    private void setMusisians(List<String> band) {
        this.band = band;
    }

    public List<String> getStamps() {
        return stamps;
    }

    private void setStamps(List<String> stamps) {
        this.stamps = stamps;
    }

    @Override
    public void update(Product product) {
        if(product instanceof MusicAlbuns){
            setName(product.getName());
            setPrice(product.getPrice());
            setGenres(((MusicAlbuns) product).getGenres());
            setMusisians(((MusicAlbuns) product).getMusisians());
            setStamps(((MusicAlbuns) product).getStamps());
        }
    }

    @Override
    public void productInfo() {
        System.out.printf("""
                Nome do Álbum: %s
                ID: %d
                Gêneros: %s
                Banda: %s
                Selos: %s
                Preço: R$ %.2f
                """,
                getName(),getId(),getGenres(),getMusisians().toString(),getStamps().toString(),getPrice());
    }
}
