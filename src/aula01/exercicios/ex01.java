package aula01.exercicios;
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
        double Celsius, Fahrenheit, Kelvin, Rankine, Reaumur;
        Celsius = insertedTemperature.nextDouble();

        Fahrenheit = Celsius * 1.8 + 32;
        Kelvin = Celsius * 273.15;
        Rankine = Celsius * 1.8 + 32 + 459.67 ;
        Reaumur = Celsius * 0.8;

        System.out.print("A temperatura de " + Celsius + "ºC inserida, quando convertida é:");
        System.out.print("\n - Fahrenheit: " + Fahrenheit + "ºF,");
        System.out.print("\n - Kelvin: " + Kelvin + "K,");
        System.out.print("\n - Rankine: " + Rankine + "ºRa,");
        System.out.print("\n - Réaumur: " + Reaumur + "ºRe.");
    }
}
