package aula05.exercicios;

/*
Para doar sangue é necessário ter entre 18 e 67 anos. Faça um aplicativo que pergunte a idade de uma pessoa e diga se
ela pode doar sangue ou não. Use alguns dos operadores lógicos OU (||) e E (&&).
 */

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a sua idade?");
        int age = scanner.nextInt();

        if(age >= 18 && age <= 67){
            System.out.println("Parabéns!! Você pode doar sangue :)");
        } else{
            System.out.println("Infelizmente, você não está dentro do intervalo permitido para doação.");
        }
    }
}
