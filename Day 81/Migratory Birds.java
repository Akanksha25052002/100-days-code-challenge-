/*  Input Format -

The first line contains an integer, n, the size of arr.
The second line describes arr as n space-separated integers, each a type number of the bird sighted.

Constraints -
5<=n<=2x10^5

It is guaranteed that each type is 1, 2, 3, 4, or 5.
Sample Input 0

6
1 4 4 4 5 3
Sample Output 0

4
Explanation 0

The different types of birds occur in the following frequencies:

Type 1:1  bird
Type 2:0  birds
Type 3:1  bird
Type 4:3  birds
Type 5:1  bird
The type number that occurs at the highest frequency is type 4, so we print 4 as our answer.

Sample Input 1 -

11
1 2 3 4 5 4 3 2 1 3 4

Sample Output 1 -

3

Explanation 1 -

The different types of birds occur in the following frequencies:

Type 1:2 
Type 2:2 
Type 3:3 
Type 4:3 
Type 5:1 
Two types have a frequency of 3, and the lower of those is type 3.       */

//CODE -

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] types = new int[n];
        for(int types_i=0; types_i < n; types_i++){
            types[types_i] = in.nextInt();
        }
        // your code goes here
        
        Map<Integer, Long> typesToCountMap = IntStream.of(types).
                boxed().
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        Long maxCount = typesToCountMap.values().stream().
                max(Comparator.naturalOrder()).
                get();

        List<Integer> typeWithMaxCount = typesToCountMap.entrySet().stream().
                filter(item -> Objects.equals(item.getValue(), maxCount)).
                map(Map.Entry::getKey).
                collect(Collectors.toList());
        System.out.println(typeWithMaxCount.get(0));
    }
}
