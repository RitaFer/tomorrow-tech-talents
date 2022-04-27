package extras.hackerrank;

/*
Sample Input
java 100
cpp 65
python 50

Sample Output
================================
java           100
cpp            065
python         050
================================
 */

import java.util.Scanner;

public class d05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.print(s1);
            for (int d = s1.length(); d <= 14; d++) {
                System.out.print(" ");
            }
            if (x < 10) {
                System.out.print("00" + x);
            } else if (x < 100) {
                System.out.print("0" + x);
            } else {
                System.out.print(x);
            }
            System.out.print("\n");
        }
        System.out.println("================================");

    }
}
