package programminglogic.class02;


/*
Escreva um programa para calcular a quantidade de litros de combustível necessária para se fazer uma viagem, sabendo-se
que o carro faz 12 Km com um litro. Deverão ser fornecidos o tempo gasto na viagem e a velocidade média.

utilizar as seguintes fórmulas:
distância = tempo x velocidade
litros usados = distância / 12
 */

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quanto tempo, em horas, durou a viagem? (ex: 2,5h = 2h e 30min) ");
        double time = scanner.nextDouble();
        System.out.print("Qual foi a velocidade média, em km/h, durante a viagem? ");
        double speed = scanner.nextDouble();

        double distance = time * speed;
        double fuel = distance / 12;

        System.out.println("\nFoi gasto nessa viagem: " + fuel + " L de combustível.");
    }
}
