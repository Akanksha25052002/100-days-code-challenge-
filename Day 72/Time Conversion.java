/*  Input Format -

A single string s that represents a time in 12-hour clock format

Constraints -

All input times are valid

Sample Input 0 -

07:05:45PM

Sample Output 0 -

19:05:45       */

//CODE -

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Result {

    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         String time = in.next();
         String listTime[] = time.split(":");
         String hour = listTime[0];
         String minutes = listTime[1];
         String secounds = listTime[2].substring(0, 2);
         String caser = listTime[2].substring(2, 4);
         if(caser.equals("AM")){
             if(hour.equals("12"))
                    hour="00";
 
             System.out.println(hour+":"+minutes+":"+secounds);
         }else{
             if(!hour.equals("12")){
                 int h = Integer.parseInt(hour); 
                 h = h +12; 
                 hour =""+h; 
             }
             System.out.println(hour+":"+minutes+":"+secounds);
         }
    }
}
 
    

