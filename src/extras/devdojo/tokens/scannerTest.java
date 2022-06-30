package extras.devdojo.tokens;

import java.util.Scanner;

public class scannerTest {
    public static void main(String[] args) {
        String dogs = "Meg,Cacá,true,200,false";
        Scanner sc = new Scanner(dogs);
        sc.useDelimiter(",");
        while(sc.hasNext()){
            if(sc.hasNextBoolean()){
                System.out.println("Boolean Value: "+sc.nextBoolean());
            } else if(sc.hasNextInt()){
                System.out.println("Integer Value: "+sc.nextInt());
            } else {
                System.out.println("Name Value: "+sc.next());
            }
        }
    }
}
