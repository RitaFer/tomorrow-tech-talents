package programminglogic.class04;

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
        int pontos = 0;
        Character[] gabarito = new Character[10];
        Character[] respostas = new Character[10];

        System.out.print("Insira os valores do gabarito: ");
        for (int i = 0; i < gabarito.length; i++) {
            gabarito[i] = scanner.next().charAt(0);
        }

        for (int c = 1; c <= 10; c++){
            System.out.print("Insira as respostas do " + c + "º aluno: ");
            for (int i = 0; i < gabarito.length; i++) {
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
