package programminglogic.class05;

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
        char pay = 'S';
        double parcel = 0;
        double value = 0;

        for(int i = 0; i < 15; i++){
            System.out.print("Qual o valor da " + (i+1) + "ª transação? R$ ");
            value = scanner.nextDouble();

            while(true) {
                System.out.print("Qual a forma de pagamento? ");
                pay = scanner.next().toUpperCase().charAt(0);
                if(pay == 'V' || pay == 'P'){
                    totalValue += value;
                    break;
                }
                System.out.println("Opção inválida !! Favor, tente novamente.");
            }

            if(pay == 'V') {
                totalInCash += value;
            } else {
                totalInstallments += value;
            }
        }

        parcel = totalInstallments / 3;

        System.out.println("O valor total das compras à vista: R$ " + totalInCash);
        System.out.println("O valor total das compras à prazo: R$ " + totalInstallments);
        System.out.println("O valor total das compras efetuadas: R$ " + totalValue);
        System.out.println("O valor da primeira prestação das compras pagas à prazo é R$ " + parcel);
    }
}
