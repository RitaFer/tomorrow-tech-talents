package extras.cursoemvideo.ex03;

public class ex03 {
    public static void main(String[] args) {
        Pen2 bic = new Pen2();
        bic.model = "Bic";
        bic.color = "Azul";
        bic.charge = 10;
        bic.status();
        bic.cover();
    }
}