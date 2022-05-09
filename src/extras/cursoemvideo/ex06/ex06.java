package extras.cursoemvideo.ex06;

public class ex06 {
    public static void main(String[] args) {
        RemoteController teste = new RemoteController();
        teste.turnOn();
        teste.openMenu();
        teste.closeMenu();
        teste.moreSound();
        teste.moreSound();
        teste.lessSound();
        teste.openMenu();
        teste.pause();
        teste.play();
        teste.withoutSound();
    }
}
