package programminglogic.class01;
import java.util.Scanner;

/*
Uma loja está vendendo seus produtos em 5 prestações sem juros.
Faça um programa que insira o valor total de uma compra e o valor das prestações.
 */

public class ex11 {
    public static void main(String[] args) {
        Scanner insertedPrice = new Scanner(System.in);
        System.out.print("Insira o valor do produto: R$ ");
        double price = insertedPrice.nextDouble();
        double parcel = price / 5;

        System.out.print("O produto será pago em 5 parcelas, sem juros, de: R$ " + parcel + ".");
    }
}
