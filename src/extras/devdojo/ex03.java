package extras.devdojo;

/*
Aula 26 - Estruturas Condicionais pt 07 - Switch exercício

Dado os valores de 1 a 7, imprima se é dia útil ou final de semana.
Considerando 1 = domingo.
 */

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Insira um valor de 1 a 7: ");
        int insertedNumber = scanner.nextInt();
        switch (insertedNumber) {
            case 1, 7 -> System.out.println("Fim de Semana");
            case 2, 3, 4, 5, 6 -> System.out.println("Dia Útil");
            default -> System.out.println("Opção inválida, tente novamente.");
        }
    }
}