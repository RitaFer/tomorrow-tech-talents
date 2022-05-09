package programminglogic.class02;

/*
Um hotel quer fazer um levantamento das praias da cidade para uma
programação turística. Sabendo-se que cada praia tem um nome e uma
distância (em Km) do hotel, escreva um programa que forneça os
seguintes dados:

- O nome da praia mais distante.
- Quantas praias estão a mais de 10km e a menos de 15km.
- A distância média das praias.

// Para cada praia deverá ser informado seu nome e a distância em Km
do hotel.

Você deve receber 5 praias;
Você deve armazenar o nome das 5 praias em um array;
 */

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] beach = new String[5];
        Double[] distance = new Double[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("Insira o nome da %dª praia: ", (i+1));
            beach[i] = sc.nextLine();
            System.out.printf("insira a distância da %dª praia: ",(i+1));
            distance[i] = sc.nextDouble();
            sc.nextLine();
        }

        String[] beachCondition = new String[5];
        String greaterBeachDistanceName = "";
        double greaterBeachDistance = 0;
        double sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += distance[i];

            if (distance[i] > 10 && distance[i] < 15){
                System.out.print(beach[i] + ", está a mais de 10km e a menos de 15km.\n");
            }

            if (distance[i] > greaterBeachDistance){
                greaterBeachDistance = distance[i];
                greaterBeachDistanceName = beach[i];
            }
        }

        double average = sum / beach.length;

        System.out.print("A praia mais distante é, " +  greaterBeachDistanceName + ", " + greaterBeachDistance + "km distante.\n");
        System.out.print("A média de distância entre as praias é " + average + "km.");
    }
}
