package aula03.exercicios;

/*
    Escreva um programa que receba dois números inteiros e imprima os números inteiros que estão no intervalo
compreendido entre eles.
 */

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Insira o primeiro valor: ");
        int a = scanner.nextInt();
        System.out.printf("Insira o segundo valor: ");
        int b = scanner.nextInt();

        if (a > b) {
            for (int i = b+1; i < a; i++){
                System.out.print(i + ", ");
            }
        } else if (a < b) {
            for (int i = a+1; i < b; i++){
                System.out.print(i + ", ");
            }
        } else {
            System.out.print("Você inseriu dois números iguais !!");
        }
    }
}
