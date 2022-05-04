package extras.devdojo;

/*
Aula 28 - Estruturas de Repetição pt 02 - Exercício for

Imprima os números pares de 0 a 1000000.
 */

public class ex04 {
    public static void main(String[] args) {
        for(int i=0; i<=1000000; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}