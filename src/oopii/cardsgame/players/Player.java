package oopii.cardsgame.players;

public class Player {
    private int life;

    public Player(int lifePoints) {
        this.life = lifePoints;
    }

    public int getLifePoints() {
        return life;
    }

    public void setLifePoints(int lifePoints) {
        this.life = lifePoints;
    }
}