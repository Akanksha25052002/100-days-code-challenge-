/*  Input Format -

A single integer denoting year .

Constraints

1700 \le y \le 2700

Output Format -

Print the full date of Day of the Programmer during year y in the format dd.mm.yyyy, 
where dd is the two-digit day, mm is the two-digit month, and yyyy is y.

Sample Input 0 -

2017

Sample Output 0 -

13.09.2017

Explanation 0 -

In the year y = 2017, January has 31 days, February has 28 days, March has 31 days, April has 30 days, May has 31 days, 
June has 30 days, July has 31 days, and August has 31 days. When we sum the total number of days in the first eight months,
we get 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 = 243.
Day of the Programmer is the 256th day, so then calculate 256 - 243 = 13 to determine that it falls on day 13 of the 9th month (September).
We then print the full date in the specified format, which is 13.09.2017.

Sample Input 1 -

2016

Sample Output 1 -

12.09.2016

Explanation 1 -

Year y = 2016 is a leap year, so February has 29 days but all the other months have the same number of days as in 2017. 
When we sum the total number of days in the first eight months, we get 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 = 244. 
Day of the Programmer is the 256th day, so then calculate 256 - 244 = 12 to determine that it falls on day 12 of the 9th month (September). 
We then print the full date in the specified format, which is 12.09.2016.

Sample Input 2 -

1800

Sample Output 2 -

12.09.1800

Explanation 2 -

Since 1800 is leap year as per Julian calendar. Day lies on 12 September.       */

//CODE -

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int daysInFeb(int year){
        if(year == 1918){
            return 15;
        } else if (year < 1918) {
            if (year % 4 == 0) {
                return 29;
            } else{
                return 28;
            }
        } else { 
            if (year % 400 == 0){
                return 29;
            } else if (year % 100 == 0){
                return 28;
            } else if (year % 4 == 0){
                return 29;
            } else {
                return 28;
            }
        }
    }
    
    public static int daysInMonth(int month, int year){
        if (month == 2) return daysInFeb(year);
        else if (Arrays.asList(1,3,5,7,8,10,12).contains(month)){
            return 31;
        } else return 30;
    }
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        int month = 0;
        int dayssofar = 0;
        while (dayssofar <= 256){
            month++;
            dayssofar += daysInMonth(month,year);
        }
        int day = daysInMonth(month,year);
        if (month == 2 && year == 1918) day += 13;
        while (dayssofar > 256) {
            day--;
            dayssofar--;
        }
        System.out.format("%02d.%02d.%04d",day,month,year);   
    }
}
