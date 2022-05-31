package extras.devdojo.ex09;

public class CarsTest {
    public static void main(String[] args) {
        Cars car1 = new Cars();
        Cars car2 = new Cars();

        car1.name = "Carro do Bruno";
        car1.model = "Gol";
        car1.year = 2020;

        car2.name = "Carro da Rita";
        car2.model = "Civic";
        car2.year = 2022;

        System.out.println("---------------------------------------------");
        System.out.println("CARRO 1: ");
        System.out.println(car1.name);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println("---------------------------------------------");
        System.out.println("CARRO 2: ");
        System.out.println(car2.name);
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println("---------------------------------------------");
    }
}