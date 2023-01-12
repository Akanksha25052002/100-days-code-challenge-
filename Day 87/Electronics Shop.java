/*  Input Format -

The first line contains three space-separated integers b, n, and m, the budget, the number of keyboard models and the number of USB drive models.
The second line contains n space-separated integers keyboard[i], the prices of each keyboard model.
The third line contains m space-separated integers drives, the prices of the USB drives.

Constraints -
1<=n,m<=1000
1<=b<=10^6
The price of each item is in the inclusive range [1,10^6].

Sample Input 0 -

10 2 3
3 1
5 2 8

Sample Output 0 -

9

Explanation 0 -

Buy the 2nd keyboard and the 3rd USB drive for a total cost of 8+1=9.

Sample Input 1 -

5 1 1
4
5

Sample Output 1 -

-1

Explanation 1 -

There is no way to buy one keyboard and one USB drive because 4+5>5, so return -1.         */

// CODE -

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboards = new int[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] pendrives = new int[m];
        for(int pendrives_i=0; pendrives_i < m; pendrives_i++){
            pendrives[pendrives_i] = in.nextInt();
        }
        int ans = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int sum = keyboards[i] + pendrives[j];
                if (sum > s)  continue;
                ans = Math.max(ans, sum);
            }  
        }
        System.out.println(ans);
    }
}
