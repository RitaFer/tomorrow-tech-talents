package extras.cursoemvideo.ex10;

public class Scholarship  extends Student{
    private int scholarship;

    public int getScholarship() {
        return scholarship;
    }

    public void setScholarship(int scholarship) {
        this.scholarship = scholarship;
    }

    public void renewScholarship(){
        System.out.println("Renovando a bolsa de estudos.");
    }

    @Override
    public void payMonthlyFee(){
        System.out.println("Esse aluno não paga mensalidade, ele é bolsista.");
    }
}
