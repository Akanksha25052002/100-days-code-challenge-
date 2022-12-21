/*  Input Format -

The first line of the input consists of an integer n.
The next line contains n space-separated integers contained in the array.

Output Format -

Return the integer sum of the elements in the array.

Constraints -
1<=n<=10
0<=ar[i]<=10^10

Sample Input -

5
1000000001 1000000002 1000000003 1000000004 1000000005

Output -

5000000015                */

//CODE - 

import java.util.Scanner;

public class BigSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long sum = 0;
        while (N-- > 0 ) {
            sum += scanner.nextInt();
        }
        System.out.println(sum);
    }
}
