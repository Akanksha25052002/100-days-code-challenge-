/* In this problem first we take input from user and then with the help of switch case statement print the day name according to their number.

sample input-
5

sample output-
Thursday  */


//code

import java.util.*;
public class Day{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
         
        switch(a){
            case 1:{
                System.out.println("Sunday");
            }break;
            case 2:{
                System.out.println("Monday");
            }break;
            case 3:{
                System.out.println("Tuesday");
            }break;
            case 4:{
                System.out.println("Wednesday");
            }break;
            case 5:{
                System.out.println("Thursday");
            }break;
            case 6:{
                System.out.println("Friday");
            }break;
            case 7:{
                System.out.println("Saturday");
            }break;
            default:{
                System.out.println("invalid");
            }
        }
    }
}
    

