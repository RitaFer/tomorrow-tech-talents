package oopii.calculator;

public class Subtraction extends CollectGeneral implements Calculation{
    @Override
    public void calculate() {
        collectInserts();
        double sub = 0;
        for(int i=0; i<numbers.length; i++){
            sub -= numbers[i];
        }
        showResult(sub);
    }

    @Override
    public void showResult(double sub) {
        System.out.println("\nO resultado da subtração dos números inseridos é "+sub+". ");
    }
}
