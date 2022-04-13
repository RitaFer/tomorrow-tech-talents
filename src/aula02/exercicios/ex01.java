package aula02.exercicios;
import java.util.Scanner;

/*
Escreva um programa que seja capaz de receber as seguintes informações e calcular a média da nota de um aluno:
- Nome
- Turma
- Nota 1
- Nota 2
- Nota 3
 */

public class ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o nome do aluno: ");
        String Name = scanner.nextLine();
        System.out.print("Insira a turma do aluno: ");
        String Class = scanner.nextLine();
        System.out.print("Insira a primeira nota do aluno: ");
        Double Grade1 = scanner.nextDouble();
        System.out.print("Insira a segunda nota do aluno: ");
        Double Grade2 = scanner.nextDouble();
        System.out.print("Insira a terceira nota do aluno: ");
        Double Grade3= scanner.nextDouble();

        Double Average = (Grade1 + Grade2 + Grade3) / 3;

        System.out.print("A média " + Name + ", é " + Average);
    }
}
