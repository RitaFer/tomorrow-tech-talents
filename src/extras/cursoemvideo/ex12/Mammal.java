package extras.cursoemvideo.ex12;

public class Mammal extends Animal{
    private String furColor;

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    @Override
    public void emitSound(){
        System.out.println("Som de Mamífero...");
    }
}
