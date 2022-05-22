package extras.cursoemvideo.ex12;

public class Ex12 {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.reaction("Oii");
        d.reaction("Vai Apanhar");
        d.reaction(11, 45);
        d.reaction(21, 0);
        d.reaction(true);
        d.reaction(false);
        d.reaction(2, 12.5F);
        d.reaction(17, 4.5F);
    }
}