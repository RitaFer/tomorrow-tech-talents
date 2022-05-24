package oopii.calculator;

public class Root extends CollectGeneral implements Calculation{
    @Override
    public void calculate() {
        collectInserts();
        double root = numbers[0];
        for(int c=2; c <= numbers[1]; c++){
            root *= numbers[0];
        }
        showResult(root);
    }

    @Override
    public void showResult(double root) {
        System.out.println("\nO resultado da raiz dos números inseridos é "+root+". ");
    }
}
