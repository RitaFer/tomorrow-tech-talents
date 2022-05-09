package programminglogic.class04;

/*
Uma loja está levantando o valor total de todas as mercadorias em estoque. Escreva um algoritmo que permita a entrada
das seguintes informações:

a) a quantidade de produtos que irá cadastrar
b) para cada produto:
o nome do produto
o número total de mercadorias no estoque;
o valor unitário da mercadoria.
c) Imprimir o valor total em estoque e a média de valor das mercadorias.
 */

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a quantidade de produtos: ");
        int numberProducts = scanner.nextInt();

        String[] productsName = new String[numberProducts];
        Integer[] stock = new Integer[numberProducts];
        Double[] unitaryValue = new Double[numberProducts];

        for (int i = 0; i < numberProducts; i++) {
            scanner.nextLine();

            System.out.print("Digite o nome do " + (i+1) + "º produto: \n");
            productsName[i] = scanner.nextLine();

            System.out.print("Digite a quantidade do " + (i+1) + "º produto: \n");
            stock[i] = scanner.nextInt();

            System.out.print("Digite o valor unitário do " + (i+1) + "º produto: \n");
            unitaryValue[i] = scanner.nextDouble();
        }

        double totalValueStock = 0;
        int totalValueProducts = 0;
        for (int i = 0; i < numberProducts; i++) {
            totalValueStock += unitaryValue[i] * stock[i];
            totalValueProducts += unitaryValue[i];
        }

        System.out.println("================================================================");
        System.out.println("Valor total das mercadorias: R$ " + totalValueStock);
        System.out.println("Média do valor das mercadorias: R$ " + (totalValueProducts / numberProducts));
        System.out.println("================================================================");
    }
}
