package aula03.exercicios;

/*
    Faça um programa que leia um número inteiro diferente de zero e mostre uma mensagem indicando se este número é positivo
ou negativo. Pare a execução do programa quando o usuário requisitar (O programa deve parar quando o usuário escolher 0).
 */

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number;
        do {
            System.out.print("Insira um número qualquer, ou insira 0 para parar a aplicação:");
            number = scanner.nextDouble();
            if (number > 0) {
                System.out.println("Você inseriu um número positivo !");
            } else if(number < 0) {
                System.out.println("Você inseriu um número negativo !");
            } else {
                System.out.println("\nTCHAUUUUUUU !!!!");
                System.exit(0);
            }
        } while (number != 0);
    }
}
