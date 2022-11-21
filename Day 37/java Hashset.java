/* Input Format

In the first line, there will be an integer T denoting number of pairs.
Each of the next T lines will contain two strings seperated by a single space.

Output Format-

Print T lines. In the ith line, print number of unique pairs you have after taking ith pair as input.

Sample Input-

5
john tom
john mary
john tom
mary anna
mary anna

Sample Output-

1
2
2
3
3

Explanation-

After taking the first input, you have only one pair: (john,tom)
After taking the second input, you have two pairs: (john, tom) and (john, mary)
After taking the third input, you still have two unique pairs.
After taking the fourth input, you have three unique pairs: (john,tom), (john, mary) and (mary, anna)
After taking the fifth input, you still have three unique pairs.            */

//CODE-

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

HashSet<String> pairs = new HashSet<String>(t);

    for(int i = 0; i < t; i++)
    {
        pairs.add("(" + pair_left[i] + ", " + pair_right[i] + ")" );
        System.out.println(pairs.size());
    }
   }
}
