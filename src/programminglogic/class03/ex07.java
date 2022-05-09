package programminglogic.class03;

/*
Escreva um programa que recebe um número inteiro maior que zero e calcula o seu valor fatorial.
Exemplo: Entrada usuário: 6, saída do programa: 720
Explicação: 6 x 5 x 4 x 3 x 2 x 1 = 720

 */

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, fatorial = 1;

        System.out.println("Digite um nº");
        number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            fatorial = fatorial * i;
        }

        System.out.println("!" + number + " = " + fatorial);
    }
}
