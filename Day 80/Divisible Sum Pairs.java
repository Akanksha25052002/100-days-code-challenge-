/*  Input Format -

The first line contains 2 space-separated integers, n and k.
The second line contains n space-separated integers, each a value of arr[i].

Constraints -
2<=n<=100
1<=k<=100
1<=arr[i]<=100

Sample Input -

STDIN           Function
-----           --------
6 3             n = 6, k = 3
1 3 2 6 1 2     ar = [1, 3, 2, 6, 1, 2]

Sample Output -

 5
 
Explanation -

Here are the 5 valid pairs when k=3:
(0,2)->arr[0]+arr[2]=1+2=3
(0,5)->arr[0]+arr[5]=1+2=3
(1,3)->arr[1]+arr[3]=3+6=9
(2,4)->arr[2]+arr[4]=2+1=3
(4,5)->arr[4]+arr[5]=1+2=3              */

// CODE -

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int cnt=0;
        for (int i = 0 ;i<n-1;i++) {
            for (int j=i+1;j<n;j++) {
                if ((a[i]+a[j]) % k == 0)
                    cnt ++;
            }
        }
        System.out.println(cnt);
    }
}
