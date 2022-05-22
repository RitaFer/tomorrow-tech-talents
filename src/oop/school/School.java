package oop.school;
import java.util.ArrayList;

public class School {
    public ArrayList<Student> students;
    public ArrayList<Employee> employees;
    public ArrayList<Teacher> teachers;

    public School(ArrayList<Student> students, ArrayList<Employee> employees, ArrayList<Teacher> teachers) {
        this.students = students;
        this.employees = employees;
        this.teachers = teachers;
    }

    public int findIndexStudent(String cpf){
            for(Student student : students){
                if(student.getCpf().equals(cpf)){
                    return students.indexOf(student);
                }
            }
        return -1;
    }

    public int findIndexEmployee(String cpf){
        for(Employee employee : employees){
            if(employee.getCpf().equals(cpf)){
                return employees.indexOf(employee);
            }
        }
        return -1;
    }

    public int findIndexTeacher(String cpf){
        for(Teacher teacher : teachers){
            if(teacher.getCpf().equals(cpf)){
                return teachers.indexOf(teacher);
            }
        }
        return -1;
    }

    public void addStudent(String name, String cpf, String rg, String registration, int age, String team, ArrayList<Subject> notes){
        Student student = new Student(name, cpf, rg, registration, age, team, notes);
        int indexStudent = findIndexStudent(cpf);

        if(indexStudent == -1){
            students.add(student);
            System.out.println("Aluno inserido no sistema com sucesso.");
        }else{
            System.out.println("Aluno já cadastrado.");
        }
    }

    public void addEmployee(String name, String cpf, String rg, String office, double salary){
        Employee employee = new Employee(name, cpf, rg, office, salary);
        int indexEmployee = findIndexEmployee(cpf);

        if(indexEmployee == -1){
            employees.add(employee);
            System.out.println("Funcionário inserido com sucesso.");
        }else{
            System.out.println("Funcionário já cadastrado.");
        }
    }

    public void addTeacher(String name, String cpf, String rg, double salary, ArrayList<String> classes, ArrayList<Subject> subjects){
        Teacher teacher = new Teacher(name, cpf, rg, salary, classes, subjects);
        int indexTeacher = findIndexTeacher(cpf);

        if(indexTeacher == -1){
            teachers.add(teacher);
            System.out.println("Professor inserido com sucesso.");
        }else{
            System.out.println("Professor já cadastrado.");
        }
    }

    public void updateStudent(String name, String cpf, String rg, String registration, int age, String team, ArrayList<Subject> notes){
        int index = findIndexStudent(cpf);
        if(index == -1){
            System.out.println("Estudante não cadastrado.");
            addStudent(name, cpf, rg, registration, age, team, notes);
        }else{
            this.students.get(index).setName(name);
            this.students.get(index).setCpf(cpf);
            this.students.get(index).setRg(rg);
            this.students.get(index).setRegistration(registration);
            this.students.get(index).setAge(age);
            this.students.get(index).setTeam(team);
            this.students.get(index).setNotes(notes);
            System.out.println("Estudante atualizado com sucesso.");
        }
    }

    public void updateEmployee(String name, String cpf, String rg, String office, double salary){
        int index = findIndexEmployee(cpf);
        if(index == -1){
            System.out.println("Funcionário não cadastrado.");
            addEmployee(name, cpf, rg, office, salary);
        }else {
            this.employees.get(index).setName(name);
            this.employees.get(index).setCpf(cpf);
            this.employees.get(index).setRg(rg);
            this.employees.get(index).setOffice(office);
            this.employees.get(index).setSalary(salary);
            System.out.println("Funcionário atualizado com sucesso.");
        }
    }

    public void updateTeacher(String name, String cpf, String rg, double salary, ArrayList<String> classes, ArrayList<Subject> subjects){
        int index = findIndexTeacher(cpf);
        if(index == -1){
            System.out.println("Professor não cadastrado.");
            addTeacher(name, cpf, rg, salary, classes, subjects);
        }else {
            this.teachers.get(index).setName(name);
            this.teachers.get(index).setCpf(cpf);
            this.teachers.get(index).setRg(rg);
            this.teachers.get(index).setSalary(salary);
            this.teachers.get(index).setClasses(classes);
            this.teachers.get(index).setSubjects(subjects);
            System.out.println("Professor atualizado com sucesso.");
        }
    }

    public void deleteStudent(String cpf){
        int indexStudent = findIndexStudent(cpf);
        if(indexStudent != -1){
            students.remove(indexStudent);
            System.out.println("Estudante removido com sucesso.");
        }
    }

    public void deleteEmployee(String cpf){
        int indexEmployee = findIndexEmployee(cpf);
        if(indexEmployee != -1){
            employees.remove(indexEmployee);
            System.out.println("Funcionário removido com sucesso.");
        }
    }

    public void deleteTeacher(String cpf){
        int indexTeacher = findIndexTeacher(cpf);
        if (indexTeacher != -1) {
            teachers.remove(indexTeacher);
            System.out.println("Professor removido com sucesso.");
        }

    }

    public void readStudents(){
        if (this.students.isEmpty()){
            System.out.println("\nNão existem estudantes matriculados.");
        } else {
            for(Student student : this.students){
                System.out.println(student.toString());
                System.out.println("------------------------------------------------------");
            }
        }
    }

    public void readEmployees(){
        if (this.employees.isEmpty()){
            System.out.println("\nNão existem funcionários contratados.");
        } else {
            for(Employee employee : this.employees){
                System.out.println(employee.toString());
                System.out.println("------------------------------------------------------");
            }
        }
    }

    public void readTeachers(){
        if (this.teachers.isEmpty()){
            System.out.println("\nNão existem professores contratados.");
        } else {
            for(Teacher teacher : this.teachers){
                System.out.println(teacher.toString());
                System.out.println("------------------------------------------------------");
            }
        }
    }

    public void calculateAverageNotes(String cpf){
        int indexStudent = findIndexStudent(cpf);
        if(indexStudent != -1){
            double average = students.get(indexStudent).averageNotes();
            System.out.println("O aluno "+students.get(indexStudent).getName()+" possui média de "+average);
        }else{
            System.out.println("Aluno não encontrado no sistema.");
        }
    }
}