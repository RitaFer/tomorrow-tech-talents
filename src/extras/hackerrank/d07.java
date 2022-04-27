package extras.hackerrank;

import java.util.Scanner;

/*
Sample Input
2
0 2 10
5 3 5

Sample Output
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
 */

public class d07 {
    public static void main(String []argh){
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        for (int t=0;t<r;++t){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            int s = a;
            for (int i=0;i<n;++i){
                s+=Math.pow(2,i)*b;
                System.out.print(s + " ");
            }
            System.out.print("\n");
        }
    }
}
