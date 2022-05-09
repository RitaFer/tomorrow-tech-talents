package programminglogic.class04;

/*
Crie um programa que preencha uma matriz de 3x5 com números inteiros. Em seguida faça:
- some cada uma das linhas armazenando o resultado em um vetor;
- some cada uma das colunas armazenando o resultado em um vetor;
- imprima o resultado da soma das linhas;
- imprima o resultado da soma das coluna;
- imprima a matriz completa;
 */

import java.util.Random;

public class ex09 {
    public static void main(String[] args) {
        Integer[][] integers = new Integer[3][5];
        Integer[] sumLine = new Integer[3];
        Integer[] sumColunm = new Integer[5];
        int sum;
        Random random = new Random();

        // Preenche a matriz
        for (int l = 0; l < sumLine.length; l++) {
            for (int c = 0; c < sumColunm.length; c++) {
                integers[l][c] = random.nextInt(100);
            }
        }

        // Soma as Linhas
        for (int l = 0; l < sumLine.length; l++) {
            sum = 0;
            for (int c = 0; c < sumColunm.length; c++) {
                sum += integers[l][c];
            }
            sumLine[l] = sum;
        }

        // Soma as Colunas
        for (int c = 0; c < sumColunm.length; c++) {
            sum = 0;
            for (int l = 0; l < sumLine.length; l++) {
                sum += integers[l][c];
            }
            sumColunm[c] = sum;
        }

        // Resultado da Soma das Linhas
        System.out.println("\n\nVetor com a soma das linhas: \n");
        for (int l = 0; l < sumLine.length; l++) {
            System.out.println("Linha " + l + ": " + sumLine[l]);
        }

        // Resultado da Soma das Colunas
        System.out.println("\n\nVetor com a soma das colunas: \n");
        for (int c = 0; c < sumColunm.length; c++) {
            System.out.println("Coluna " + c + ": " + sumColunm[c]);
        }

        // Imprime Matriz
        System.out.println("\nMATRIZ\n");
        for (Integer[] integer : integers) {
            for (Integer value : integer) {
                System.out.print(value + " ");
            }
            System.out.print("\n");
        }
    }
}
