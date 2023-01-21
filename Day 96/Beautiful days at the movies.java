/*  Input Format  -

A single line of three space-separated integers describing the respective values of i, j, and k.

Constraints -
1<=i<=j<=2x10^6
1<=k<=2x10^9

Sample Input -

20 23 6

Sample Output -

2              */


//  CODE -

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        int j = input.nextInt();
        int k = input.nextInt();
        
        int beautifulDays = 0;
        
        for(int x = i; x <= j; x++)
        {
            StringBuilder day = new StringBuilder(String.valueOf(x));
            int xReverse = Integer.parseInt(day.reverse().toString());
                
            if(Math.abs(x-xReverse) % k == 0)
            {
                beautifulDays++;
            }
        }
        System.out.println(beautifulDays);
    }
}
