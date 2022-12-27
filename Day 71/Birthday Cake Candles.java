/*  Input Format -

The first line contains a single integer, n, the size of candles.
The second line contains n space-separated integers, where each integer i describes the height of candles[i].

Constraints -
1<=n<=10^5
1<=candles[i]<=10^7

Sample Input 0 -

4
3 2 1 3

Sample Output 0 -

2

Explanation 0 -

Candle heights are [3,2,1,3]. The tallest candles are 3 units, and there are 2 of them.         */

//CODE -

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int max = 0;
        int sum = 0;
        int num;
        for(int i =0; i < n; i++){
            num = in.nextInt();
            if(num > max){
                sum = 1;
                max = num;
            }else if(num == max){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
