package oop.school;

import java.util.ArrayList;

public class Student extends Person {
    private String registration;
    private int age;
    private String team;
    private ArrayList<Subject> notes;

    public Student(String name, String cpf, String rg, String registration, int age, String team, ArrayList<Subject> notes) {
        super(name, cpf, rg);
        this.registration = registration;
        this.age = age;
        this.team = team;
        this.notes = notes;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public ArrayList<Subject> getNotes() {
        return notes;
    }

    public void setNotes(ArrayList<Subject> notes) {
        this.notes = notes;
    }

    public int averageNotes(){
        int sum = 0;
        for(Subject subject : notes){
            sum += subject.getNote();
        }
        return sum/notes.size();
    }

    @Override
    public String toString() {
        return "\nMatrícula do Aluno: "+this.getName()
                +"\nNome do Aluno: "+this.getRegistration()
                +"\n CPF do Aluno: "+this.getCpf()
                +"\n RG do Aluno: "+this.getRg()
                +"\n Idade do Aluno: "+this.getAge()
                +"\n Turma do Aluno: "+this.getTeam()
                +"\n Nota do Aluno: "+this.getNotes();
    }
}