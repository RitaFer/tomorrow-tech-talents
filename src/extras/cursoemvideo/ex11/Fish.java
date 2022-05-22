package extras.cursoemvideo.ex11;

public class Fish extends Animal {
    private String scaleColor;

    public String getScaleColor() {
        return scaleColor;
    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }

    public void releaseBubbles(){
        System.out.println("Soltando bolhas...");
    }

    @Override
    public void move(){
        System.out.println("Nadando...");
    }
    @Override
    public void feed(){
        System.out.println("Comendo...");
    }
    @Override
    public void emitSound(){
        System.out.println("Não emite som...");
    }
}