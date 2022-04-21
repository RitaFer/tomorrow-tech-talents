package aula04.exercicios;

/*
Escreva um código para armazenar 10 valores aleatórios até o número 100 do tipo double em um array;
 */

import java.util.Random;

public class ex01 {
    public static void main(String[] args) {
        double[] array = new double[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextDouble(100);
        }
    }
}
