package aula04.exercicios;

/*
Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que ele recebe uma comissão
de 3% sobre o total das vendas até R$1.500,00 mais 5% sobre o que ultrapassar este valor, calcular e escrever o seu salário total.
 */

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double wage = 2000;
        double commission;
        System.out.println("Insira o valor total das vendas realizadas no mês: R$ ");
        int sale = scanner.nextInt();

        if(sale <= 1500) {
            commission = (sale * 3d)/100;
        } else {
            commission = (sale * 5d)/100;
        }

        System.out.println("O salário total do vendedor é R$ " + (wage + commission));
    }
}
