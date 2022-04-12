package aula02.exercicios;
import java.util.Scanner;

/*
Escreva um programa que seja capaz de receber as seguintes informações e calcular a média da nota de um aluno:
- Nome
- Turma
- Nota 1
- Nota 2
- Nota 3
 */

public class ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o nome do aluno: ");
        String Name = scanner.nextLine();
        System.out.print("Insira a turma do aluno: ");
        String Class = scanner.nextLine();
        System.out.print("Insira a primeira nota do aluno: ");
        String Nota1 = scanner.nextLine();
        System.out.print("Insira o nome do aluno: ");
        String Nota2 = scanner.nextLine();
        System.out.print("Insira o nome do aluno: ");
        String Nota3 = scanner.nextLine();

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
