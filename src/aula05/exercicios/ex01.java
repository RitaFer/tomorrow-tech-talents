package aula05.exercicios;

/*
Calcular a quantidade de dinheiro gasta por um fumante.
Dados: o número de anos que ele fuma, o nº de cigarros fumados por dia e o preço de uma carteira com 20 cigarros.
 */

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Há quantos anos você fuma? ");
        int daysOfUse = scanner.nextInt()*365;
        System.out.print("Quantos cigarros por dia você consome? ");
        int cigarettesDay = scanner.nextInt();
        System.out.print("Insira o preço do maço, com 20 cigarros, R$ ");
        double valuePerCigarette = scanner.nextDouble()/20;

        double totalValue = daysOfUse * cigarettesDay * valuePerCigarette;

        System.out.print("\nVocê já gastou, aproximadamente, R$ " + totalValue + ", com cigarros.");
    }
}
