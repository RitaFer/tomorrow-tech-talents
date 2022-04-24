package aula04.exercicios;

/*
Um posto está vendendo combustíveis com a seguinte tabela de descontos:

Álcool
- até 20 litros, desconto de 3% por litro
- acima de 20 litros, desconto de 5% por litro

Gasolina
- até 20 litros, desconto de 4% por litro
- acima de 20 litros, desconto de 6% por litro


Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível (codificado da seguinte forma:
A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é
R$ 7,59 e o preço do litro do álcool é R$ 5,20.
 */

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double wage = 2000;
        double commission;
        System.out.println("Insira o tipo de combustível: (A ou G)");
        String type = scanner.nextLine();

        if (!type.equalsIgnoreCase("a") && !type.equalsIgnoreCase("g")) {
            System.out.println("Valor inválido, favor insira a opção novamente: ");
            type = scanner.nextLine();
        }
        
        System.out.println("Insira a quantidade de combustível: ");
        double l = scanner.nextDouble();

        if(type.equalsIgnoreCase("a")){
            double total = (l * 5.20);
            if (l <= 20){
                double discount = (total * 3d)/100;
                System.out.println("Valor a ser pago é R$ " + (total-discount));
            } else {
                double discount = (total * 5d)/100;
                System.out.println("Valor a ser pago é R$ " + (total-discount));
            }
        } else if (type.equalsIgnoreCase("g")) {
            double total = (l * 7.59);
            if (l <= 20){
                double discount = (total * 4d)/100;
                System.out.println("Valor a ser pago é R$ " + (total-discount));
            } else {
                double discount = (total * 6d)/100;
                System.out.println("Valor a ser pago é R$ " + (total-discount));
            }
        }
    }
}
