/* Input Format -

A single integer, n, the day number.

Constraints -
1<=n<=50

Sample Input -

3

Sample Output -

9         */

//  CODE -

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int received = 5;
        int sum=0;
        while(n-- >0){
            int remaining = received/2;
            sum+=remaining;
            received = remaining*3;
        }
        System.out.println(sum);

    }
}
