/*Input Format-
The first line has an integer n. 
In each of the next n lines there will be an integer d denoting number of integers on that line and then there will be d space-separated integers.
In the next line there will be an integer q denoting number of queries. Each query will consist of two integers x and y.

Output Format-
In each line, output the number located in yth position of xth line. If there is no such position, just print "ERROR!"

Sample Input-
5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5

Sample Output-
74
52
37
ERROR!
ERROR!            */


//CODE-

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

    int total=scan.nextInt();

    ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();

    for(int i=0;i<total;i++)
    {
     int size=scan.nextInt();
     ArrayList<Integer> list=new ArrayList();

     for(int j=0;j<size;j++)
       {
          int item=scan.nextInt();
          list.add(item);
       }
      mainlist.add(list);
   }

    int totalprint=scan.nextInt();
    for(int k=0;k<totalprint;k++)
    {
      int row=scan.nextInt();
      int col=scan.nextInt();
      try
       {
       System.out.println(mainlist.get(row-1).get(col-1));
       }
      catch(Exception e)
      {
      System.out.println("ERROR!");
      }
    }
    scan.close();
    }
}
