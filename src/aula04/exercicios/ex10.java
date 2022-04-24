package aula04.exercicios;

/*
Faça a leitura de um valor inteiro. Em seguida, calcule o menor número de notas possíveis (cédulas) onde o valor pode ser decomposto.
As notas que você deve considerar são de 100, 50, 20, 10, 5, 2 e 1.
Na sequência mostra o valor lido e a relação de notas necessárias.
 */

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor, n100 = 0, n50 = 0, n20 = 0, n10 = 0, n5 = 0, n2 = 0, n1 = 1;
        System.out.print("Insira um valor: R$");
        int numberInserted = scanner.nextInt();

        valor = numberInserted;
        n100 = numberInserted / 100;
        numberInserted %= 100;
        n50 = numberInserted / 50;
        numberInserted %= 50;
        n20 = numberInserted / 20;
        numberInserted %= 20;
        n10 = numberInserted / 10;
        numberInserted %= 10;
        n5 = numberInserted / 5;
        numberInserted %= 5;
        n2 = numberInserted / 2;
        numberInserted %= 2;
        n1 = numberInserted;

        System.out.println("\nValor inserido: R$" + valor);
        if(n100 != 0){
            System.out.println(n100 + " nota(s) de R$ 100,00");
        }
        if(n50 != 0){
            System.out.println(n50 + " nota(s) de R$ 50,00");
        }
        if(n20 != 0){
            System.out.println(n20 + " nota(s) de R$ 20,00");
        }
        if(n10 != 0){
            System.out.println(n10 + " nota(s) de R$ 10,00");
        }
        if(n5 != 0){
            System.out.println(n5 + " nota(s) de R$ 5,00");
        }
        if(n2 != 0){
            System.out.println(n2 + " nota(s) de R$ 2,00");
        }
        if(n1 != 0){
            System.out.println(n1 + " nota(s) de R$ 1,00");
        }
    }
}
