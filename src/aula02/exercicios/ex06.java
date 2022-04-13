package aula02.exercicios;

/*
Leia 4 (quatro) números calcule o quadrado para cada um (n²) some todos e exiba o resultado
 */

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] numbers = new Integer[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Insira o " + (i+1) + "º número: ");
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int v : numbers) {
            sum += Math.pow(v, 2);
        }

        System.out.println("\nA soma dos quadrados dos números inseridos é: " + sum);
    }
}
