/*  Input Format -

The first line of input contains t, the number of test cases.

Each test case consists of two lines.

The first line has two space-separated integers, n and k, the number of students (size of a) and the cancellation threshold.
The second line contains n space-separated integers (a[1],a[2],....,a[n]) that describe the arrival times for each student.

Constraints -
1<=t<=10
1<=n<=1000
1<=k<=n
-100<=a[i]<=100

Sample Input -

2
4 3
-1 -3 4 2
4 2
0 -1 2 1

Sample Output -

YES
NO

Explanation -

For the first test case, k=3. The professor wants at least 3 students in attendance, but only 2 have arrived on time (-3 and -1) so the class is cancelled.

For the second test case, k=2. The professor wants at least 2 students in attendance, and there are 2 who arrived on time (0 and -1). The class is not cancelled.  */

// CODE -

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        int T= scan.nextInt();
        for(int i=0; i<T; i++){
            int numofstudents=0;
            int N=scan.nextInt();
            int K=scan.nextInt();
            for(int j=0;j<N; j++){
                int a= scan.nextInt();
                if( a<=0) numofstudents++;
            }
            if(numofstudents < K) System.out.println("YES");
            else System.out.println("NO");
    }
}
}
