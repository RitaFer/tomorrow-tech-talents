package oopii.store.domain.model;

public enum ProductType {
    BOOKS("Livros"),
    GAMES("Jogos"),
    MOVIES("Filmes"),
    MUSIC_ALBUNS("Álbuns de Música"),
    TOYS("Brinquedos");

    final String type;

    ProductType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}