package extras.devdojo.tokens;

public class Strings {
    public static void main(String[] args) {
        String dogs = "Meg, Cacá, Duda, Yuno, Tico";
        String[] dogsNames = dogs.split(",");
        for (String name: dogsNames) {
            String dogName = name.trim();
            System.out.println(dogName);
        }
    }
}
