package programminglogic.class06;

/*
João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. Toda
vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos)
deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a variável peso
(peso de peixes) e calcule o excesso. Gravar na variável excesso a quantidade de quilos além do limite e na variável multa
o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.
 */

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o peso de peixes pescados hoje: ");
        double weight = scanner.nextDouble();
        double excessWeight = 0;
        double tax = 0;
        if(weight > 50){
            excessWeight = weight - 50;
            tax = excessWeight * 4;
            System.out.println("Você excedeu o limite de peso por dia em "+excessWeight+" kg, sua multa é R$ "+tax);
        } else {
            System.out.println("Você está dentro o limite de peso por dia.");
        }
    }
}