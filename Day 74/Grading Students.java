/* Input Format

The first line contains a single integer, n, the number of students.
Each line i of the n subsequent lines contains a single integer, grades[i].

Constraints -
1<=n<=60
0<=grade[i]<=100

Sample Input 0 -

4
73
67
38
33

Sample Output 0 -

75
67
40
33    */

//CODE -

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            int grade = in.nextInt();
            if (grade >= 38) {
                if (grade%5 >= 3) grade = grade/5*5 + 5;
            }
            System.out.println(grade);
        }
    }
}

