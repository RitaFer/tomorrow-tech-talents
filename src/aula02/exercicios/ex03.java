package aula02.exercicios;

/*
Escreva um programa que produza a seguinte saída na tela:
ALUNO NOTA
===== =====
Aline 9.0
Mário DEZ
Sérgio 4.5
Shirley 7.0
 */

public class ex03 {
    public static void main(String[] args) {
        String[] names = {"Aline","Mário","Sérgio","Shirley"};
        String[] grades = {"9.0", "Dez", "4.5", "7.0"};

        System.out.print("Aluno(a)");
        System.out.print("             ");
        System.out.println(" Nota");
        System.out.print("========");
        System.out.print("             ");
        System.out.println("======");

        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]);
            for(int x = names[i].length(); x < 22; x++) {
                System.out.print(" ");
            }
                System.out.println(grades[i]);
        }
    }
}
