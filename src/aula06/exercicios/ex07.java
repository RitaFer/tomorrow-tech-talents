package aula06.exercicios;

/*
Faça um programa que carregue uma lista com os modelos de cinco carros (exemplo de modelos: FUSCA, GOL, VECTRA etc).
Carregue uma outra lista com o consumo desses carros, isto é, quantos quilômetros cada um desses carros faz com um litro
de combustível. Calcule e mostre:
- O modelo do carro mais econômico;
- Quantos litros de combustível cada um dos carros cadastrados consome para percorrer uma distância de 1000 quilômetros e
quanto isto custará, considerando um que a gasolina custe R$ 7,25 o litro.

Abaixo segue uma tela de exemplo. A disposição das informações deve ser o mais próxima possível ao exemplo. Os dados são
fictícios e podem mudar a cada execução do programa.
 */

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] carType = new String[5];
        double[] carConsuption = new double[5];
        double[] carConditional = new double[5];
        double[] carConditionalValue = new double[5];
        double moreEconomicalValue = 0;
        String moreEconomicalName = null;

        System.out.println("Comparativo de consumo de combustível\n");
        for(int vehiclesIndex=0; vehiclesIndex<carType.length; vehiclesIndex++){
            System.out.println("Veículo "+(vehiclesIndex+1));
            System.out.print("Nome: ");
            carType[vehiclesIndex] = scanner.nextLine();
            System.out.print("Km por litro: ");
            carConsuption[vehiclesIndex] = scanner.nextDouble();
            if(carConsuption[vehiclesIndex] > moreEconomicalValue){
                moreEconomicalName = carType[vehiclesIndex];
                moreEconomicalValue = carConsuption[vehiclesIndex];
            }
            carConditional[vehiclesIndex] = 1000/carConsuption[vehiclesIndex];
            carConditionalValue[vehiclesIndex] = carConditional[vehiclesIndex]*7.25;
            scanner.nextLine();
        }

        System.out.println("Relatório Final\n");
        for(int resultIndex=0; resultIndex<carType.length; resultIndex++){
            System.out.println((resultIndex+1)+" - "+carType[resultIndex]+" - "+carConsuption[resultIndex]+" km/l - "+carConditional[resultIndex]+" litros - R$"+carConditionalValue[resultIndex]);
        }
        System.out.println("O menor consumo é o "+moreEconomicalName+", fazendo "+moreEconomicalValue+" km/l.");
    }
}
