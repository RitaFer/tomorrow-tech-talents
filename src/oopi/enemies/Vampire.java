package oopi.enemies;

public class Vampire extends Enemy{

    protected Vampire(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("O inimigo " + name + " causou 20 de dano!");
    }

    @Override
    public void damage(TypeAttack typeAttack, int damageValue) {
        if (!typeAttack.equals(TypeAttack.DRILLING)) {
            System.out.printf("GRecebeu %d de dano!\n", damageValue);
        }
        System.out.printf("Recebeu %d de dano!\n", damageValue * 2);
    }

    @Override
    public void interact() {
        System.out.println("O que é um homem?");
    }
}