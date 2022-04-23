package aula04.exercicios;

/*
Escreva um programa que leia um vetor de 13 elementos inteiros, que é o Gabarito de um teste da loteria esportiva,
contendo os valores 1 (coluna 1), 2 (coluna 2) e 3 (coluna 3). Leia, a seguir, para cada apostador, o número do seu cartão
e um vetor de Respostas de 13 posições. Verifique para cada apostador o números de acertos, comparando o vetor de
Gabarito com o vetor de Respostas. Escreva o número do apostador e o número de acertos. Se o apostador tiver 13 acertos,
mostrar a mensagem "Ganhador".
 */

import java.util.Objects;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pontos = 0, cardNumber;
        Integer[] gabarito = new Integer[13];
        Integer[] aposta = new Integer[13];

        for (int i = 0; i < gabarito.length; i++) {
            System.out.print("Insira os valores do gabarito: ");
            gabarito[i] = scanner.nextInt();
        }

        System.out.print("Insira o número do cartão: ");
        cardNumber = scanner.nextInt();

        for (int d = 0; d < aposta.length; d++) {
            System.out.print("Insira os valores da aposta: ");
            aposta[d] = scanner.nextInt();

            if (Objects.equals(gabarito[d], aposta[d])){
                pontos++;
            }
        }

        if (pontos == 13){
            System.out.print("Você Ganhou !! Acertou 13 !");
        } else {
            System.out.print("Você Perdeu !! Você acertou apenas " + pontos + ".");
        }
    }
}
