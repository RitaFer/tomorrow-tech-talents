package oopi.enemies;

public class Generic extends Enemy{

    public Generic(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("O inimigo " + name + " causou 10 de dano!");
    }

    @Override
    public void damage(TypeAttack typeAttack, int damageValue) {
        System.out.printf("Recebeu %d de dano!\n", damageValue);
    }

    @Override
    public void interact() {
        System.out.println("Por que eu responderia meu inimigo?");
    }
}
