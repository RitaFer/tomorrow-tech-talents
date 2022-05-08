package extras.cursoemvideo.ex04;

public class Pen3 {
    private String model;
    private final String color;
    private double point;
    private boolean covered;

    public Pen3(String colorInserted){
        cover();
        this.color = colorInserted;
    }

    public void setModel(String modelInserted){
        this.model = modelInserted;
    }

    public void setPoint(double pointInserted){
        this.point = pointInserted;
    }

    public String getModel(){
        return model;
    }

    public double getPoint(){
        return point;
    }

    public void status(){
        System.out.println("EXIBINDO A CANETA:");
        System.out.println("Modelo: " + this.getModel());
        System.out.println("Ponta: " + this.getPoint());
        System.out.println("Cor: " + this.color);
        System.out.println("Está tampada? " + this.covered);
    }

    private void cover(){
        this.covered = true;
    }
}
