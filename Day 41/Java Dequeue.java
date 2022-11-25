/*  Input Format-

The first line of input contains two integers N and M: representing the total number of integers and the size of the subarray, respectively.
The next line contains N space separated integers.

Output Format-

Print the maximum number of unique integers among all possible contiguous subarrays of size .

Sample Input-

6 3
5 3 5 2 3 2

Sample Output-

3           */

//CODE-

import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();
        
        int n = in.nextInt();
        int m = in.nextInt();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int input = in.nextInt();
            
            deque.add(input);
            set.add(input);
            
            if (deque.size() == m) {
                if (set.size() > max) max = set.size();
                int first = deque.remove();
                if (!deque.contains(first)) set.remove(first);
            }
        }
        
        System.out.println(max);
    }
}
