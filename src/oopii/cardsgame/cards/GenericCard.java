package oopii.cardsgame.cards;

public abstract class GenericCard {
    String name;
    TypeOfCard type;
    int cost;

    public String getName() {
        return name;
    }

    public TypeOfCard getType() {
        return type;
    }

    public int getCost() {
        return cost;
    }
}