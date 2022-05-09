package programminglogic.class01;
import java.util.Scanner;

/*
O custo ao consumidor de um carro novo é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos.
    Supondo que a porcentagem do distribuidor seja de 28% e os impostos de 45%.
Escreva um programa que leia o custo de fábrica e informe o custo ao consumidor final.
*/

public class ex13 {
    public static void main(String[] args) {
        Scanner inserted = new Scanner(System.in);
        System.out.print("Insira o custo de fábrica do automóvel: R$ ");
        double cost = inserted.nextDouble();
        double taxes = (cost * 45)/100;
        double distributor = (cost * 28)/100;
        double finalValue = cost + taxes + distributor;

        System.out.print("O valor final do automóvel para o consumidor final é de: R$" + finalValue + ".");
    }
}
