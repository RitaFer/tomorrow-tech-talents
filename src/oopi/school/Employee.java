package oopi.school;

public class Employee extends Person{

    private String office;
    private double salary;

    protected Employee(String name, String cpf, String rg, String office, double salary) {
        super(name, cpf, rg);
        this.office = office;
        this.salary = salary;
    }

    public String getOffice() {
        return office;
    }
    public void setOffice(String office) {
        this.office = office;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "\n Nome do Funcionário: "+this.getName()
                +"\n CPF do Funcionário: "+this.getCpf()
                +"\n RG do Funcionário: "+this.getRg()
                +"\n Cargo do Funcionário: "+this.getOffice()
                +"\n Salário do Funcionário: R$ "+this.getSalary()
                +"\n";
    }
}
