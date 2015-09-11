/*
Ivan Rivera
lab 03
Check.java program
*/

/*This program takes 3 inputs from the user (check total, desired tip %, # of ways
the check will be split), and totals the bill including tip then calculates & displays
how much each person will have to pay if the total is evenly split between all people
*/

//Imports the scanner method for later use
import java.util.Scanner;

//Define public class with name Check
public class Check {
    
    //Define main method
    public static void main (String args[]) {
        
        //Define scanner method called input to read inputs from keyboard
        Scanner input = new Scanner(System.in);
        
        //Prompt user for all inputs at once (check total, tip %, # ways check is split)
        System.out.print("What was the check total? ");
        double check = input.nextDouble();
        System.out.print("How much do you guys want to tip (in form XX)? ");
        int tip = input.nextInt();
        System.out.print("How many ways is this check being split?");
        int split = input.nextInt();
        
        //Calculate the total with tip before the check is split
        double total = check * (1.0 + (double)(tip/100.0));
        total = (double)((int)(total*100)/100.0);
        //Split the check
        double pay = (double)(total/split);
        //Cut off all excess decimal point values
        pay = (double)((int)(pay*100)/100.0);
        
        //Print the total for n people splitting a check
        System.out.println("The total was " + total + " and costs " + pay + 
        " for each person when split between " + split + " people.");
        
        
        
    }//Match main method brace
    
}//Match public class Timer