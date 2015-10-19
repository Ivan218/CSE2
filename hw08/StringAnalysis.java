/*Ivan Rivera
Prof. Chen
CSE 002
hw08
StringAnalysis Program
Program 2 of 2 */

/*This program takes a string from the user as well as an integer in order to
determine how much of the user's string will be examined*/
//import scanner method
import java.util.Scanner;

public class StringAnalysis {
    public static void main(String args[]) {
        //create a scanner
        Scanner input = new Scanner(System.in);
        
        System.out.print("What's your string? ");
        String userStr;
        while(true) {
            
            if (input.hasNext()){
                //if so, store it.
                userStr = input.next();
                break;
            }
            else{
                //if not, trash it.  This does not assign the output of 
                //next() to anything. The output is just discarded.
                System.out.println("     ERROR: need a string");
                System.out.print("Input your string: ");
                input.next();
            }
        }
        
        
        System.out.print("How many characters would you like to examine? ");
        int num;
        while(true) {
            if (input.hasNextInt()){
                //if so, store it.
                num = input.nextInt();
                break;
            }
            else{
                //if not, trash it.  This does not assign the output of 
                //next() to anything. The output is just discarded.
                System.out.println("     ERROR: need an Int");
                System.out.print("Input your Int: ");
                input.next();
            }
        }
        
        
        //Call the corresponding method for use and retrieve number of digits in the string
        int countNumbers = 0;
        if(num>=userStr.length()) {countNumbers = StringMethod(userStr);}
        else {countNumbers = StringMethod(userStr, num);}
        //Print whether numbers were found and how many if there were any
        if(countNumbers==0) {System.out.println("There were no numbers found in your string!");}
        else{System.out.println(countNumbers+" numbers were found in your string.");}
    }//main method brace
    
    
    //This is the method that is used if the user wants to examine the whole string
    //A loop is used to examine each character of the string. The number of digits is recorded & returned
    public static int StringMethod(String string) {
        int counter = 0;
        for(int j = 0; j<string.length(); j++) {
            char k = (char)(string.charAt(j));
            if(Character.isDigit(k)) {counter++;}
        }
        return counter;
    }//END COMPLETE STRING METHOD
    
    //This method is used if the user wants to examine a specific portion of the string
    //A loop is used to examine each character of the string until the number of characters
    //examined matches the user's specifications for examination. The number of digits is recorded & returned
    public static int StringMethod(String string, int number) {
        int counter = 0;
        for(int j = 0; j<number; j++) {
            char k = (char)(string.charAt(j));
            if(Character.isDigit(k)) {counter++;}
        }
        return counter;
    }//END SPECIFIC STRING METHOD
    
}//public class brace