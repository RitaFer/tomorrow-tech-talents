package programminglogic.class04;

/*
Escreva um programa que leia um vetor de 13 elementos inteiros, que é o Gabarito de um teste da loteria esportiva,
contendo os valores 1 (coluna 1), 2 (coluna 2) e 3 (coluna 3). Leia, a seguir, para cada apostador, o número do seu cartão
e um vetor de Respostas de 13 posições. Verifique para cada apostador o números de acertos, comparando o vetor de
Gabarito com o vetor de Respostas. Escreva o número do apostador e o número de acertos. Se o apostador tiver 13 acertos,
mostrar a mensagem "Ganhador".
 */

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int pontos = 0, cardNumber;
        int[] gabarito = new int[13];
        int[] aposta = new int[13];

        for (int d = 0; d < aposta.length; d++) {
            gabarito[d] = random.nextInt(3) + 1;
        }

        System.out.print("Insira o número do cartão: ");
        cardNumber = scanner.nextInt();

        for (int d = 0; d < aposta.length; d++) {
            System.out.print("Insira o " + (d+1) + "º valor da aposta: ");
            aposta[d] = scanner.nextInt();

            if (Objects.equals(gabarito[d], aposta[d])){
                pontos++;
            }
        }

        if (pontos == 13){
            System.out.print(cardNumber + " Você Ganhou !! Acertou 13 !");
        } else {
            System.out.print(cardNumber + " Você Perdeu !! Você acertou apenas " + pontos + ".");
        }
    }
}
