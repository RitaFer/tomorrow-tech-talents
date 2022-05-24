package oopii.calculator;

public class Sum extends CollectGeneral implements Calculation{
    @Override
    public void calculate() {
        collectInserts();
        double sum = 0;
        for(int i=0; i<numbers.length; i++){
            sum += numbers[i];
        }
        showResult(sum);
    }

    @Override
    public void showResult(double sum) {
        System.out.println("\nO resultado da soma dos números inseridos é "+sum+". ");
    }
}