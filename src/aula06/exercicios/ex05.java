package aula06.exercicios;

/*
Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as
seguintes fórmulas:
Para homens: (72.7*h) - 58
Para mulheres: (62.1*h) - 44.7
 */

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rightWeight = 0;
        double height = 0;
        while(true){
            System.out.print("\nEscolha 1-Mulher, 2-Homem ou 3-Sair. ");
            int option = scanner.nextInt();

            switch (option) {
                case 1 -> {
                    System.out.print("Insira a altura, em metros: ");
                    height = scanner.nextDouble();
                    rightWeight = (int) (62.1 * height) - (int) 44.7;
                    System.out.print("O peso ideal é "+rightWeight+" kg.");
                }
                case 2 -> {
                    System.out.print("Insira a altura, em metros: ");
                    height = scanner.nextDouble();
                    rightWeight = (int) (72.7 * height) - 58;
                    System.out.print("O peso ideal é "+rightWeight+" kg.");
                }
                case 3 -> {
                    System.out.print("Até logo !!");
                    System.exit(0);
                }
                default -> System.out.print("Opção Inválida, tente novamente.");
            }
        }
    }
}
