package aula03.exercicios;

/*
    Escreva um programa que leia quatro notas escolares de um aluno e apresenta uma mensagem informando
se o aluno foi aprovado caso apresente o valor da média escolar maior ou igual a 7. Caso contrário,
apresente uma mensagem informando que ele está de recuperação.
 */

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double[] grades = new Double[4];
        double sum = 0;
        for (int i = 0; i < 4; i++) {
            System.out.print("Insira a " + (i + 1) + "ª nota do aluno: ");
            grades[i] = scanner.nextDouble();
            sum += grades[i];
        }

        double average = sum / 4;

        if (average >= 7){
            System.out.println("\nAPROVADO!!");
        } else {
            System.out.println("\nDe recuperação!!");
        }
    }
}
