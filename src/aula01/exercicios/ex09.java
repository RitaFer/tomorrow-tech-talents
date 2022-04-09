package aula01.exercicios;
import java.util.Scanner;

/*
    Escreva um programa que leia o nome de um aluno e as notas das 3 primeiras provas que ele obteve no semestre.
    No final deverá informar a média do aluno.
 */

public class ex09 {
    public static void main(String[] args) {
        Scanner insertedValue = new Scanner(System.in);
        System.out.print("Insira o nome do aluno: ");
        String name = insertedValue.nextLine();
        System.out.print("Insira a nota da primeira prova: ");
        double a = insertedValue.nextDouble();
        System.out.print("Insira a nota da segunda prova: ");
        double b = insertedValue.nextDouble();
        System.out.print("Insira a nota da terceira prova: ");
        double c = insertedValue.nextDouble();

        double media = (a + b + c) / 3;

        System.out.print("A média final do aluno " + name + " foi de " + media + ".");
    }
}
