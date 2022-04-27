package extras.hackerrank;

/*
Given an integer,x, perform the following conditional actions:

If x is odd, print Weird
If x is even and in the inclusive range of  to , print Not Weird
If x is even and in the inclusive range of  to , print Weird
If x is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.
 */

import java.util.Scanner;

public class d03 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (N%2 != 0) {
            System.out.print("Weird");
            scanner.close();
        } else if (N > 2 && N < 5) {
            System.out.print("Not Weird");
            scanner.close();
        } else if (N > 6 && N <= 20) {
            System.out.print("Weird");
            scanner.close();
        } else if (N > 20) {
            System.out.print("Not Weird");
            scanner.close();
        }
    }
}
