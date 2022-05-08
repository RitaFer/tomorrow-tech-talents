package extras.cursoemvideo.ex02;

public class Pen {
    String model;
    String color;
    double point;
    int charge;
    boolean covered;

    void status(){
        System.out.println("Modelo da caneta é: " + this.model);
        System.out.println("Cor da caneta é: " + this.color);
        System.out.println("Ponta da caneta é: " + this.point);
        System.out.println("Carga da caneta é: " + this.charge + "%");
        System.out.println("A caneta está tampada? " + (this.covered ? "Sim" : "Não"));
    }

    void draw(){
        if(covered){
            System.out.println("ERRO, é necessário destampar a caneta.");
        } else{
            System.out.println("Rabisco....");
        }
    }

    void cover(){
        covered = true;
    }

    void uncover(){
        covered = false;
    }
}