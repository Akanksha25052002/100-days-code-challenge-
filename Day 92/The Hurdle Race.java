/*  Input Format -

The first line contains two space-separated integers n and k, the number of hurdles and the maximum height the character can jump naturally.
The second line contains n space-separated integers height[i] where 0<=i<n.

Constraints -
1<=n,k<=100
1<=height[i]<=100

Sample Input 0 -

5 4
1 6 3 5 2

Sample Output 0 -

2

Sample Input 1 -

5 7
2 5 4 5 2

Sample Output 1 -

0          */

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
        int[] height = new int[n];
        int max = 0;
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
            if ( height[height_i] > max){
                max = height[height_i] ;
            }
        }
        if(k >= max){
            System.out.println("0");
            
        }
        // y
        else{
                System.out.println(max-k);
         }
}
}
