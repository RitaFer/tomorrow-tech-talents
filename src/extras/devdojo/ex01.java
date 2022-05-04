package extras.devdojo;

/*
Aula 14 - Tipos primitivos pt 05 - Exercício

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salário>, na data <data>.
 */

public class ex01 {
    public static void main(String[] args) {
        String name = "João Roberto de Souza";
        String address = "Rua Cuiabá, 455 - Centro - Itapetininga, SP";
        double wage = 2500.00;
        String date = "04/05/2022";
        String declaration = "Eu "+name+", morando no endereço "+address+", confirmo que recebi o salário de R$"+wage+", na data "+date;
        System.out.println(declaration);
    }
}