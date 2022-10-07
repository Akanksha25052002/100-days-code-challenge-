/* formatting of the string 
   We have given the problem to format the string. We take a string and a number input from user and will display in the follwing format:
      String -15 character space 3 digit integer
      if the number input is of 2 digit a 0 will add in the hundred's place.
      
   example Input-Operating system 15
   expected output -Operating System                015
   Sample test case:
      java 100
      cpp 65
      python 50
   Output:
================================
java           100 
cpp            065 
python         050 
================================
   
*/

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s" , s1);   //used printf function for the formatting to add 15 character space.
            System.out.printf("%03d" , x);         //used printf function for conveting the two digit number to three digit.
            System.out.println();
                            }
            System.out.println("================================");

    }
}



