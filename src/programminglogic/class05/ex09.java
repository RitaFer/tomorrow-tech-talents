package programminglogic.class05;

/*
Faça um programa que apresente o menu de opções a seguir:
Menu de opções:
	1. Média aritmética
	2. Média ponderada
Digite a opção desejada:
	Na opção 1: receber duas notas, calcular e mostrar a média aritmética.
	Na opção 2: receber três notas e seus respectivos pesos, calcular e mostrar a média ponderada.
Verifique a possibilidade de opção inválida, mostrando uma mensagem.
 */

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=============================================================\n");
        System.out.println("Escolha uma opção de cálculo:");
        System.out.println("1. Média Aritmética");
        System.out.println("2. Média Ponderada");
        System.out.println("\n=============================================================");
        int option = scanner.nextInt();

        while (option != 1 && option != 2) {
            System.out.println("Opção inválida, por favor, escolha 1 ou 2:");
            option = scanner.nextInt();
        }

        if(option == 1){
            System.out.print("Insira a primeira nota: ");
            double firstNote = scanner.nextDouble();
            System.out.print("Insira a segunda nota: ");
            double secondNote = scanner.nextDouble();

            System.out.println("\nA média aritmética dos valores " + firstNote + " e " + secondNote + " é: " + ((firstNote + secondNote)/2));
        } else {
            double sumNotes = 0, sumWeight = 0;
            for (int i = 0; i < 3; i++){
                System.out.print("Insira a " + (i+1) + "ª nota: ");
                double note = scanner.nextDouble();
                System.out.print("Insira o peso da " + (i+1) + "ª nota: ");
                double weight = scanner.nextDouble();

                sumNotes += (note*weight);
                sumWeight += weight;
            }

            System.out.println("\bA média ponderada dos valores inseridos é: " + sumNotes / sumWeight);
        }
    }
}
