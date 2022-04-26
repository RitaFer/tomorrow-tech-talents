package aula05.exercicios;

/*
Faça um programa que receba a idade e o peso de sete pessoas. Calcule e mostre:
A quantidade de pessoas com mais de 90 quilos;
A média das idades das sete pessoas;
 */

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age, moreThanNinety = 0, sumAge = 0;
        double weight;

        for(int i = 0; i < 7; i++) {
            System.out.print("Qual a idade da " + (i + 1) + "ª pessoa? ");
            age = scanner.nextInt();
            System.out.print("Qual o peso, em kg, da " + (i + 1) + "ª pessoa? ");
            weight = scanner.nextDouble();

            if (weight > 90) {
                moreThanNinety++;
            }

            sumAge += age;
        }
        System.out.println("=============================================================\n");
        System.out.println("A quantidade de pessoas com mais de 90kg é " + moreThanNinety);
        System.out.println("A média de idades é " + (sumAge / 7));
        System.out.println("\n=============================================================");
    }
}