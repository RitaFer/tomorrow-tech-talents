package programminglogic.class01;
import java.util.Scanner;

/*
Escreva um programa para determinar a quantidade de cavalos para se levantar uma massa de “m” quilogramas
a uma altura de “h” em “t” segundos.
    Considere cavalos = (m * h / t ) / 745,6999
 */

public class ex02 {
    public static void main(String[] args) {
        Scanner inserted = new Scanner(System.in);
        System.out.print("Insira o peso, em kg, a ser levantado: ");
        double m = inserted.nextDouble();
        System.out.print("Insira a altura, em metros: ");
        double h = inserted.nextDouble();
        System.out.print("Insira o tempo, em segundos, a ser concluido o trabalho: ");
        double t = inserted.nextDouble();

        double cavalos = m * h / t * 745.6999;

        System.out.print("Para concluir o trabalho com as informações apresentadas, serão necessários: " + cavalos + " cavalos");
    }
}
