package oopii.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sum sum = new Sum();
        Subtraction sub = new Subtraction();
        Multiplication mult = new Multiplication();
        Division div = new Division();
        Root root = new Root();
        PercentageBetweenValues percentageBetweenValues = new PercentageBetweenValues();
        PercentageOfValue percentageOfValue = new PercentageOfValue();
        while (true) {
            System.out.println("--------------CALCULADORA--------------");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Raiz");
            System.out.println("6 - Porcentagem de um valor (ex: 20% de 100 = 20)");
            System.out.println("7 - Porcentagem entre valores (ex: 10 de 100 = 10%)");
            System.out.println("0 - Sair");
            System.out.println("----------------------------------------");
            int option = scanner.nextInt();
            switch (option) {
                case 0 -> {
                    System.out.println("\nAté logo !!!");
                    System.exit(0);
                }
                case 1 -> {
                    sum.calculate();
                }
                case 2 -> {
                    sub.calculate();
                }
                case 3 -> {
                    mult.calculate();
                }
                case 4 -> {
                    div.calculate();
                }
                case 5 -> {
                    root.calculate();
                }
                case 6 -> {
                    percentageOfValue.calculate();
                }
                case 7 -> {
                    percentageBetweenValues.calculate();
                }
                default -> System.out.println("\nOpção Inválida, por favor tente novamente.");
            }
        }
    }
}