package extras.cursoemvideo.ex09;

public class Teacher extends Person {
    private String matter;
    private double salary;

    public Teacher(String name, int age, String sex, String matter, double salary) {
        super(name, age, sex);
        this.setMatter(matter);
        this.setSalary(salary);
    }

    public String getMatter() {
        return matter;
    }

    public void setMatter(String matter) {
        this.matter = matter;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void receiveRaise(double raise){
        this.salary += raise;
    }
}
