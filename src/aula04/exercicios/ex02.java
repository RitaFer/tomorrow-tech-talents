package aula04.exercicios;

/*
Escreva um código Java que leia 10 valores double do teclado e armazene-os em uma matriz de dimensões 2x5.
 */

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] xpto = new double[2][5];
        for (int i = 0; i < xpto.length; i++) {
            for (int j = 0; j < xpto[i].length; j++) {
                System.out.println("Insira o " + (j+1) + "º número do " + (i+1) + "º grupo, tipo double: ");
                xpto[i][j] = scanner.nextDouble();
            }
        }
    }
}