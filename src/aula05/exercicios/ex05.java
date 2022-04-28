package aula05.exercicios;

/*
Crie uma agenda que armazena, código da pessoa, número do telefone, idade. Sua agenda deve possibilitar:
(1) – inserir um contato
(2) – Remover um contato
 */

import java.util.Scanner;
import java.util.ArrayList;

public class ex05 {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        ArrayList<String> number = new ArrayList<String>();
        ArrayList<String> age = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("\n=======================AGENDA=======================\n");
            System.out.println("1 - Exibir lista de contatos;");
            System.out.println("2 - Atualizar um contato;");
            System.out.println("3 - Inserir novo contato;");
            System.out.println("4 - Remover um contato;");
            System.out.println("5 - Sair do programa;");
            System.out.print("\n");
            System.out.print("Insira a opção do que deseja fazer: ");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1 -> {
                    System.out.print("\n=======================CONTATOS=======================\n");
                    if (number.size() == 0) {
                        System.out.println("Não há contatos cadastrados.");
                        break;
                    }
                    for (int i = 0; i < name.size(); i++) {
                        System.out.println("ID: " + (i + 1));
                        System.out.println("Nome: " + name.get(i));
                        System.out.println("Número: " + number.get(i));
                        System.out.println("Idade: " + age.get(i) + " anos.\n");
                    }
                }
                case 2 -> {
                    System.out.print("\n=======================ATUALIZAR CONTATO=======================\n");
                    System.out.print("Insira o ID do contato que deseja atualizar: ");
                    int update = scanner.nextInt() - 1;
                    System.out.print("\n----------------------------------------------------------------\n");
                    System.out.println("ID: " + (update + 1));
                    System.out.println("Nome: " + name.get(update));
                    System.out.println("Número: " + number.get(update));
                    System.out.println("Idade: " + age.get(update) + " anos.\n");
                    System.out.print("----------------------------------------------------------------\n");
                    System.out.println("Insira a opção do que deseja atualizar:");
                    System.out.println("1 - Nome;");
                    System.out.println("2 - Número;");
                    System.out.println("3 - Idade;");
                    int optionUpdate = scanner.nextInt();
                    scanner.nextLine();
                    switch (optionUpdate) {
                        case 1 -> {
                            System.out.print("Insira o novo nome do contato:");
                            String nameUpdade = scanner.nextLine();
                            name.set(update, nameUpdade);
                            System.out.print("Contato atualizado com sucesso !!");
                        }
                        case 2 -> {
                            System.out.print("Insira o novo número do contato:");
                            String numberUpdade = scanner.nextLine();
                            name.set(update, numberUpdade);
                            System.out.print("Contato atualizado com sucesso !!");
                        }
                        case 3 -> {
                            System.out.print("Insira a nova idade do contato:");
                            String ageUpdade = scanner.nextLine();
                            name.set(update, ageUpdade);
                            System.out.print("Contato atualizado com sucesso !!");
                        }
                        default -> {
                            System.out.print("Opção inválida. Favor escolha outra opção.");
                        }
                    }
                }
                case 3 -> {
                    System.out.print("=======================ADICIONAR CONTATO=======================\n");
                    System.out.println("Insira o nome do contato:");
                    String nameAdd = scanner.nextLine();
                    name.add(nameAdd);
                    System.out.println("Insira o número do contato:");
                    String numberAdd = scanner.nextLine();
                    number.add(numberAdd);
                    System.out.println("Insira a idade do contato:");
                    String ageAdd = scanner.nextLine();
                    age.add(ageAdd);
                    System.out.println("Contato adicionado com sucesso !!");
                }
                case 4 -> {
                    System.out.print("=======================REMOVER CONTATO=======================\n");
                    System.out.print("Insira o ID do contato que deseja remover: ");
                    int remove = scanner.nextInt() - 1;
                    name.remove(remove);
                    number.remove(remove);
                    age.remove(remove);
                    System.out.print("Contato removido com sucesso !");
                }
                case 5 -> {
                    System.out.print("\nAté logo !!");
                    System.exit(0);
                }
                default -> {
                    System.out.println("Opção Inválida. Favor escolha outra opção !");
                }
            }
        }
    }
}
