/*Input Format-

The first line contains a single integer,n , denoting the length of array 
A=[a0,a1,.....,an-1].

The second line contains n space-separated integers describing each respective element,ai, in array A.

Output Format-

Print the number of subarrays of A having negative sums.

Sample Input-

5
1 -2 4 -5 1

Sample Output-

9           */


//CODE-

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
         Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] array1= new int[n];
    for(int i=0;i<n;i++){
        array1[i]=sc.nextInt();
    }
    int count=0;
    for(int j=0;j<n;j++){
        int sum=0;
        for(int k=j;k<n;k++){
            sum=array1[k]+sum;
            if(sum<0){
                count++;
            }
        }
    }
    System.out.println(count);

    }
}
