package aula02.exercicios;

/*
Elabore um programa que escreve seu nome completo na primeira linha,
seu endereço na segunda, e o CEP e telefone na terceira.
 */

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira seu nome completo: ");
        String Name = scanner.nextLine().toUpperCase();
        System.out.print("Insira o seu endereço: ");
        String Adress = scanner.nextLine().toUpperCase();
        System.out.print("Insira o seu CEP: ");
        String CEP = scanner.nextLine();
        System.out.print("Insira seu número de telefone: ");
        String Number = scanner.nextLine();

        System.out.println("Nome: " + Name);
        System.out.println("Endereço: " + Adress);
        System.out.print("CEP: " + Name + ", e, telefone: " + Number);
    }
}
