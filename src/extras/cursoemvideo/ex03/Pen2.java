package extras.cursoemvideo.ex03;

public class Pen2 {
    public String model;
    public String color;
    private double point;
    protected int charge;
    private boolean covered;

    public void status(){
        System.out.println("Modelo da caneta é: " + this.model);
        System.out.println("Cor da caneta é: " + this.color);
        System.out.println("Ponta da caneta é: " + this.point);
        System.out.println("Carga da caneta é: " + this.charge + "%");
        System.out.println("A caneta está tampada? " + (this.covered ? "Sim" : "Não"));
    }

    public void draw(){
        if(covered){
            System.out.println("ERRO, é necessário destampar a caneta.");
        } else{
            System.out.println("Rabisco....");
        }
    }

    public void cover(){
        covered = true;
    }

    public void uncover(){
        covered = false;
    }
}