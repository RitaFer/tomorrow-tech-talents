package aula05.exercicios;

/*
Uma loja utiliza o código V para transação à vista e P para transação a prazo. Faça um programa que receba código e
valor de 15 transações usando laços de repetição. Calcule e mostre:
O valor total das compras à vista
O valor total das compras a prazo.
O valor total das compras efetuadas
O valor da primeira prestação das compras a prazo, sabendo-se que essas serão pagas em três vezes
 */

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalValue = 0;
        double totalInCash = 0;
        double totalInstallments = 0;
        double parcel = 0;
        double value = 0;

        for(int i = 0; i < 15; i++){
            System.out.println("Qual o valor da transação? ");
            value = scanner.nextDouble();
            System.out.println("Qual a forma de pagamento? ");
            String payment = scanner.nextLine();
            char pay = payment.toUpperCase().charAt(0);
            totalValue += value;

            if(pay == 'V') {
                totalInCash += value;
            } else if (pay == 'P'){
                totalInstallments += value;
                parcel = value / 3;
                System.out.println("O valor da primeira prestação da compra nº: " + (i+1) + ", paga a prazo é R$ " + parcel);
            }
        }

        System.out.println("O valor total das compras à vista: R$ " + totalInCash);
        System.out.println("O valor total das compras a prazo: R$ " + totalInstallments);
        System.out.println("O valor total das compras efetuadas: R$ " + totalValue);
    }
}
