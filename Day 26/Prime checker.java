/* our task is to create a class Prime. The class Prime should contain a single method checkPrime.
The locked code in the editor will call the checkPrime method with one or more integer arguments.
You should write the checkPrime method in such a way that the code prints only the prime numbers.
Please read the code given in the editor carefully. Also please do not use method overloading!

Input Format-

There are only five lines of input, each containing one integer.

Output Format-

There will be only four lines of output.
Each line contains only prime numbers depending upon the parameters passed to checkPrime in the main method of the class Solution. 
In case there is no prime number, then a blank line should be printed.

Sample Input-

2
1
3
4
5

Sample Output-

2 
2 
2 3 
2 3 5      */


//CODE-


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import static java.lang.System.*;

class Prime {
 static void checkPrime(int...arr) {
  for (int i = 0; i < arr.length; i++) {
   boolean flag = false;
   for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
    if (arr[i] % j == 0) {
     flag = true;
     break;
    }
   }
   if (arr[i] > 1 && (!flag || arr[i] == 2)) {
    System.out.print(arr[i] + " ");
   }
  }
  System.out.println();
 }
}

public class Solution {

  public static void main(String[] args) {
    try{
    BufferedReader br=new BufferedReader(new InputStreamReader(in));
    int n1=Integer.parseInt(br.readLine());
    int n2=Integer.parseInt(br.readLine());
    int n3=Integer.parseInt(br.readLine());
    int n4=Integer.parseInt(br.readLine());
    int n5=Integer.parseInt(br.readLine());
    Prime ob=new Prime();
    ob.checkPrime(n1);
    ob.checkPrime(n1,n2);
    ob.checkPrime(n1,n2,n3);
    ob.checkPrime(n1,n2,n3,n4,n5);  
    Method[] methods=Prime.class.getDeclaredMethods();
    Set<String> set=new HashSet<>();
    boolean overload=false;
    for(int i=0;i<methods.length;i++)
    {
      if(set.contains(methods[i].getName()))
      {
        overload=true;
        break;
      }
      set.add(methods[i].getName());
      
    }
    if(overload)
    {
      throw new Exception("Overloading not allowed");
    }
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }
  
}
