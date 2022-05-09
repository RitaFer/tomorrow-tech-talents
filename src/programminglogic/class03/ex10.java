package programminglogic.class03;
import java.util.Random;
import java.util.Scanner;

/*
    Escreva um programa que gera um número inteiro aleatório entre 1 e 10 e peça que o usuário informe o número correto,
você deve dar dicas caso o palpite esteja errado, informando se o número correto é maior ou menor do que o informado,
caso ele erre três vezes o programa se encerra e imprime uma mensagem informando que ele perdeu.
*/

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber, tryNumber;
        randomNumber = random.nextInt(10) + 1;

        for(int i = 0; i < 3; i++){
            System.out.println("Advinhe o número: ( 1 - 10 )");
            tryNumber = scanner.nextInt();
            if (tryNumber == randomNumber){
                System.out.printf("""
                        Parabéns!!!
                        Você acertou o número, o número era %d""", randomNumber);
                System.exit(0);
            } else if (tryNumber < randomNumber) {
                System.out.println("""
                        Quase lá!
                        O número é maior que o valor digitado!""");
            } else {
                System.out.println("""
                        Quase lá!
                        O número é menor que o valor digitado!""");
            }
        }
        System.out.printf("""
                        Você perdeu!
                        O número correto era %d""", randomNumber);
    }
}
