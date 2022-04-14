package aula03.exercicios;

/*
Escreva um programa que exiba quantas pessoas possuem mais de 18 anos. O algoritmo deverá ler a idade de 10 pessoas.
 */

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.printf("Insira %dº valor: ", (i + 1));
            int number = scanner.nextInt();
            if(number > 18){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
