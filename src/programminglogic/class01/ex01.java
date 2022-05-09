package programminglogic.class01;
import java.util.Scanner;

/*
Escreva um programa que com base em uma temperatura em graus celsius, realize a conversão e,
exiba os resultados conforme as fórmulas abaixo:
    K = Celsius + 273.15;
    F = Celsius * 1.8 + 32;
    Ra = Celsius * 1.8 + 32 + 459.67
    Re = Celsius * 0.8;
*/

public class ex01 {
    public static void main(String[] args) {
        Scanner insertedTemperature = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius, fahrenheit, kelvin, rankine, reaumur;
        celsius = insertedTemperature.nextDouble();

        fahrenheit = celsius * 1.8 + 32;
        kelvin = celsius * 273.15;
        rankine = celsius * 1.8 + 32 + 459.67 ;
        reaumur = celsius * 0.8;

        System.out.print("A temperatura de " + celsius + "ºC inserida, quando convertida é:");
        System.out.print("\n - Fahrenheit: " + fahrenheit + "ºF,");
        System.out.print("\n - Kelvin: " + kelvin + "K,");
        System.out.print("\n - Rankine: " + rankine + "ºRa,");
        System.out.print("\n - Réaumur: " + reaumur + "ºRe.");
    }
}
