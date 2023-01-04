/*  Input Format -

The first line contains an integer n, the number of squares in the chocolate bar.
The second line contains n space-separated integers s[i], the numbers on the chocolate squares where 0<=i<n.
The third line contains two space-separated integers, d and m, Ron's birth day and his birth month.

Constraints -
1<=n<=100
1<=s[i]<=5, where (0<=i<n)
0<=d<=31
1<=m<=12

Sample Input 0 -

5
1 2 1 3 2
3 2

Sample Output 0 -

2

Sample Input 1 -

6
1 1 1 1 1 1
3 2

Sample Output 1 -

0

Sample Input 2 -

1
4
4 1

Sample Output 2 -

1                */

//CODE -

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] squares = new int[n];
        for(int squares_i=0; squares_i < n; squares_i++){
            squares[squares_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        
        if(m>n){
            System.out.println(0);
            return;
        }
        int ct = 0;
        int sum = 0;
        for(int i=0; i<m-1; i++){
            sum+=squares[i];
        }
        for(int j=m-1; j<n; j++){
            sum -= (j-m)<0 ? 0 : squares[j-m];
            sum += squares[j];
            if(sum==d)
                ct++;
        }
        System.out.println(ct);
    }
}
