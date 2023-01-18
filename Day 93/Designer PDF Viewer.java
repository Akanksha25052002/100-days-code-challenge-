/*  Input Format -

The first line contains 26 space-separated integers describing the respective heights of each consecutive lowercase English letter, ascii[a-z].
The second line contains a single word consisting of lowercase English alphabetic letters.

Sample Input 0 -

1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5
abc

Sample Output 0 -

9

Explanation 0 -

We are highlighting the word abc:

Letter heights are a=1, b=3 and c=1. The tallest letter, b, is 3mm high. The selection area for this word is 3.1mm.3mm=9mm^2.

Note: Recall that the width of each character is 1mm.

Sample Input 1 -

1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 7
zaba

Sample Output 1 -

28

Explanation 1 -

The tallest letter in zaba is z at 7mm. The selection area for this word is 4.1mm.7mm=28mm^2.         */

// CODE -

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.*;

public class Solution {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] c = new int[26];
    for (int i = 0; i < 26; ++i) {
      c[i] = in.nextInt();
    }
    String w = in.next();
    int maxH = 0;
    for (char letter : w.toCharArray()) {
      if (c[letter - 'a'] > maxH) maxH = c[letter - 'a'];
    }
    System.out.println(maxH*w.length());
  }
}
