package oopii.calculator;

import java.util.Scanner;

public class CollectGeneral {
    int values;
    double[] numbers;
    protected void collectInserts(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos valores você deseja calcular? ");
        values = scanner.nextInt();
        numbers = new double [values];
        for(int i=0; i<numbers.length; i++){
            System.out.print("Insira o "+(i+1)+"º valor: ");
            numbers[i] = scanner.nextDouble();
        }
    }
}