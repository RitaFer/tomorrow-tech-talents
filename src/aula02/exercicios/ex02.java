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
        String name = scanner.nextLine().toUpperCase();
        System.out.print("Insira o seu endereço: ");
        String adress = scanner.nextLine().toUpperCase();
        System.out.print("Insira o seu CEP: ");
        String cep = scanner.nextLine();
        System.out.print("Insira seu número de telefone: ");
        String number = scanner.nextLine();

        System.out.println("Nome: " + name);
        System.out.println("Endereço: " + adress);
        System.out.print("CEP: " + cep + ", e, telefone: " + number);
    }
}
