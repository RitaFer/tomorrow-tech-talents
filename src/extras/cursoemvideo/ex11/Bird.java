package extras.cursoemvideo.ex11;

public class Bird extends Animal {
    private String featherColor;

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    public void neast(){
        System.out.println("Fazendo ninho...");
    }

    @Override
    public void move(){
        System.out.println("Voando...");
    }
    @Override
    public void feed(){
        System.out.println("Bicando...");
    }
    @Override
    public void emitSound(){
        System.out.println("Cantando...");
    }
}
