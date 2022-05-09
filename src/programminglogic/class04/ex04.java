package programminglogic.class04;

/*
Crie um método que recebe uma matriz de inteiros e retorna a soma de todos os elementos da matriz.
 */

import java.util.Random;

public class ex04 {
    public static void main(String[] args) {
        Integer[][] integers = new Integer[3][3];
        double sum = 0;
        Random random = new Random();

        for (int i = 0; i < integers.length; i++) {
            for (int j = 0; j < integers[i].length; j++) {
                integers[i][j] = random.nextInt(100);
                sum += integers[i][j];
                System.out.println(integers[i][j]);
            }
        }

        System.out.print("\nA soma é: " + sum + ".\n");
    }
}
