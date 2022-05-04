package extras.devdojo;

/*
Aula 29 - Estruturas de Repetição pt 03 - Break

Imprima os primeiros 25 números de um dado valor. Ex: 50.
 */

public class ex05 {
    public static void main(String[] args) {
        int maxNumber = 50;
        for(int i=0;i<=maxNumber;i++){
            if(i>25){
                break;
            }
            System.out.println(i);
        }
    }
}
