/*Input Format-

The first line will have an integer n denoting the number of entries in the phone book.
Each entry consists of two lines: a name and the corresponding phone number.

Output Format-

For each case, print "Not found" if the person has no entry in the phone book.
Otherwise, print the person's name and phone number. See sample output for the exact format.

Sample Input-

3
uncle sam
99912222
tom
11122222
harry
12299933
uncle sam
uncle tom
harry

Sample Output-

uncle sam=99912222
Not found
harry=12299933     */

//CODE-

import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
        HashMap<String,Integer> hm = new HashMap<>();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
             hm.put(name,phone);
			in.nextLine();
            
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
            if(hm.containsKey(s)){
                System.out.println(s+"="+hm.get(s));
            }
            else{
                System.out.println("Not found");
            }
        }
    }
}


