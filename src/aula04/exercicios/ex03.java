package aula04.exercicios;

/*
Crie um método que recebe uma matriz bidimensional double e retorna o maior valor da matriz.
 */

import java.util.Random;

public class ex03 {
    public static void main(String[] args) {
        double[][] matriz = new double[3][3];
        Random random = new Random();

        double biggerNumber = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextDouble(100);
                if (matriz[i][j] > biggerNumber) {
                    biggerNumber = matriz[i][j];
                }
                System.out.println(matriz[i][j]);
            }
        }

        System.out.print("\nO maior número é: " + biggerNumber + ".\n");
    }
}
