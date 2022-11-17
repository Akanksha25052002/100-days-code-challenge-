/*Input Format-

The first line contains an integer,q, denoting the number of queries (i.e., function calls).
The 2.q subsequent lines describe each query over two lines:

The first line contains two space-separated integers describing the respective values of n and leap.
The second line contains n space-separated binary integers (i.e., zeroes and ones) describing the respective values of game0,game1,.....,gamen-1.

Sample Input-

STDIN           Function
-----           --------
4               q = 4 (number of queries)
5 3             game[] size n = 5, leap = 3 (first query)
0 0 0 0 0       game = [0, 0, 0, 0, 0]
6 5             game[] size n = 6, leap = 5 (second query)
0 0 0 1 1 1     . . .
6 3
0 0 1 1 1 0
3 1
0 1 0

Sample Output-

YES
YES
NO    
NO             */


//CODE-

import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        int i = 0;
    int n = game.length;
    while (true) {
        while (i + leap < n && game[i + leap] == 0) {
            i += leap;
        }
        while (i + 1 < n && game[i + 1] == 0) {
            i++;
        }
        if (i == n - 1 || i + leap >= n) {
            return true;
        }
        if (game[i + 1] != 0 && game[i + leap] != 0) {
            boolean backleap = false;
            for (int back = 0; game[i - back] == 0; back++) {
                if (game[i - back + leap] == 0) {
                    i += leap - back;
                    backleap = true;
                    break;
                }
                if (i - back == 0) {
                    break;
                }
            }
            if (backleap) {
                continue;
            }
            return false;
        }
    }
}


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
