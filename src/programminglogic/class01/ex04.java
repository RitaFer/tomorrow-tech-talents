package programminglogic.class01;
import java.util.Scanner;

/*
    Crie um programa que você atribua um valor da idade de uma pessoa e calcule quantos dias aquela pessoa já viveu.
 */

public class ex04 {
    public static void main(String[] args) {
        Scanner inserted = new Scanner(System.in);
        System.out.print("Insira a sua idade, em anos: ");
        int age = inserted.nextInt();

        int ageInDays = age * 365;

        System.out.print("Parabéns !!! Você viveu aproximadamente " + ageInDays + " dias.");
    }
}
