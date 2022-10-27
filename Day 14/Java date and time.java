/*Input Format

A single line of input containing the space separated month, day and year, respectively, in MM DD YYYY format

Sample Input-
08 05 2015

Sample Output-
WEDNESDAY

Explanation-
The day on August 5th 2015 was WEDNESDAY.            */



//CODE-


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
class Result {

    public static String findDay(int month, int day, int year) {
        // Create a new calendar
        Calendar myCal = Calendar.getInstance();
                // Set the current date using calendar fields. Note: The month indices start from 0.
        myCal.set(year, month-1, day);
                // Get the day of the week field of this calendar
        switch (myCal.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.MONDAY:
                return "MONDAY";
            case Calendar.TUESDAY:
                return "TUESDAY";
            case Calendar.WEDNESDAY:
                return "WEDNESDAY";
            case Calendar.THURSDAY:
                return "THURSDAY";
            case Calendar.FRIDAY:
                return "FRIDAY";
            case Calendar.SATURDAY:
                return "SATURDAY";
            case Calendar.SUNDAY:
                return "SUNDAY";
            default:
                return "";    
        }
    }

public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int month = scanner.nextInt();
            int day = scanner.nextInt();
            int year = scanner.nextInt();

            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.DATE, day);
            calendar.set(Calendar.MONTH, month - 1);
            calendar.set(Calendar.YEAR, year);

            System.out.println(calendar.getDisplayName(Calendar.DAY_OF_WEEK,
                    Calendar.LONG, new Locale("en", "US")).toUpperCase());
        }
    }
}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
