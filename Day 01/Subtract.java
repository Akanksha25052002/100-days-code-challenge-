/* # 100-days-code-challenge-
 By taking two input from user and subtract them.
 
sample input-
45
24

sample output-
21       */



//code

import java.util.*;

public class Subtract {
    public static void main(String[]args)
{ Scanner sc=new Scanner(System.in);
    System.out.println("enter first no.:");
int a=sc.nextInt();
System.out.println("enter second no.:");
int b=sc.nextInt();
int subtract=a-b;
System.out.println("subtraction of two no.:"+subtract);
        
    }
}
