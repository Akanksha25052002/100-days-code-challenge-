/*  Input Format -

A single line of five space-separated integers.

Constraints -
1<=arr[i]<=10^9

Output Format -

Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers.
(The output can be greater than a 32 bit integer.)

Sample Input

1 2 3 4 5
Sample Output

10 14
Explanation

The numbers are 1, 2, 3, 4, and 5. Calculate the following sums using four of the five integers:

Sum everything except 1, the sum is 2+3+4+5=14.
Sum everything except 2, the sum is 1+3+4+5=13.
Sum everything except 3, the sum is 1+2+4+5=12.
Sum everything except 4, the sum is 1+2+3+5=11.
Sum everything except 5, the sum is 1+2+3+4=10.             */

//CODE -

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long[] m=new long[5];
        for(int i=0;i<5;i++){
            m[i]=in.nextLong();
        }
        Arrays.sort(m);
        long x=0;
        long y=0;
        for(int i=0;i<4;i++){
            x+=m[i];
        }
        for(int i=1;i<5;i++){
            y+=m[i];
        }
        System.out.println(x+" "+y);
    }
}
