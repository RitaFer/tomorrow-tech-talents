package extras.devdojo.ex10;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee funcionario = new Employee();
        funcionario.name = "Roberto";
        funcionario.age = 23;
        funcionario.salary = new double[]{1256.55, 2458.99, 5555.00};
        funcionario.avarageSalary();
        System.out.println(funcionario.toString());
    }
}