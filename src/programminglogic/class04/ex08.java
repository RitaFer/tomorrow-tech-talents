package programminglogic.class04;

/*
Faça um programa para receber um conjunto de 10 valores até 100, e insira em uma matriz, em seguida você deverá receber
um outro valor e verificar se o elemento existe no conjunto de 10 valores da matriz. Caso exista você deve imprimir uma
mensagem: "O valor existe no conjunto", caso contrário deverá exibir: "O valor não existe no conjunto"
 */

import java.util.Random;
import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] conjunto  = new Integer[10];
        Random random = new Random();

        System.out.print("Insira um valor: ");
        int numberInserted = scanner.nextInt();

        for (int i = 0; i < conjunto.length; i++) {
            conjunto[i] = random.nextInt(100);
            if(conjunto[i] == numberInserted) {
                System.out.print("O valor " + numberInserted + " existe no conjunto.");
                System.exit(0);
            }
        }

        System.out.print("O valor " + numberInserted + " não existe no conjunto.");
    }
}
