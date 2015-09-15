/*
This game is to be a skeleton for different aspects
of larger, more complex games.
*/

import java.util.Scanner;

public class Game1 {
    public static void main (String args[]) {
        
        
        //BEGIN CHARACTER CREATION
        //Define scanner method
        Scanner input = new Scanner(System.in);
        
        //Intro to game
        System.out.println("Ready to play? (yes/no)");
        String play = input.next();
        if(play.equals("yes")) {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
        }
        else
            System.out.println("I didn't like your response.. Oh well.");
        
        
        //roll for stats happens here
        int luck=0;
        double roll = Math.random()*6;
        if(roll<2)
            luck = 4;
        else if(roll<4)
            luck = 5;
        else if(roll<=6)
            luck = 6;
        
        //Develop stats here. Take inputs and create stats
        System.out.println("Stat points to distribute: "+luck);
        System.out.println("Number of points towards attack? ");
        int stat = input.nextInt();
        if(stat<=luck && stat >=0) {
            int attack = stat;
            luck -= stat;
        }
        else {
            System.out.println("You cheat so soon, you break my game.");
        }
        
        //HITPOINTS
        if(luck>0) {
            System.out.println("Number of points towards HP? ");
            int maxHP = input.nextInt() + 1;
        }
        else {
            int maxHP=1;
        }
        
        int HP = maxHP;
        System.out.println("Welcome to Game1, developed by IWins. We hope you enjoy this experience!");
        //END CHARACTER CREATION
        
        
        
        //BEGIN JOUNREY!!! DUNGEON 01
        System.out.println("Your max HP is "+maxHP+" and your attack is "+attack);
        System.out.println("Try your first battle against this squirrel!");
        
        //Squirrel stats
        int HP1 = 3;
        int Att1 = 2;
        
        System.out.println("Lemme know when you're ready!");
        String waste = input.next();
        
        int dmg;
        int mDmg;
        
        //BATTLE WITH SQUIRREL
        while(HP>=0 || mHP1>=0); {
            if(HP>0) {
                dmg = (int)(Math.random()*attack/(attack-.1*attack)+1.0);
                HP1 -= dmg;
                if(HP1 >0) {
                    mDmg = (int)(Math.random()*mAtt1/(mAtt1-.1*mAtt1)+1.0);
                    HP -= mDmg;
                }
                else {
                    System.out.println("You win! Great!");
                    System.exit(1);
                }
            }
            else {
                System.out.println("You lost. Sorry!");
                System.exit(1);
            }
        }
        
        
    }//match main method brace
}//match class brace