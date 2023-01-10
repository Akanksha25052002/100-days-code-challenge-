/*   Input Format -

The first line contains an integer n, the number of pages in the book.
The second line contains an integer, p, the page to turn to.

Constraints -
1<=n<=10^5
1<=p<=n

Sample Input 0 -

6
2

Sample Output 0 -

1

Sample Input 1 -

5
4

Sample Output 1 -

0               */

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
        int p = in.nextInt();
        int frontdist = p / 2;
        int backdist = n % 2 == 0 ? (n - p + 1) / 2 : (n - p) / 2;
        System.out.println(Math.min(frontdist, backdist));
        
    }
}
