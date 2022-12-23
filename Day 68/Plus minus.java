/*  Input Format -

The first line contains an integer, n, the size of the array.
The second line contains n space-separated integers that describe .

Constraints -
0<n<=100
-100<=arr[i]<=100

Output Format

Print the following 3 lines, each to 6 decimals:

proportion of positive values
proportion of negative values
proportion of zeros

Sample Input -

STDIN           Function
-----           --------
6               arr[] size n = 6
-4 3 -9 0 4 1   arr = [-4, 3, -9, 0, 4, 1]
Sample Output

0.500000
0.333333
0.166667
Explanation

There are 3 positive numbers, 2 negative numbers, and 1 zero in the array.
The proportions of occurrence are positive: 3/6=0.500000, negative: 2/6=0.333333 and zeros: 1/6=0.166667 .           */

//CODE -

import java.text.DecimalFormat;
import java.util.Scanner;


public class Solution {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int N=Integer.parseInt(scan.nextLine());
        int arr[]= new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=scan.nextInt();
        }
        scan.close();
        double pos=0;
        double neg=0;
        double zero=0;
        for(int i=0;i<N;i++)
        {
            if(arr[i]>0)
            {
                pos=pos+1;
            }
            else if(arr[i]<0)
            {
                neg=neg+1;
            }
            else
            {
                zero=zero+1;
            }
        }
        DecimalFormat df= new DecimalFormat("#.000");
        System.out.println(df.format(pos/N));
        System.out.println(df.format(neg/N));
        System.out.println(df.format(zero/N));
    }

}
