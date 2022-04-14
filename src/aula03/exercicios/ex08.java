package aula03.exercicios;

/*
    Escreva um programa que leia 10 valores inteiros e positivos e encontre o maior valor, o menor valor e
calcule a média dos números lidos e exiba essas informações.
 */

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] numbers = new Integer[10];

        for (int i = 0; i < 10; i++) {
            System.out.printf("Insira %dº valor: ", (i + 1));
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        int biggerNumber = 0;
        int lowerNumber = 0;

        for(int i = 0; i <= numbers.length-1; i++){
            sum += numbers[i];

            if(numbers[i] > biggerNumber){
                biggerNumber = numbers[i];
            }
            if(numbers[i] < lowerNumber){
                lowerNumber = numbers[i];
            }
        }


        int average = sum / 10;

        System.out.print("O maior número é: " + biggerNumber + ", e o menor número é: " + lowerNumber + ".\n");
        System.out.print("A média dos números inseridos é " + average + ".");
    }
}

