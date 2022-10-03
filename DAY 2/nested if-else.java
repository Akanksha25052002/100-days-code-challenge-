import java.util.*;
public class Oddeven{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.:");
        int n=sc.nextInt();
        if(n%2==0){
            if(n>=2&&n<=5){
                System.out.println("Not Weird");
            }
            else if(n>=6&&n<=20){
                System.out.println("Weird");
            }
            else if(n>20){
                System.out.println("Not Weird");
            }
        }
        else{
            System.out.println("Weird");
        }
    

    }
}
