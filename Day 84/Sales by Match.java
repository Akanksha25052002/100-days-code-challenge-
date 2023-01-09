/*   Input Format -

The first line contains an integer n, the number of socks represented in ar.
The second line contains n space-separated integers, ar[i], the colors of the socks in the pile.

Constraints -
1<=n<=100
1<=ar[i]<=100 where 0<=i<n

Sample Input -

STDIN                       Function
-----                       --------
9                           n = 9
10 20 20 10 10 30 50 10 20  ar = [10, 20, 20, 10, 10, 30, 50, 10, 20]

Sample Output -

3            */

// CODE -

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int[] freq = new int[101];
        int n = s.nextInt();
        for(int i = 0; i < n; i++){
            int x = s.nextInt();
            freq[x]++;
        }
        int total = 0;
        for(int i = 1; i < 101; i++){
            total+=freq[i]/2;
        }
        System.out.println(total);
    }
}
