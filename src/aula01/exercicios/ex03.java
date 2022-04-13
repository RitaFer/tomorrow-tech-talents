package aula01.exercicios;
import java.lang.Math;
import java.util.Scanner;

/* Escreva um programa que realize o cálculo do empréstimo a juros compostos. Onde definimos:
    - o valor da variável de quanto a pessoa quer emprestado;
    - em quantos meses ela irá pagar
    A taxa de juros será de 2% ao mês
                    Fórmula: M = C * (1+i)^t
        M = valor final após a aplicação dos juros
        C = valor que a pessoa vai pegar emprestado
        i é a taxa de juros
        t é o tempo
    - Deverá exibir quanto a pessoa irá pagar após a aplicação dos juros
*/

public class ex03 {
    public static void main(String[] args) {
        Scanner inserted = new Scanner(System.in);
        System.out.print("Insira o valor a ser emprestado: R$");
        double c = inserted.nextDouble();
        System.out.print("Insira em quantos meses deseja pagar: ");
        double t = inserted.nextDouble();
        double i = 2 / 100d;

        double finalValue = c * Math.pow(1 + i, t);
        System.out.print("O valor total pago ao final de " + t + " meses é de R$ " + finalValue);
    }
}
