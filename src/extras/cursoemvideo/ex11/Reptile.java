package extras.cursoemvideo.ex11;

public class Reptile extends Animal {
    private String scaleColor;

    public String getScaleColor() {
        return scaleColor;
    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }

    @Override
    public void move(){
        System.out.println("Rastejando...");
    }
    @Override
    public void feed(){
        System.out.println("Comendo...");
    }
    @Override
    public void emitSound(){
        System.out.println("Emitindo Som de Réptil...");
    }
}