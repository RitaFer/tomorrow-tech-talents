package extras.devdojo;

/*
Aula 23 - Estruturas Condicionais pt 04 - Tabela Verdade e exercício

Dado um determinado salário anual, apresentar qual o valor de impostos deverá ser pago.
R$ 0,00 -> 9.70%
R$34.713,00 -> 37.35%
R$68.508,00 -> 49.50%
 */

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Informe qual o seu salário anual: R$ ");
        double wage = scanner.nextDouble();
        double tax = wage*0.0970;
        if(wage >= 34713 && wage < 68508){
            tax = wage*0.3735;
        }else if(wage >= 68508){
            tax = wage*0.4990;
        }
        System.out.println("Recebendo um salário anual de R$ "+wage+" você irá pagar R$ "+tax+" em impostos.");
    }
}