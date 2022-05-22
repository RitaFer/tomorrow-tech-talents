package oop.school;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Employee> employees = new ArrayList<>();
        ArrayList<Teacher> teachers = new ArrayList<>();

        School java = new School(students, employees, teachers);

        System.out.println("++++++++++++++++++TESTE MÉTODOS DE ESTUDANTE++++++++++++++++++");
        System.out.println("\n===============CRIAR ESTUDANTE===============");
        java.addStudent("Alexandre", "458.795.886-07", "50.089.456-7", "20582305", 22, "ABC", new ArrayList<>());
        java.addStudent("Maria", "895.115.886-07", "50.159.587-7", "125896472", 23, "AAACC", new ArrayList<>());
        System.out.println("\n===============ATUALIZAR ESTUDANTE===============");
        java.updateStudent("João", "458.795.886-07", "50.089.456-7", "20582305", 22, "ABC", new ArrayList<>());
        System.out.println("\n===============DELETAR ESTUDANTE===============");
        java.deleteStudent("458.795.886-07");
        System.out.println("\n===============LER ESTUDANTES===============");
        java.readStudents();

        System.out.println("++++++++++++++++++TESTE MÉTODOS DE PROFESSOR++++++++++++++++++");
        System.out.println("\n===============CRIAR PROFESSOR===============");
        java.addTeacher("Adriano", "589.795.886-07", "50.189.456-7", 2508.88, new ArrayList<>(), new ArrayList<>());
        java.addTeacher("Álvaro", "878.795.886-07", "50.189.130-7", 2598.88, new ArrayList<>(), new ArrayList<>());
        System.out.println("\n===============ATUALIZAR PROFESSOR===============");
        java.updateTeacher("Matias", "878.795.886-07", "50.189.130-7", 2598.88, new ArrayList<>(), new ArrayList<>());
        System.out.println("\n===============DELETAR PROFESSOR===============");
        java.deleteTeacher("878.795.886-07");
        System.out.println("\n===============LER PROFESSORES===============");
        java.readTeachers();

        System.out.println("++++++++++++++++++TESTE MÉTODOS DE FUNCIONÁRIO++++++++++++++++++");
        System.out.println("\n===============CRIAR FUNCIONÁRIO===============");
        java.addEmployee("Mariana", "589.589.886-07", "49.189.456-7", "Secretária", 1524.55);
        java.addEmployee("Suzana", "125.795.895-07", "25.189.456-7", "Diretora", 5689.55);
        System.out.println("\n===============ATUALIZAR FUNCIONÁRIO===============");
        java.updateEmployee("Mariana", "589.589.886-07", "49.189.456-7", "Vice-Diretora", 4888.90);
        System.out.println("\n===============DELETAR FUNCIONÁRIO===============");
        java.deleteEmployee("125.795.895-07");
        System.out.println("\n===============LER FUNCIONÁRIOS===============");
        java.readEmployees();
    }
}
