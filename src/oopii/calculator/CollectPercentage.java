package oopii.calculator;

import java.util.Scanner;

public class CollectPercentage {
    double a, b;
    protected void collectInserts(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o primeiro valor: ");
        a = scanner.nextInt();
        System.out.print("Insira o segundo valor: ");
        b = scanner.nextInt();
    }
}