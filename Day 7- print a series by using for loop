/* In the given problem we use for loop to print a series by taking input from user.
we use the integer a,b and n to create the series.

Sample Input-

2
0 2 10
5 3 5

Sample Output-

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98

             */
             
   CODE           
             
  import java.util.*;

  public class Solution{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0;j<n;j++){
                a=a+b;
                System.out.print(a+" ");
                b=2*b;
            }
            System.out.println();
        }
        in.close();
    }
}

