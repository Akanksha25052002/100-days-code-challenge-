/* Input Format

A single line of four space-separated integers denoting the respective values of , , , and .

Constraints

Sample Input 0

0 3 4 2
Sample Output 0

YES

Sample Input 1

0 2 5 3
Sample Output 1

NO
Explanation 1

The second kangaroo has a starting location that is ahead (further to the right) of the first kangaroo's starting location (i.e., x2>x1).
Because the second kangaroo moves at a faster rate (meaning v1>v2) and is already ahead of the first kangaroo, the first kangaroo will never be able to catch up.
Thus, we print NO.      */

//CODE -

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        
        int vdiff = v1 - v2;
        if (vdiff <= 0) {
            System.out.println("NO");
            return;
        }
        int xdiff = x1 - x2;
        System.out.println(xdiff % vdiff == 0 ? "YES" : "NO");
    }
}
