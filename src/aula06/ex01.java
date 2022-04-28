package aula06;

/*
Em uma competição de salto em distância cada atleta tem direito a cinco saltos. No final da série de saltos de cada atleta,
o melhor e o pior resultados são eliminados. O seu resultado fica sendo a média dos três valores restantes. Você deve fazer
um programa que receba o nome e as cinco distâncias alcançadas pelo atleta em seus saltos e depois informe a média dos saltos
conforme a descrição acima informada (retirar o melhor e o pior salto e depois calcular a média). Faça uso de uma lista para
armazenar os saltos. Os saltos são informados na ordem da execução, portanto não são ordenados.

O programa deve ser encerrado quando não for informado o nome do atleta. A saída do programa deve ser conforme o exemplo abaixo:

Atleta: João da Silva

Primeiro Salto: 6.5 m
Segundo Salto: 6.1 m
Terceiro Salto: 6.2 m
Quarto Salto: 5.4 m
Quinto Salto: 5.3 m

Melhor salto: 6.5 m
Pior salto: 5.3 m

Média dos demais saltos: 5.9 m


Resultado final:
Rodrigo Curvêllo: 5.9 m
 */

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] jumps = new double[5];
        double betterJump = 0;
        double worstJump = 100;
        double sumJumps = 0;
        System.out.print("Insira o nome do atleta: ");
        String name = scanner.nextLine();
        for (int i = 0; i < jumps.length; i++){
            System.out.print("Insira a distância do "+(i+1)+"º salto: ");
            jumps[i] = scanner.nextDouble();
            sumJumps += jumps[i];
            if(jumps[i] > betterJump){
                betterJump = jumps[i];
            }
            if(jumps[i] < worstJump){
                worstJump = jumps[i];
            }
        }

        double average = (sumJumps - betterJump - worstJump) / 3;

        System.out.println("\nAtleta: "+name);
        System.out.println("\nPrimeiro Salto: "+jumps[0]+"m");
        System.out.println("Segundo Salto: "+jumps[1]+"m");
        System.out.println("Terceira Salto: "+jumps[2]+"m");
        System.out.println("Quarto Salto: "+jumps[3]+"m");
        System.out.println("Quinto Salto: "+jumps[4]+"m");

        System.out.println("\nMelhor Salto: "+betterJump+"m");
        System.out.println("Pior Salto: "+worstJump+"m");

        System.out.println("\nMédia dos Demais Saltos: "+average+"m");

        System.out.println("\nResultado Final: ");
        System.out.println(name +": "+average+"m");

    }
}
