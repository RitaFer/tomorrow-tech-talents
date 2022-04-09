package aula01.exercicios;
import java.util.Scanner;

/*
Escreva um programa para calcular a quantidade de ferraduras necessárias para equipar todos os cavalos comprados para um haras.
A informação de cavalos comprados deve ser informada pelo usuário.
 */

public class ex15 {
    public static void main(String[] args) {
        Scanner inserted = new Scanner(System.in);
        System.out.print("Insira o número de cavalos adquiridos: ");
        int horses = inserted.nextInt();

        int horseshoe = horses * 4;

        System.out.print("A quantidade de ferraduras necessárias para equipar os novos cavalos é " + horseshoe + ".");
    }
}
