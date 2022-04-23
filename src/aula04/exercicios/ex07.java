package aula04.exercicios;

/*
Escreva um código que leia um vetor G de 10 elementos do tipo caracter que representa o gabarito de uma prova. A seguir,
para cada um dos 10 alunos da turma, leia o vetor de respostas (R) do aluno e conte o número de acertos. Mostre o número
de acertos do aluno e uma mensagem APROVADO, se a nota for maior ou igual a 6; e mostre uma mensagem de REPROVADO,
caso contrário.
 */

import java.util.Objects;
import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pontos = 0, cardNumber;
        Character[] gabarito = new Character[10];
        Character[] respostas = new Character[10];

        for (int i = 0; i < gabarito.length; i++) {
            System.out.print("Insira o " + (i+1) + "º valor do gabarito: ");
            gabarito[i] = scanner.next().charAt(0);
        }

        for (int c = 1; c <= 10; c++){
            for (int i = 0; i < gabarito.length; i++) {
                System.out.print("Insira a " + (i+1) + "ª resposta do " + c + "º aluno: ");
                respostas[i] = scanner.next().charAt(0);
                if (Objects.equals(gabarito[i], respostas[i])) {
                    pontos++;
                }
            }
            if (pontos >= 6){
                System.out.print("\n" + c + "º aluno foi APROVADO !! Com " + pontos + " acertos.\n\n");
            } else {
                System.out.print("\n" + c + "º aluno foi REPROVADO !! Pois só teve " + pontos + " acertos.\n\n");
            }
        }
    }
}
