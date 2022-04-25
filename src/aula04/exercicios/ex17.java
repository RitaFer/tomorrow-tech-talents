package aula04.exercicios;

/*
A prefeitura de uma cidade deseja fazer uma pesquisa entre seus habitantes. Faça um algoritmos para coletar dados sobre
o salário e número de filhos de cada habitante e após as leituras, escrever:
Média de salário da população
Média do número de filhos
Maior salário dos habitantes
Percentual de pessoas com salário menor que R$ 150,00
Obs: O final da leitura dos dados se dará com a entrada de um “salário negativo”.
 */

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int population = 0;
        int totalChildren = 0;
        double totalSalary = 0;
        double highestSalary = -1;
        int lowestSalary = 0;

        while(true) {
            System.out.print("Digite o salário: ");
            double salary = scanner.nextDouble();

            if (salary < 0){
                break;
            }

            System.out.print("Digite o número de filhos: ");
            int numberChildren = scanner.nextInt();

            population += population + 1;
            totalChildren += numberChildren;
            totalSalary += salary;

            if(salary > highestSalary){
                highestSalary = salary;
            }

            if(salary < 150){
                lowestSalary++;
            }
        }

        System.out.println("Média salário da população: R$ " + (totalSalary / population));
        System.out.println("Média do números de filhos: " + (totalChildren / population));
        System.out.println("Maior salário dentre os habitantes: R$ " + lowestSalary);
        System.out.println("O percentual de pessoas com salário menor que R$ 150,00" + (lowestSalary / population * 100));
    }
}
