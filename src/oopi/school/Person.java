package oopi.school;

public class Person {
    private String name;
    private String rg;
    private String cpf;

    public Person(String name, String cpf, String rg) {
        this.name = name;
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}