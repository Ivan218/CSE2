/*
Ivan Rivera
hw07
Twisty.java program
CSE2 Prof. Chen
*/

/* This program takes two inputs as doubles that identify the dimensions of a repeated
pattern. The program then runs for loops based on the inputs of the dimensions and
generates the helical pattern accordingly
*/



//import scanner for inputs
import java.util.Scanner;

public class Twisty {
    
    public static void main(String args[]) {
        
        //declare scanner method and call it "input"
        Scanner input = new Scanner(System.in);
        
        //BEGIN INPUTS
        //loop until valid inputs are detected for length and width
        System.out.print("Desired length? ");
        double dLength=0;
        
        while(true) {
            if(input.hasNextDouble()) {
                dLength = input.nextDouble();
                if(dLength<=80 && dLength>0) {break;}
                else {System.out.println("Input an int between 1 and 80: ");}
            }
            else {System.out.print("ERROR. Try again: ");}
            input.next();
        }
        
        System.out.print("Desired width? ");
        double dWidth=0;
        
        while(true) {
            if(input.hasNextDouble()) {
                dWidth = input.nextDouble();
                if(dWidth<=dLength && dWidth>0) {break;}
                else {System.out.println("ERROR. Try again: ");}
            }
            else {System.out.print("ERROR. Try again: ");}
            input.next();
        }
        //END INPUTS
        
        //use add to allow for calculations to hit various positions on different lines to create the desired pattern
        int add = 0;
        //BEGIN LOOPING PRINT STATEMENTS
        //first for loop controls the number of lines, the second controls what goes in each line according to modulus arithmetic
        //the first and last line avoid this method, so they are accounted for in the first two if-statements
        for(int i=1; i<=dWidth; i++) {
            for(int j=1; j<=dLength; j++) {
                
                add=(int)(i%(2*dWidth));
                if(i==1 && j%(2*dWidth)==0) {System.out.print("#");}
                else if(i==dWidth && j%(2*dWidth)==0) {System.out.print("\\");}
                else if(j%(2*dWidth)==add || j%(2*dWidth)==(2*dWidth-add+1)) {System.out.print("#");}
                else if(j%(2*dWidth)==(dWidth-add+1)) {System.out.print("/");}
                else if(j%(2*dWidth)==(dWidth+add)) {System.out.print("\\");}
                else {System.out.print(" ");}
            }//inner for loop
            System.out.println();
        }//outer for loop
        
        
    }//match main method brace
}//match public class brace