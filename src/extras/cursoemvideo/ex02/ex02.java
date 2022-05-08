package extras.cursoemvideo.ex02;

public class ex02 {
    public static void main(String[] args) {
        Pen bic = new Pen();
        bic.model = "Bic";
        bic.color = "Azul";
        bic.point = 0.5;
        bic.charge = 50;
        bic.covered = false;

        bic.cover();
        bic.status();
        bic.uncover();
        bic.draw();
    }
}