/*  Input Format

The first line contains an integer, t, the number of test cases.
The next t lines each contain 3 space-separated integers:

n: the number of prisoners
m: the number of sweets
s: the chair number to start passing out treats at

Constraints -
1<=t<=100
1<=n<=10^9
1<=m<=10^9
1<=s<=n

Sample Input 0 -

2
5 2 1
5 2 2

Sample Output 0 -

2
3

Explanation 0 -

In the first query, there are n=5 prisoners and m=2 sweets. Distribution starts at seat number s=1.
Prisoners in seats numbered 1 and 2 get sweets. Warn prisoner 2.

In the second query, distribution starts at seat 2 so prisoners in seats 2 and 3 get sweets. Warn prisoner 3.

Sample Input 1 -

2
7 19 2
3 7 3

Sample Output 1 -

6
3

Explanation 1 -

In the first test case, there are n=7 prisoners, m=19 sweets and they are passed out starting at chair s=2. 
The candies go all around twice and there are 5 more candies passed to each prisoner from seat 2 to seat 6.

In the second test case, there are n=3 prisoners, m=7 candies and they are passed out starting at seat s=3. 
They go around twice, and there is one more to pass out to the prisoner at seat 3.                      */

// CODE -

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int c = Integer.parseInt(scan.nextLine());
        for(int i=0;i<c;i++){
            String[] sp = scan.nextLine().split("\\s+");
            int N = Integer.parseInt(sp[0]);
            int M = Integer.parseInt(sp[1]);
            int S = Integer.parseInt(sp[2]);
            int next = M+S;
            next=(next-1)%N;
            if(next == 0)next = N;
            System.out.println(next);
        }
    }
}
