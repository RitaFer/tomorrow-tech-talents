package aula06;

/*
Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros,
que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.
 */

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos m2 você deseja pintar? ");
        double area = scanner.nextDouble();
        double numberOfCans = (area / 3) / 18;
        if(numberOfCans % 1 != 0){
            numberOfCans += 1;
        }
        int finalNumber = (int) numberOfCans;
        double valueInk = finalNumber * 80;
        System.out.println(numberOfCans);
        System.out.println("Para pintar "+area+" m2, serão necessários "+finalNumber+" latas de tinta, totalizando R$ "+valueInk);
    }
}