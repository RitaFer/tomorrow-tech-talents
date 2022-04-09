package aula01.exercicios;
import java.util.Scanner;

/*
    Crie um algoritmo que realize a conversão do valor em real para as seguintes moedas:
    - Dólar
    - Euro
    - Libra
 */

public class ex06 {
    public static void main(String[] args) {
        Scanner insertedValue = new Scanner(System.in);
        System.out.print("Digite o valor, em reais: R$ ");
        double Dolar, Euro, Libra;
        double Real = insertedValue.nextDouble();

        Dolar = Real * 4.70;
        Euro = Real * 5.11;
        Libra = Real * 6.13;

        System.out.print("O valor inserido em Real: " + Real + ", com o câmbio é:");
        System.out.print("\n - Dólar: " + Dolar + ",");
        System.out.print("\n - Euro: " + Euro + ",");
        System.out.print("\n - Libra: " + Libra);
    }
}