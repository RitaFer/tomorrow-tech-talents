package extras.devdojo;

/*
Aula 30 - Estruturas de Repetição pt 04 - Exercício Break

Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado.
Condição = valor da parcla deve ser >= R$1.000
 */

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Informe o valor do carro: R$ ");
        double value = scanner.nextDouble();
        for(int parcel = 1; parcel <= value; parcel++){
            double parcelValue = value/parcel;
            if(parcelValue >= 1000){
                System.out.println("Número de parcelas: "+parcel+", no valor de R$ "+parcelValue);
            } else{
                break;
            }
        }
    }
}
