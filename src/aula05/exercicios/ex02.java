package aula05.exercicios;

/*
Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do imposto de Renda, que depende
 do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do salário bruto, mas
 não é descontado (é a empresa que deposita.)

O salário líquido corresponde ao salário bruto menos os descontos O programa deverá pedir ao usuário o valor da sua hora
e a quantidade de horas trabalhadas no mês.

a. Desconto do IR;
b. Salário Bruto até R$900,00 (inclusive) – Isento;
c. Salário Bruto de R$ 1500,00 (inclusive) – desconto de 5%;
d. Salário bruto até R$ 2500,00 (Inclusive) – desconto de 10%;
e. Salário bruto acima de R$2500,00 – Desconto de 20%.

 */

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Qual o valor da sua hora? R$");
        double wageHour = scanner.nextDouble();
        System.out.println("Quantas horas você trabalhou no último mês? ");
        int hours = scanner.nextInt();

        double grossSalary = wageHour * hours;
        double fgts = (grossSalary * 11)/100;
        double tradeUnion = (grossSalary * 3)/100;
        double irpf = 0;

        if(grossSalary > 900 && grossSalary <= 1500){
            irpf = (grossSalary * 5)/100;
        } else if(grossSalary > 1500 && grossSalary <= 2500){
            irpf = (grossSalary * 10)/100;
        } else if(grossSalary > 2500){
            irpf = (grossSalary * 20)/100;
        }

        System.out.println("=====================================================");
        System.out.println("Salário Bruto: R$ " + grossSalary + " (+)");
        System.out.println("IRPF: R$ " + irpf + " (-)");
        System.out.println("Contribuição Sindical: R$ " + tradeUnion + " (-)");
        System.out.println("-----------------------------------------------------");
        System.out.println("Salário Líquido: R$ " + (grossSalary - tradeUnion - irpf));
        System.out.println("FGTS: R$ " + fgts);
        System.out.println("=====================================================");
    }
}
