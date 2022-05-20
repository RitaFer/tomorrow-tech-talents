package extras.cursoemvideo.ex09;

public class Student extends Person {
    private int number;
    private String course;

    public Student(String name, int age, String sex, int number, String course) {
        super(name, age, sex);
        this.setCourse(course);
        this.setNumber(number);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void cancelNumber(){
        System.out.println("A matrícula será cancelada.");
    }
}
