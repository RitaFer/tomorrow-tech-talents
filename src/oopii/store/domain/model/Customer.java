package oopii.store.domain.model;
import java.time.LocalDate;
import java.time.Period;

public class Customer {
    private String name;
    private String rg;
    private String cpf;
    private LocalDate birthDate;

    public Customer(String name, String rg, String cpf, LocalDate birthDate) {
        this.name = name;
        this.rg = rg;
        this.cpf = cpf;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private String getRg() {
        return rg;
    }

    private void setRg(String rg) {
        this.rg = rg;
    }

    private String getCpf() {
        return cpf;
    }

    private void setCpf(String cpf) {
        this.cpf = cpf;
    }

    private LocalDate getBirthDate() {
        return birthDate;
    }

    private void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isOfAge(){
        final Period period = Period.between(getBirthDate(), LocalDate.now());
        return getCpf() != null && getRg() != null && period.getYears() >= 18;
    }
}
