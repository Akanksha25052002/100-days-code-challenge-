/*Input Format-

Input from stdin is handled by the locked stub code in the Solution class.

The first line contains an integer,n, denoting the number of players.
Each of the n subsequent lines contains a player's name and score, respectively.

Output Format

You are not responsible for printing any output to stdout. The locked stub code in Solution will create a Checker object, use it to sort the Player array, and print each sorted element.

Sample Input

5
amy 100
david 100
heraldo 50
aakansha 75
aleksa 150
Sample Output

aleksa 150
amy 100
david 100
aakansha 75
heraldo 50          */

//CODE-

import java.util.*;

class Checker implements Comparator<Player>{

        public int compare(Player a, Player b) {
            
            if(a.score == b.score){
                
                return a.name.compareTo(b.name);
            }    

             
            return ((Integer) b.score).compareTo(a.score);
        }
    }


class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
