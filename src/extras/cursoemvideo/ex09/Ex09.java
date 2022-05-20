package extras.cursoemvideo.ex09;

public class Ex09 {
    public static void main(String[] args) {
        Person p1 = new Person("Gustavo", 12, "Masculino");
        Student p2 = new Student("Alexandre", 25, "Masculino", 15982, "Geografia");
        Teacher p3 = new Teacher("Rosana", 50, "Feminino", "Historia", 1500.98);
        Employee p4 = new Employee("Maria das Dores", 60, "Feminino", "Faxina", true);

        p1.setName("Pedro");
        p2.setName("Mário");
        p3.setName("Cláudio");
        p4.setName("Fabiana");

        p2.setCourse("Informática");
        p3.setSalary(1895.50);
        p4.setSetor("Estoque");

        p3.receiveRaise(550.20);
        p4.changeWorking();
        p2.cancelNumber();

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}