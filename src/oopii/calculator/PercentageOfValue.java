package oopii.calculator;

public class PercentageOfValue extends CollectPercentage implements Calculation {
    @Override
    public void calculate() {
        collectInserts();
        double res = (a*b)/100;
        showResult(res);
    }

    @Override
    public void showResult(double res) {
        System.out.println("\n = "+res);
    }
}