package programminglogic.class06;

/*
Foi feita uma estatística em cinco cidades brasileiras para coletar dados sobre acidentes de trânsito. Foram obtidos os
seguintes dados:
Código da cidade;
Número de veículos de passeio (em 2021);
Número de acidentes de trânsito com vítimas (em 2021).

Deseja-se saber:
Qual o maior e menor índice de acidentes de trânsito e a que cidade pertence;
Qual a média de veículos nas cinco cidades juntas;
Qual a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio.
 */

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantas cidades você deseja inserir? ");
        int cityNumber = scanner.nextInt();
        int[][] statistic = new int[cityNumber][3];
        int sumAccidents = 0;
        int sumCities = 0;
        int sumVehicles = 0;
        int cityHigherNumberOfAccidents = 0;
        int cityLowerNumberOfAccidents = 0;
        int higherNumberOfAccidents = 0;
        int lowerNumberOfAccidents = 0;
        for (int i = 0; i < cityNumber; i++){
            System.out.print("Qual o código da cidade? ");
            statistic[i][0] = scanner.nextInt();
            System.out.print("Qual o número de veículos de passeio (em 2021)? ");
            statistic[i][1] = scanner.nextInt();
            System.out.print("Qual o número de acidentes de trânsito com vítimas (em 2021)?");
            statistic[i][2] = scanner.nextInt();

            sumVehicles += statistic[i][1];

            if(statistic[i][1] < 2000){
                sumAccidents += statistic[i][2];
                sumCities ++;
            }
            if(statistic[i][2] > higherNumberOfAccidents){
                higherNumberOfAccidents = statistic[i][2];
                cityHigherNumberOfAccidents = statistic[i][0];
            }

            lowerNumberOfAccidents = statistic[i][2];
            cityLowerNumberOfAccidents = statistic[i][0];

            if(statistic[i][2] < lowerNumberOfAccidents){
                lowerNumberOfAccidents = statistic[i][2];
                cityLowerNumberOfAccidents = statistic[i][0];
            }
        }
        System.out.println("A cidade com maior índice de acidentes de trânsito é "+cityHigherNumberOfAccidents+" com "+higherNumberOfAccidents+" acidentes em 2021.");
        System.out.println("A cidade com menor índice de acidentes de trânsito é "+cityLowerNumberOfAccidents+" com "+lowerNumberOfAccidents+" acidentes em 2021.");
        System.out.println("A média de veículos nas cinco cidades juntas é "+(sumVehicles/5));
        System.out.println("A média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio é "+(sumAccidents/sumCities));
    }
}