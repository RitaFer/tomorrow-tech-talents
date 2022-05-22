package extras.cursoemvideo.ex10;

public class Ex10 {
    public static void main(String[] args) {
        //Herança por implementação, herança pobre.
        Visitant v1 = new Visitant();
        v1.setName("João");
        v1.setAge(22);
        v1.setSex("Masculino");
        System.out.println(v1.toString());

        Student s1 = new Student();
        s1.payMonthlyFee();

        Scholarship b1 = new Scholarship();
        b1.payMonthlyFee();
        b1.renewScholarship();
    }
}
