/*
Ivan Rivera
hw06
CheckDigit Program
*/


/*This program takes an ISBN input and checks the validity of the ISBN of either 
length 10 or 13. If the ISBN is valid, then the output says this. If the ISBN is
invalid, then program will return the last digit that would make a valid ISBN
with the same numbers aside from the remainder. */

//import scanner
import java.util.Scanner;

public class CheckDigit {
    
    public static void main (String args[]) {
        
        //Declare scanner method
        Scanner input = new Scanner(System.in);
        
        //NOTE: isbn will represent the STRING TYPE while ISBN represents the INT TYPE
        long ISBN = 0;
        
        //START Loop until an ISBN of appropriate length is used
        System.out.println("ISBN to be validated?");
        String isbn = input.next();
        while(isbn.length()!=10) {
            System.out.println("INVALID ISBN LENGTH");
            System.out.println("ISBN to be validated?");
            isbn = input.next();
        }
        //END Loop
        
        //Initializes remainder variable to check for X in given ISBN
        //NOTE: rem is the last digit represented in the given ISBN while remC
        //is the correct and calculated last digit to compare to rem to validate ISBN
        int rem = 0;
        int remC = 0;
        /*Checks for X in last index of isbn, assigning rem a value of 10 if it is X
        AND creates a new ISBN string without the last digit and replacing it with 0
        if X is rem part of isbn. Regardless, the string is the converted to an int with
        temporary and unimportant modifications to strings with X in them (to keep a consistent
        number of digits in the long variable)*/
        if(isbn.substring(9).equals("X")) {
            ISBN = Long.parseLong(isbn.substring(0,isbn.length()-1)+"0");
            rem = 10;
        }
        else {
            ISBN = Long.parseLong(isbn);
            rem = Integer.parseInt(isbn.substring(9));
        }
        System.out.println(rem);
        System.out.println(ISBN);
        System.out.println(isbn);
        
        //Create variable nisbn to allow for a separate manipulation of the string
        //isbn without modifying original isbn identifier
        //calculate is used to store calculations of sum of products of isbn and 
        //a number following the pattern
        long nisbn = ISBN;
        int calculate=0;
        System.out.println(nisbn+"      nisbn");
        //performs a method that performs algorithms for the pattern for 
        //verifying ISBNs of either 13 digits or 10 digits in length
        for(int i=9; i>0; i--) {
            calculate += (int)(nisbn/Math.pow(10,i))*(i+1);
            nisbn = (long)(ISBN%Math.pow(10,i));
            System.out.println(calculate+"    "+i);
        }//match for
        
        //calculate the correct remainder and store in remC to compare to rem
        remC = calculate%11;
        
        //compare remC (the correct remainder) to rem (the given remainder)
        //also give correct ISBN if (remC==rem)==false
        if(rem==remC) {
            System.out.println("VALID ISBN!");
        }
        else {
            if(remC!=10) {
            System.out.println("INVALID ISBN");
            System.out.println("ISBN NUMBER SHOULD BE "+isbn.substring(0,9)+remC);
            }
            else {
                System.out.println("INVALID ISBN");
                System.out.println("ISBN NUMBER SHOULD BE "+isbn.substring(0,8)+"X");
            }
        }//match if statement
        
        
    }//match public static void main method brace
}//match public class brace