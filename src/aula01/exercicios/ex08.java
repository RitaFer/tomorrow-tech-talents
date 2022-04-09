package aula01.exercicios;
import java.util.Scanner;

/*
Escreva um programa em java para definir o consumo médio de um automóvel
sendo fornecido a distância total percorrida pelo automóvel e o total de combustível gasto (litros).
 */

public class ex08 {
    public static void main(String[] args) {
        Scanner insertedValue = new Scanner(System.in);
        System.out.print("Insira, em km, a distância total percorrida: ");
        double km = insertedValue.nextDouble();
        System.out.print("Insira, em litros, o total gasto de combustível: ");
        double l = insertedValue.nextDouble();

        double consumption = km / l;

        System.out.print("O consumo médio do automóvel foi de: " + consumption + " km/l");
    }
}
