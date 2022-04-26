package aula05.exercicios;

/*
Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
“Telefonou para a vítima? “
“Esteve no local do crime?”
“Mora perto da vítima? “
“Devia para a vítima? “
“Já trabalhou com a vítima? “
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como “Suspeita”, entre 3 e 4 como “Cúmplice”
e 5 como “Assassino”. Caso contrário, ela será classificada como “Inocente”.
 */

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int[] answer = new int [5];
        int totalAnswers = 0;
        System.out.print("Telefonou para a vítima? (1 - SIM / 0 - NÃO)");
        answer[0] = scanner.nextInt();
        System.out.println("Esteve no local do crime? (1 - SIM / 0 - NÃO)");
        answer[1] = scanner.nextInt();
        System.out.println("Mora perto da vítima? (1 - SIM / 0 - NÃO)");
        answer[2] = scanner.nextInt();
        System.out.println("Devia para a vítima? (1 - SIM / 0 - NÃO)");
        answer[3] = scanner.nextInt();
        System.out.println("Já trabalhou com a vítima? (1 - SIM / 0 - NÃO)");
        answer[4] = scanner.nextInt();

        for (int value : answer) {
            totalAnswers += value;
        }

        if(totalAnswers == 2){
            System.out.println("SUSPEITA");
        } else if(totalAnswers > 2 && totalAnswers <= 4){
            System.out.println("CÚMPLICE");
        } else if(totalAnswers == 5){
            System.out.println("ASSASSINO");
        } else {
            System.out.println("INOCENTE");
        }

    }
}
