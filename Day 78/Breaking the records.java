/*  Input Format -

The first line contains an integer n, the number of games.
The second line contains n space-separated integers describing the respective values of score0, score1,....., scoren-1.

Constraints -
1<=n<=1000
0<=score[i]<=10^8

Sample Input 0 -

9
10 5 20 20 4 5 2 25 1

Sample Output 0 -

2 4

Sample Input 1 -

10
3 4 21 36 10 28 35 5 24 42

Sample Output 1 -

4 0             */

//CODE -

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = in.nextInt();
        int min = a[0];
        int max = a[0];
        int res1 = 0, res2 =0;
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                res1++;
                max = a[i];
            }
            if (a[i] < min) {
                res2++;
                min = a[i];
            }
        }
        System.out.println(res1 + " "+ res2);
    }
}
