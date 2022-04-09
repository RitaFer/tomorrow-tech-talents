package aula01.exercicios;
import java.util.Scanner;

/*
    Crie um programa que receba 2 números e ao final mostre as seguintes operações:
    - Soma
    - Subtração
    - Multiplicação
    - Divisão
 */

public class ex07 {
    public static void main(String[] args) {
        Scanner insertedNumber = new Scanner(System.in);
        System.out.print("Insira o primeiro valor: ");
        double a = insertedNumber.nextDouble();
        System.out.print("Insira o segundo valor: ");
        double b = insertedNumber.nextDouble();

        double sum = a + b;
        double sub = a - b;
        double mult = a * b;
        double div = a / b;

        System.out.print("As operações entre os valores inseridos, a = " + a + ", b = " + b);
        System.out.print("\n - Soma: " + sum + ",");
        System.out.print("\n - Subtração: " + sub + ",");
        System.out.print("\n - Multiplicação: " + mult + ",");
        System.out.print("\n - Divisão: " + div);
    }
}
