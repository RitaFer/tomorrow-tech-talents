package oopi.school;

public class Subject {
    private String name;
    private double note;

    public Subject(String name){
        this.name = name;
        this.note = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }
}
