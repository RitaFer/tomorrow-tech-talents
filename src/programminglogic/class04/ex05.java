package programminglogic.class04;

/*
Crie um método que recebe uma matriz bidimensional inteira e um inteiro que indica uma de suas linhas,
e retorna a média dos valores daquela linha
 */

import java.util.Random;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Integer[][] integers = new Integer[3][3];
        int sum = 0;
        int numberInserted;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        System.out.print("Insira qual linha deseja obter a média: (1 a 3)");
        numberInserted = scanner.nextInt() - 1;

        while (numberInserted < 0 || numberInserted > 2) {
            System.out.print("Por favor, insira um número entre 1 e 3.");
            numberInserted = scanner.nextInt() - 1;
        }

        for (int j = 0; j < integers[numberInserted].length; j++) {
            integers[numberInserted][j] = random.nextInt(100);
            sum += integers[numberInserted][j];
            System.out.println(integers[numberInserted][j]);
        }

        int media = sum / 3;

        System.out.print("\nA média da " + (numberInserted+1) + "ª linha é igual a " + media + ".\n");
    }
}
