import java.util.*;
public class GreatestNumber{
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a=sc.nextInt();
         System.out.println("Enter the value of b");
        int b=sc.nextInt();
         System.out.println("Enter the value of c");
        int c=sc.nextInt();
        if(a>b&&a>c)
        {System.out.println("a is greatest no.");
        
        }
        else if(b>c&&b>c){
            System.out.println("b is greatest no.");
        }
        else{
            System.out.println("c is greatest no.");
        }
}
}
