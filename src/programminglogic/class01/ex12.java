package programminglogic.class01;
import java.util.Scanner;

/*
Faça um programa que receba o preço de custo do produto e exiba o valor de venda.
O valor de venda receberá um acréscimo de acordo com o percentual informado pelo usuário.
 */

public class ex12 {
    public static void main(String[] args) {
        Scanner inserted = new Scanner(System.in);
        System.out.print("Insira o custo do produto: R$ ");
        double cost = inserted.nextDouble();
        System.out.print("Insira o percentual de acréscimo da venda: ");
        double sale = inserted.nextDouble();
        double finalValue = (cost * sale)/100 + cost;

        System.out.print("O valor final do produto com o acréscimo de venda é de: R$" + finalValue + ".");
    }
}
