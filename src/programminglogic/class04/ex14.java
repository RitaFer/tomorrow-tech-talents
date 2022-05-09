package programminglogic.class04;

/*
Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres (considere que as idades dos homens serão sempre
diferentes entre si, bem como as das mulheres).
Calcule e escreva a soma das idades do homem mais velho com a mulher mais nova, e o produto das idades do homem mais
novo com a mulher mais velha.
 */

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] ages = new int[2][2];
        int olderM, olderW, youngestM, youngestW;

        for (int l = 0; l < ages.length; l++) {
            if (l == 0){
                System.out.println("Digite a duas idades diferentes de dois homens: ");
            } else {
                System.out.println("Digite a duas idades diferentes de duas mulheres: ");
            }
            for (int c = 0; c < ages[l].length; c++) {
                System.out.printf("%dº idade: ", (c + 1));
                ages[l][c] = scanner.nextInt();
            }
        }

        if (ages[0][0] > ages[0][1]){
            olderM = ages[0][0];
            youngestM = ages[0][1];
        } else {
            olderM = ages[0][1];
            youngestM = ages[0][0];
        }

        if (ages[0][0] > ages[0][1]){
            olderW= ages[1][0];
            youngestW = ages[1][1];
        } else {
            olderW = ages[1][1];
            youngestW = ages[1][0];
        }

        System.out.println("A soma das idades do homem mais velho com a mulher mais nova é " + (olderM + youngestW));
        System.out.println("O produto das idades do homem mais novo com a mulher mais velha é " + (youngestM * olderW));
    }
}
