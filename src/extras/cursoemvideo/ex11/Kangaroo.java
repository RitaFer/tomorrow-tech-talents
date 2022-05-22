package extras.cursoemvideo.ex11;

public class Kangaroo extends Mammal{
    public void isMarsupial(){
        System.out.println("O Kanguru usa bolsa !!!");
    }

    @Override
    public void move(){
        System.out.println("Pulando...");
    }
}