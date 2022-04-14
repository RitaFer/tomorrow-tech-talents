package aula03.exercicios;

/*
    Escreva um programa que receba o peso e a altura de uma pessoa e calcule o seu IMC, o resultado irá dizer se a pessoa
está: abaixo do peso (IMC inferior a 18,5), com peso normal (IMC entre 18,5 a 24,9), com excesso de peso
(IMC entre 25,0 a 29,9) ou obesa (30 ou mais de IMC), informe cada um deles com uma mensagem.

Use a fórmula: IMC = Peso ÷ (Altura × Altura)
 */

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira a sua altura, em metros: (ex: 1,62) ");
        double height = scanner.nextDouble();
        System.out.print("Insira seu peso, em kg: (ex: ) ");
        double weight = scanner.nextDouble();

        double imc = weight / (height * height);

        if (imc < 18.5) {
            System.out.print("Magrão!! Você está abaixo do peso, pode comer mais!!");
        } else if (imc >= 18.5 && imc <= 24.9){
            System.out.print("Uia !! Tá fitness ein?!!");
        } else {
            System.out.print("Ixe, seria bom uma dietinha!!");
        }
    }

}
