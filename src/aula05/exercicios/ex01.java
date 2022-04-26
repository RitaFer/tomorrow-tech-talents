package aula05.exercicios;

/*
Calcular a quantidade de dinheiro gasta por um fumante.
Dados: o número de anos que ele fuma, o nº de cigarros fumados por dia e o preço de uma carteira com 20 cigarros.
 */

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Há quantos anos você fuma? ");
        int years = scanner.nextInt();
        System.out.println("Quantos cigarros por dia você consome? ");
        int cigarettesDay = scanner.nextInt();
        System.out.print("Insira o preço do maço, com 20 cigarros, R$ ");
        double value = scanner.nextDouble();

        double totalValue = (years * 365) * cigarettesDay * (value / 20);

        System.out.println("Você já gastou, aproximadamente, R$ " + totalValue + ", com cigarros.");
    }
}
