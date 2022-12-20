/*Input Format -

The first line contains 3 space-separated integers, a[0], a[1], and a[2], the respective values in triplet a.
The second line contains 3 space-separated integers, b[0], b[1], and b[2], the respective values in triplet b.

Constraints -

1 ≤ a[i] ≤ 100
1 ≤ b[i] ≤ 100

Sample Input 0 -

5 6 7
3 6 10

Sample Output 0 -

1 1

Sample Input 1 -

17 28 30
99 16 8

Sample Output 1 -

2 1                 */

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

class Result {
    
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {int alice = 0;
    int bob = 0;
    List<Integer> answer = new ArrayList<>();
    for(int i = 0; i < 3; i++) {
        if (a.get(i) > b.get(i)) alice++;
        if (a.get(i) < b.get(i)) bob++;
    }
    answer.add(0,alice);
    answer.add(1,bob);
    return answer;
    }
    }

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.compareTriplets(a, b);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
