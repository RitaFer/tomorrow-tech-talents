package oop.stock;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastre um novo estoque");
        System.out.print("Nome do Estoque: ");
        String stockName = scanner.nextLine();
        Stock stock = new Stock(stockName, new ArrayList<>());

        while (true) {
            System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("ESTOQUE: " + stock.name.toUpperCase());
            System.out.println("\nO que você deseja fazer? \n");
            System.out.println("1- Criar novo produto;");
            System.out.println("2- Listar produtos;");
            System.out.println("3- Editar todos os dados do produto;");
            System.out.println("4- Remover um produto");
            System.out.println("5- Sair");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> {
                    System.out.println("Insira os dados do produto a ser cadastrado: ");
                    System.out.print("Nome do Produto: ");
                    String name = scanner.nextLine();
                    System.out.print("Sessão: ");
                    String session = scanner.nextLine();
                    System.out.print("Tipo: ");
                    String type = scanner.nextLine();
                    System.out.print("Marca: ");
                    String mark = scanner.nextLine();
                    System.out.print("Quantidade em estoque: ");
                    int stockNumber = scanner.nextInt();
                    scanner.nextLine();
                    stock.registerProduct(name, session, type, mark, stockNumber);
                }
                case 2 -> stock.readProducts();
                case 3 -> {
                    stock.readProducts();
                    System.out.print("\nInsira o ID do produto a ser atualizado: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    Product selectedProduct = stock.findProduct(id);
                    System.out.println("\nInsira os dados para atualização do produto: ");
                    System.out.print("Nome do Produto: ");
                    String name = scanner.nextLine();
                    System.out.print("Sessão: ");
                    String session = scanner.nextLine();
                    System.out.print("Tipo: ");
                    String type = scanner.nextLine();
                    System.out.print("Marca: ");
                    String mark = scanner.nextLine();
                    System.out.print("Quantidade em estoque: ");
                    int stockNumber = scanner.nextInt();
                    stock.updateProduct(name, session, type, stockNumber, mark, selectedProduct);
                }
                case 4 -> {
                    stock.readProducts();
                    System.out.print("\nInsira o ID do produto a ser deletado: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    Product selectedProduct = stock.findProduct(id);
                    stock.deleteProduct(selectedProduct);
                }
                case 5 -> {
                    System.out.println("Finalizando...");
                    return;
                }
                default -> System.out.println("Opção inválida, digite uma opção válida!");
            }
        }
    }
}