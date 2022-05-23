package oop.enemies;

public class Snake extends Enemy{

    protected Snake(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("O inimigo " + name + " causou 10 de dano!");
    }

    @Override
    public void damage(TypeAttack typeAttack, int damageValue) {
        if (!typeAttack.equals(TypeAttack.STUN)) {
            System.out.printf("Recebeu %d de dano!\n", damageValue);
        }
        System.out.printf("Recebeu %d de dano!\n", damageValue * 2);
    }

    @Override
    public void interact() {
        System.out.println("Se você acender a chama a maldição acaba.");
    }
}