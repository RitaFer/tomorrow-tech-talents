package oopi.enemies;

public abstract class Enemy {
    protected String name;

    protected Enemy(String name) {
        this.name = name;
    }

    protected abstract void attack();
    protected abstract void damage(TypeAttack typeAttack, int damageValue);
    protected abstract void interact();
}