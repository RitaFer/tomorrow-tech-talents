package programminglogic.class03;

/*
    Escreva um programa que leia 10 valores inteiros e positivos e encontre o maior valor, o menor valor e
calcule a média dos números lidos e exiba essas informações.
 */

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] numbers = new Integer[10];

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.printf("Insira %dº valor: ", (i + 1));
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
            if(numbers[i] < 0 || numbers[i] == 0){
                System.out.printf("\nFavor inserir um número positivo: ");
                numbers[i] = scanner.nextInt();
                sum += numbers[i];
            }
        }

        int biggerNumber = numbers[0];
        int lowerNumber = numbers[0];

        for (int i = 0; i < 10; i++) {
            if (numbers[i] > biggerNumber) {
                biggerNumber = numbers[i];
            }

            if (numbers[i] < lowerNumber) {
                lowerNumber = numbers[i];
            }
        }

        int average = sum / 10;

        System.out.print("\nO maior número é: " + biggerNumber + ", e o menor número é: " + lowerNumber + ".\n");
        System.out.print("\nA média dos números inseridos é " + average + ".");
    }
}

