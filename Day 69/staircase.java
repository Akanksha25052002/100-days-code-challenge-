/*  Input Format

A single integer, n, denoting the size of the staircase.

Constraints -
0<n<=100.

Output Format -

Print a staircase of size n using # symbols and spaces.

Note: The last line must have 0 spaces in it.

Sample Input -

6 

Sample Output -

     #
    ##
   ###
  ####
 #####
######

Explanation -

The staircase is right-aligned, composed of # symbols and spaces, and has a height and width of n=6.   */

//CODE -

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

public class Solution {
    
    public static void drawStair(int size) {
        int level = size-1;
        for(int i = 0; i < size; i++) {
            StringBuilder s = new StringBuilder();
            for(int k = 0; k < level; k++) {
                s.append(" ");
            }
            for(int k = 0; k < size - level; k ++){
                s.append("#");
            }
            level -= 1;
            System.out.println(s.toString());
        }
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Solution sol = new Solution();
        
        int size = in.nextInt();
        sol.drawStair(size);
    }
}
