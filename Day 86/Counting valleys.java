/*  Input Format -

The first line contains an integer steps, the number of steps in the hike.
The second line contains a single string path, of steps characters that describe the path.

Sample Input -

8
UDDDUDUU

Sample Output -

1

Explanation -

If we represent _ as sea level, a step up as /, and a step down as \, the hike can be drawn as:

_/\      _
   \    /
    \/\/
The hiker enters and leaves one valley.          */

//  CODE -

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextInt();
        String s = in.next();
        
        int level = 0;
        int valleys = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'U'){
                level++;
            }else if(s.charAt(i) == 'D'){
                if(level == 0){
                    valleys++;
                }
                level--;
            }
        }
        System.out.println(valleys);
    }
}
