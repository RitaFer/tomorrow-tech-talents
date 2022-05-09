package programminglogic.class06;

/*
Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros,
que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00. Informe ao usuário as quantidades de tinta a serem
compradas e os respectivos preços em 2 situações:
comprar apenas latas de 18 litros;
comprar apenas galões de 3,6 litros;
 */

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos m2 você deseja pintar? ");
        double area = scanner.nextDouble();

        //Galão de 18L
        double numberOfCans18 = (area / 3) / 18;
        int finalNumber18 = 0;
        if(numberOfCans18 % 1 != 0){
            finalNumber18 = (int) numberOfCans18 + 1;
        }
        double valueInk18 = finalNumber18 * 80;

        //Galão de 3,6L
        double numberOfCans3 = (area / 3) / 3.6;
        int finalNumber3 = 0;
        if(numberOfCans3 % 1 != 0){
            finalNumber3 = (int) numberOfCans3 + 1;
        }
        double valueInk3 = finalNumber3 * 25;

        System.out.println("Para pintar "+area+" m2, serão necessários: ");
        System.out.println("Situação 1: "+finalNumber18+" latas de tinta, totalizando R$ "+valueInk18);
        System.out.println("Situação 2: "+finalNumber3+" latas de tinta, totalizando R$ "+valueInk3);
    }
}
