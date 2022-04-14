package aula03.exercicios;

/*
    Escreva um programa que receba 5 números inteiros, armazene-os em um array,
e imprima na tela os valores em ordem decrescente.
 */

import java.util.Arrays;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double[] numbers = new Double[5];
        for (int i = 0; i < numbers.length; i++){
            System.out.print("Insira o " + (i+1) + "º número:");
            numbers[i] = scanner.nextDouble();
        }

        Arrays.sort(numbers);

        System.out.println("\nOs números inseridos em forma decrescente: ");
        for (int i = 4; i > 0; i--) {
            System.out.println("- " + numbers[i] + ";");
        }

/*
        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < i; j++) {
                if (numbers[i] > numbers[j]) {
                    double aux = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = aux;
                }
            }
        }

        System.out.println("\nOs números inseridos em forma decrescente: ");
        for (double n : numbers) {
            System.out.println("- " + n + ";");
        }
 */
    }
}
