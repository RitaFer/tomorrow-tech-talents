package oop.enemies;

public class Enemies {
    public static void main(String[] args) {
        Enemy generic = new Generic("Genérico");
        Enemy vampire = new Vampire("Vampirão");
        Snake snake = new Snake("Cobrona");
        Giant giant = new Giant("Gigante Golias");

        System.out.println("------------------------------------------------------------");
        generic.attack();
        generic.interact();
        generic.damage(TypeAttack.NORMAL, 10);
        System.out.println("------------------------------------------------------------");
        vampire.attack();
        vampire.interact();
        vampire.damage(TypeAttack.DRILLING, 20);
        System.out.println("------------------------------------------------------------");
        snake.attack();
        snake.interact();
        snake.damage(TypeAttack.STUN, 35);
        System.out.println("------------------------------------------------------------");
        giant.attack();
        giant.interact();
        giant.damage(TypeAttack.ELEMENTAL, 5);
        System.out.println("------------------------------------------------------------");
    }
}