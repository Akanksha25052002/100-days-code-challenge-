/*  Input Format -

The first line contains an integer n, the number of elements in the sequence.
The second line contains n space-separated integers p[i] where 1<=n<=i.

Constraints -

1<=n<=50
1<=p[i]<=50, where 1<=i<=n.
Each element in the sequence is distinct.

Sample Input 0 -

3
2 3 1

Sample Output 0 -

2
3
1

Sample Input 1 -

5
4 3 5 1 2

Sample Output 1 -

1
3
5
4
2              */

//  CODE -

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<n;j++){
                if(i==a[j]){
                  for(int k=0;k<n;k++)  {
                      if((j+1)==a[k])
                          System.out.println(k+1);
                  }
                }
            }
        }
    }
}
