package oopi.enemies;

public class Giant extends Enemy{

    protected Giant(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("O inimigo " + name + " causou 25 de dano!");
    }

    @Override
    public void damage(TypeAttack typeAttack, int damageValue) {
        if(!typeAttack.equals(TypeAttack.ELEMENTAL)) {
            System.out.printf("Recebeu %d de dano!\n", damageValue);
        }
        System.out.printf("Recebeu %d de dano!\n", damageValue * 2);
    }

    @Override
    public void interact() {
        System.out.println("Me desculpe !");
    }
}