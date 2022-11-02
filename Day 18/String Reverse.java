/* First we take input from user and then check given input is palindrom or not . 
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
if the given input is palindrom then print "Yes" otherwise print "No".

Sample Input-
madam

Sample Output-
Yes
               */


//CODE-


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
       String R=new StringBuilder(A).reverse().toString();
       if(A.equals(R)){
           System.out.println("Yes");
       }
       else{
           System.out.println("No");
       }
        }
    }
