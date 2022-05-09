package programminglogic.class05;

/*
Cada espectador de um cinema respondeu a um questionário no qual constava sua idade e a sua opinião em relação ao filme:

3 - ótimo,
2 - bom,
1 - regular

 Faça um programa que receba a idade e a opinião de 5 espectadores e que calcule e mostre:

A média das idades das pessoas que responderam ótimo;
A quantidade de pessoas que respondeu regular;
A percentagem de pessoas que respondeu “bom” entre todos os espectadores analisados.
 */

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age, note, regular = 0, bom = 0, otimo = 0, sumAge = 0;
        for(int i = 0; i < 5; i++){
            System.out.print("Qual a sua idade? ");
            age = scanner.nextInt();
            System.out.println("Qual nota você dá ao filme? ");
            System.out.println("3 - Ótimo");
            System.out.println("2 - Bom");
            System.out.println("1 - Regular");
            note = scanner.nextInt();

            while (note != 1 && note != 2 && note != 3) {
                System.out.println("Opção inválida, por favor, escolha 1, 2 ou 3:");
                note = scanner.nextInt();
            }

            System.out.println("---------------------------------------------------------------");

            if (note == 1){
                regular++;
            } else if (note == 2){
                bom++;
            } else {
                otimo++;
                sumAge += age;
            }
        }

        int mediaOtimo = 0;
        if(otimo != 0){
            mediaOtimo =  sumAge/otimo;
        }

        double porcentBom = (bom/5d)*100;

        System.out.println("=============================================================\n");
        System.out.println("A média das idades das pessoas que responderam ótimo é: " + mediaOtimo);
        System.out.println("A quantidade de pessoas que respondeu regular é: " + regular);
        System.out.println("A percentagem de pessoas que respondeu “bom” entre todos os espectadores analisados é: " + porcentBom + "%.");
        System.out.println("\n=============================================================");
    }
}
