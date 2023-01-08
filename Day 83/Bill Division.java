/*  Input Format -

The first line contains two space-separated integers n and k, the number of items ordered and the 0-based index of the item that Anna did not eat.
The second line contains n space-separated integers bill[i] where 0<=i<n.
The third line contains an integer, b, the amount of money that Brian charged Anna for her share of the bill.

Output Format -

If Brian did not overcharge Anna, print Bon Appetit on a new line; otherwise, print the difference (i.e., bcharged-bactual) that Brian must refund to Anna. This will always be an integer.

Sample Input 0 -

4 1
3 10 2 9
12

Sample Output 0 -

5

Explanation 0 -

Anna didn't eat item bill[1]=10, but she shared the rest of the items with Brian. 
The total cost of the shared items is 3+2+9=14 and, split in half, the cost per person is bactual=7. Brian charged her bcharged=12 for her portion of the bill.
We print the amount Anna was overcharged, bcharged-bactual=12-7=5, on a new line.

Sample Input 1 -

4 1
3 10 2 9
7

Sample Output 1 -

Bon Appetit

Explanation 1 -

Anna didn't eat item bill[1]=10, but she shared the rest of the items with Brian. 
The total cost of the shared items is 3+2+9=14 and, split in half, the cost per person is bactual=7.
Because bactual-bcharged-7, we print Bon Appetit on a new line.               */

//CODE -

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int items = in.nextInt();
        int skipped = in.nextInt();
        
        int totalToSplit = 0;
        for (int i = 0; i < items; ++i) {
            int cost = in.nextInt();
            if (i != skipped) {
                totalToSplit += cost;
            }
        }
        
        int paid = in.nextInt();
        
        if (totalToSplit / 2 >= paid) {
            System.out.println("Bon Appetit");
        }
        else {
            System.out.println(paid - totalToSplit / 2);
        }
    }
}
