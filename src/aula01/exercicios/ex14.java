package aula01.exercicios;
import java.util.Scanner;

/*
Escreva um programa para ler o raio de um círculo, calcular e escrever o valor da área:
    Cálculo: área = PI * (raio²)
 */

public class ex14 {
    public static void main(String[] args) {
        Scanner inserted = new Scanner(System.in);
        System.out.print("Insira o raio do círculo, em cm: ");
        double radius = inserted.nextDouble();
        double area = 3.14 * (radius * radius);

        System.out.print("A área do círculo de raio = " + radius + " cm, é igual a " + area + " cm2.");
    }
}
