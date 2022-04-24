package aula04.exercicios;

/*
Escreva um algoritmo que permita a leitura dos nomes de 10 pessoas e armazenar os nomes lidos em um vetor. Após isto,
o algoritmo deve permitir a leitura de mais 1 nome qualquer de pessoa e depois escrever a mensagem ACHEI, se o nome
estiver entre os 10 nomes lidos anteriormente (guardados no vetor), ou NÃO ACHEI caso contrário
 */

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names  = new String[10];

        for (int i = 0; i < names.length; i++) {
            System.out.print("Insira o " + (i+1) + "º nome: ");
            names[i] = scanner.nextLine().toUpperCase();
        }

        System.out.print("Insira o nome que deseja localizar: ");
        String nameInserted = scanner.nextLine().toUpperCase();

        for (String name : names) {
            if (Objects.equals(name, nameInserted)) {
                System.out.print("ACHEI !");
                System.exit(0);
            }
        }
        System.out.print("NÃO ACHEI !");
    }
}
