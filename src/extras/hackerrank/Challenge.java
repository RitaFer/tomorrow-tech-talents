package extras.hackerrank;

import java.util.*;
import java.util.stream.Collectors;

public class Challenge {

    public static int MathChallenge(int num1, int num2) {
        int range = Math.max(num1, num2);;
        List<Integer> divisors1 = new ArrayList<>();
        List<Integer> divisors2 = new ArrayList<Integer>();
        for(int i  = 1; i <= range; i++){
            if(num1%i == 0){
                divisors1.add(i);
            }
            if(num2%i == 0){
                divisors2.add(i);
            }
        }
        List <Integer> equalsDivisors = divisors1.stream().filter(item1 -> divisors2.stream().anyMatch(item2 -> item2.equals(item1))).toList();
        return Collections.max(equalsDivisors);
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(MathChallenge(66,33));
    }
}