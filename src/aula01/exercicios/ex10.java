package aula01.exercicios;
import java.util.Scanner;

/*
Crie um programa que receba um valor que foi depositado e logo em seguida o valor com rendimento após 1 mês.
Considere a taxa de juros da poupança em 0,70% a.m.
 */

public class ex10 {
    public static void main(String[] args) {
        Scanner inserted = new Scanner(System.in);
        System.out.print("Insira o valor depositado: R$ ");
        double value = inserted.nextDouble();
        double readjustment = (value * 0.7) / 100;
        double finalValue = value + readjustment;

        System.out.print("O rendimento do valor depositado após 1 mês é de: R$" + finalValue + ".");
    }
}
