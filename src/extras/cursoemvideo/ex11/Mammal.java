package extras.cursoemvideo.ex11;

public class Mammal extends Animal {
    private String furColor;

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    @Override
    public void move(){
        System.out.println("Andando...");
    }
    @Override
    public void feed(){
        System.out.println("Mamando...");
    }
    @Override
    public void emitSound(){
        System.out.println("Emitindo Som...");
    }
}