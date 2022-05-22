package extras.cursoemvideo.finalProject;

public class FinalProject {
    public static void main(String[] args) {
        Video[] video = new Video[3];
        video[0] = new Video("Começando com Java");
        video[1] = new Video("Java e Mercado");
        video[2] = new Video("JDK");
        System.out.println(video[0].toString());
        System.out.println(video[1].toString());
        System.out.println(video[2].toString());

        Locust[] locusts = new Locust[2];
        locusts[0] = new Locust("Maria", 22, "Feminino", 2, "maria.dasilva@gmail.com");
        locusts[1] = new Locust("João", 26, "Masculino", 4, "joao.andrade@gmail.com");
        System.out.println(locusts[0].toString());
        System.out.println(locusts[1].toString());

        View[] views = new View[2];
        views[0] = new View(locusts[0], video[0]);
        views[0].assess();
        System.out.println(views[0].toString());

        views[1] = new View(locusts[0], video[1]);
        views[1].assess(89);
        System.out.println(views[1].toString());
    }
}