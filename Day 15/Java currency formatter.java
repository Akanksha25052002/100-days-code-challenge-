/*  Input Format-
A single double-precision number denoting payments .

Output Format-
On the first line, print US: u where u is payment formatted for US currency.
On the second line, print India: i where i is payment formatted for Indian currency.
On the third line, print China: c where c is payment formatted for Chinese currency.
On the fourth line, print France: f, where f is payment formatted for French currency.

Sample Input-
12324.134

Sample Output-
US: $12,324.13
India: Rs.12,324.13
China: ￥12,324.13
France: 12 324,13 €

Explanation-
Each line contains the value of payment formatted according to the four countries' respective currencies.   */


//CODE-

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
     NumberFormat usFormat=NumberFormat.getCurrencyInstance(Locale.US);
     NumberFormat cnFormat=NumberFormat.getCurrencyInstance(Locale.CHINA);
     NumberFormat frFormat=NumberFormat.getCurrencyInstance(Locale.FRANCE);
     NumberFormat inFormat=NumberFormat.getCurrencyInstance(new Locale("en","in"));
     
     String us = usFormat.format(payment);
     String india = inFormat.format(payment);
     String france = frFormat.format(payment);
     String china = cnFormat.format(payment);
     
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
