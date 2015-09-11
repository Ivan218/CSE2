/*
Ivan Rivera
hw03
Timer java program
*/

/*The program prompts the user for the current time and a time at which the 
user has plans then calculates and prints the amount of time until the plans
occur. */

/*So far the main method does work so long as the user does not input any times
in which a subtraction operation with times from the next hour become issues due
to the 60-minute hourly nature of time and the 0-100 nature of combinametrics*/

//Import method that allows program to receive input from keyboard
import java.util.Scanner;


//Define the class that refers to the program
public class Timer {
    
    //Defne main method
    public static void main (String args[]) {
        
        //Define method input of class Scanner to take inputs from keyboards
        Scanner input = new Scanner(System.in);
        
        //Prompt user to give current time via keyboard input
        System.out.println("What time is it? (Military time!) ");
        int currentTime = input.nextInt();
        
        //Prompt user to give dinner plans a time via keyboard input
        System.out.println("What time does your dinner plans start? (Military time!)");
        int dinnerTime = input.nextInt();
        
        //Create new var (timeMath) to perform calculations
        int timeMath = dinnerTime - currentTime;
        
        /* Calculate time remaining using the remainder method and print the
        statement to the console in the next few lines*/
        
        int hours = timeMath/100;
        int minutes = timeMath - (timeMath/100) * 100;
        System.out.println("You have " + hours + " hours & " + minutes +
            " minutes until your dinner plans start!");
        

    } //match main method brace

}//match public class Timer brace