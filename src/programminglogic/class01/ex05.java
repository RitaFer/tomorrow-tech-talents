package programminglogic.class01;
import java.util.Scanner;

/*
    Crie um programa que com base em um salário de um funcionário,
reajusta o salário em 7% e mostra o valor antes do reajuste e após.
 */

public class ex05 {
    public static void main(String[] args) {
        Scanner inserted = new Scanner(System.in);
        System.out.print("Insira o valor do salário: R$ ");
        double salary = inserted.nextDouble();
        double readjustment = (salary * 7) / 100;
        double finalSalary = salary + readjustment;

        System.out.print("O salário inicial é de R$ " + salary + ", o salário com reajuste é de R$ " + finalSalary + ".");
    }
}
