package programminglogic.class03;
import java.math.BigDecimal;
import java.util.Scanner;

/*
Escreva um programa que leia e valide as seguintes informações:
    Nome: maior que 3 caracteres;
    Idade: entre 0 e 150
    Salário: maior que 0
    Sexo: ‘f’ ou ‘m’
    Estado civil: ‘s’, ‘c’, ‘v’, ‘d’
 */


public class ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name, gender, maritalStatus;
        int age ;
        BigDecimal salary;

        System.out.println("Insira seu nome: ");
        name = scanner.nextLine();
        if(name.length() <= 3) {
            do {
                System.out.println("É necessário inserir um nome com mais de 3 caracteres, por favor, insira novamente seu nome: ");
                name = scanner.nextLine();
            } while (name.length() <= 3);
        }

        System.out.println("Insira sua idade: ");
        age = scanner.nextInt();
        if(age <= 0 || age >= 150) {
            do {
                System.out.println("Sua idade precisa estar entre 0 e 150 anos, por favor, insira novamente sua idade: ");
                age = scanner.nextInt();
            } while (age <= 0 || age >= 150);
        }

        System.out.println("Insira seu salário: ");
        salary = scanner.nextBigDecimal();
        if(salary.compareTo(BigDecimal.valueOf(0)) <= 0) {
            do {
                System.out.println("Seu salário precisa ser maior que R$ 0, por favor, insira novamente seu salário: ");
                salary = scanner.nextBigDecimal();
            } while (salary.compareTo(BigDecimal.valueOf(0)) <= 0);
        }

        System.out.println("Insira o seu sexo: ('F' ou 'M'): ");
        gender = scanner.nextLine().toUpperCase();
        if (!gender.equals("F") && !gender.equals("M")) {
            do {
                System.out.println("Seu sexo precisa ser F ou M, por favor, insira novamente seu sexo: ");
                gender = scanner.nextLine().toUpperCase();
            } while (!gender.equals("F") && !gender.equals("M"));
        }

        System.out.println("Insira seu status civil: ('s', ‘m’, ‘w’, ‘d’): ");
        maritalStatus = scanner.nextLine().toUpperCase();
        if (!maritalStatus.equals("S") && !maritalStatus.equals("M") && !maritalStatus.equals("W") && !maritalStatus.equals("D")){
            do {
                System.out.println("Seu status civil precisa ser 's', ‘m’, ‘w’ ou ‘d’, por favor, insira novamente seu status civil: ");
                maritalStatus = scanner.nextLine().toUpperCase();
            } while (!maritalStatus.equals("S") && !maritalStatus.equals("M") && !maritalStatus.equals("W") && !maritalStatus.equals("D"));
        }

        System.out.printf("""
                Nome : %s
                Idade : %d
                Salário : %.2f
                Sexo : %S
                Status Civil : %s""", name, age, salary, gender, maritalStatus);
    }
}
