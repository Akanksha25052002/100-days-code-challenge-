/* Function Description-
Complete the isAnagram function in the editor.

isAnagram has the following parameters:
string a: the first string
string b: the second string

Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies.

Returns
boolean: If a and b are case-insensitive anagrams, return true. Otherwise, return false.

Input Format-
The first line contains a string a .
The second line contains a string b .

Sample Input 0

anagram
margana
Sample Output 0

Anagrams
Explanation 0

Character	Frequency: anagram	Frequency: margana
A or a	3	3
G or g	1	1
N or n	1	1
M or m	1	1
R or r	1	1
The two strings contain all the same letters in the same frequencies, so we print "Anagrams".

Sample Input 1-
anagramm
marganaa

Sample Output 1-
Not Anagrams

Explanation 1-
Character	Frequency: anagramm	Frequency: marganaa
A or a	3	4
G or g	1	1
N or n	1	1
M or m	2	1
R or r	1	1
The two strings don't contain the same number of a's and m's, so we print "Not Anagrams".

Sample Input 2-
Hello
hello

Sample Output 2-
Anagrams

Explanation 2-
Character	Frequency: Hello	Frequency: hello
E or e	1	1
H or h	1	1
L or l	2	2
O or o	1	1
The two strings contain all the same letters in the same frequencies, so we print "Anagrams".
     */


//CODE-


mport java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        a=a.toLowerCase();
        b=b.toLowerCase();
        char[] ch1=a.toCharArray();
        char[] ch2=b.toCharArray();
        java.util.Arrays.sort(ch1);
        java.util.Arrays.sort(ch2);
        String s1=new String(ch1);
        String s2=new String(ch2);
        if(s1.equals(s2)){
            return true;
        }
        else{
            return false;
        }
    }


  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
