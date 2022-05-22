package extras.cursoemvideo.ex11;

public class Ex11 {
    public static void main(String[] args) {
        Bird passaro = new Bird();
        Dog cachorro = new Dog();
        Fish peixe = new Fish();
        Goldenfish peixeDourado = new Goldenfish();
        Kangaroo kanguru = new Kangaroo();
        Macaw arara = new Macaw();
        Mammal mamifero = new Mammal();
        Reptile reptil = new Reptile();
        Snake cobra = new Snake();
        Turtle tartatuga = new Turtle();

        passaro.emitSound();
        cachorro.move();
        peixe.feed();
        kanguru.move();
        arara.emitSound();
    }
}