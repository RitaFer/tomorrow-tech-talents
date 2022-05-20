package extras.cursoemvideo.ex08;

public class Ex08{
    public static void main(String[] args) {
        Person[] people = new Person[2];
        Book[] books = new Book[3];

        people[0] = new Person("Maria da Silva", 22, "Feminino");
        people[1] = new Person("João Augusto Ferreira", 23, "Masculino");

        books[0] = new Book("Como não procrastinar", "JKC", 50, people[0]);
        books[1] = new Book("Vivendo uma vida plena", "GHTC", 200, people[1]);
        books[2] = new Book("Domindo com o inimigo", "João Serra Martins", 100, people[0]);


        books[0].details();
        books[1].details();
        books[2].details();
        books[0].open();
        books[1].open();
        books[2].open();
        books[0].browse(10);
        books[1].browse(10);
        books[2].browse(10);
        books[0].details();
        books[1].details();
        books[2].details();
    }
}