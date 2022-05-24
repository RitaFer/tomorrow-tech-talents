package oopii.calculator;

public class Division extends CollectGeneral implements Calculation{
    @Override
    public void calculate() {
        collectInserts();
        double div = 0;
        for(int i=0; i<numbers.length; i++){
            div /= numbers[i];
        }
        showResult(div);
    }

    @Override
    public void showResult(double div) {
        System.out.println("\nO resultado da divisão dos números inseridos é "+div+". ");
    }
}
