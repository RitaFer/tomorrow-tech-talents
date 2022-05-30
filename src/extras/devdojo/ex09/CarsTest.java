package extras.devdojo.ex09;

public class CarsTest {
    public static void main(String[] args) {
        Cars model1 = new Cars();
        Cars model2 = new Cars();

        model1.name = "Carro do Bruno";
        model1.model = "Gol";
        model1.year = 2020;

        model2.name = "Carro da Rita";
        model2.model = "Civic";
        model2.year = 2022;

        System.out.println("---------------------------------------------");
        System.out.println("CARRO 1: ");
        System.out.println(model1.name);
        System.out.println(model1.model);
        System.out.println(model1.year);
        System.out.println("---------------------------------------------");
        System.out.println("CARRO 2: ");
        System.out.println(model2.name);
        System.out.println(model2.model);
        System.out.println(model2.year);
        System.out.println("---------------------------------------------");

    }
}
