/* In the given problem we are using for loop to print table by taking input from user
Input Format-A single integer N

Output Format-
Print 10 lines of output; each line i (where 1<=i<=10) contains the result of N*i in the form: N x i = result.

Sample Input-2

Sample Output-
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20  */



import java.util.*;


public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int i;
        for(i=1;i<=10;i++){
            System.out.println(N+" "+"x"+" "+i+" "+"="+" "+N*i);
        }
       
    }
}
