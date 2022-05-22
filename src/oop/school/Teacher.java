package oop.school;

import java.util.ArrayList;

public class Teacher extends Employee {

    private ArrayList<String> classes;
    private ArrayList<Subject> subjects;

    public Teacher(String name, String cpf, String rg, double salary, ArrayList<String> classes, ArrayList<Subject> subjects) {
        super(name, cpf, rg, "Professor", salary);
        this.classes = classes;
        this.subjects = subjects;
    }

    public ArrayList<String> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<String> classes) {
        this.classes = classes;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "\n Nome do Professor: "+this.getName()
                +"\n CPF do Professor: "+this.getCpf()
                +"\n RG do Professor: "+this.getRg()
                +"\n Classes do Professor: "+this.getClasses()
                +"\n Disciplinas do Professor: "+this.getSubjects()
                +"\n Salário do Professor: R$ "+this.getSalary()
                +"\n";
    }
}