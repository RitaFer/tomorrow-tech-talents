package extras.devdojo.ex10;

import java.util.Arrays;

public class Employee {
    String name;
    int age;
    double[] salary = new double[3];

    public void avarageSalary(){
        double totalSalary = 0;
        for(int i = 0; i < 3; i++){
            totalSalary += salary[i];
        }
        System.out.println("A média de salários é "+ (totalSalary / salary.length));
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + Arrays.toString(salary) +
                '}';
    }
}