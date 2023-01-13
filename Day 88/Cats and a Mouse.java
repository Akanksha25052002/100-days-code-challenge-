/*  Input Format -

The first line contains a single integer, q, denoting the number of queries.
Each of the q subsequent lines contains three space-separated integers describing the respective values of x (cat A's location),
y (cat B's location), and z (mouse C's location).

Constraints -
1<=q<=100
1<=x,y,z<=100

Sample Input 0

2
1 2 3
1 3 2
Sample Output 0

Cat B
Mouse C           */

// CODE -

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            
            int catADist = Math.abs(x-z);
            int catBDist = Math.abs(y-z);
            if (catADist == catBDist) {
                System.out.println("Mouse C");
            } else if (catADist < catBDist) {
                System.out.println("Cat A");
            } else {
                System.out.println("Cat B");
            }
            
        }
    }
}
