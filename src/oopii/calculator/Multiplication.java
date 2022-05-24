package oopii.calculator;

public class Multiplication extends CollectGeneral implements Calculation{
    @Override
    public void calculate() {
        collectInserts();
        double mult = 0;
        for(int i=0; i<numbers.length; i++){
            mult *= numbers[i];
        }
        showResult(mult);
    }

    @Override
    public void showResult(double mult) {
        System.out.println("\nO resultado da multiplicação dos números inseridos é "+mult+". ");
    }
}
