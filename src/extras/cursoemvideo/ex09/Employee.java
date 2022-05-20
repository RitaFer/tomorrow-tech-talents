package extras.cursoemvideo.ex09;

public class Employee extends Person {
    private String setor;
    private boolean working;

    public Employee(String name, int age, String sex, String setor, boolean working) {
        super(name, age, sex);
        this.setSetor(setor);
        this.setWorking(working);
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }

    public void changeWorking(){
        this.working = !this.working;
    }
}