/*
Ivan Rivera
hw03
Block java program
*/


/*This program takes the dimensions of a block, input by the user, calculates, 
and displays the volume and surface area of a block with those dimensions. */



//Imports Scanner method from package
import java.util.Scanner;

//Define class which matches program identifier
public class Block {
    
    //Define main method for block program
    public static void main (String args[]) {
        
        //Define method to read keyboard input
        Scanner input = new Scanner(System.in);
        
        //Prompt user to input dimensions of block using Scanner. Saves dimensions
        System.out.println("Enter length of the block: ");
        double length = input.nextDouble();
        System.out.println("Enter width of the block: ");
        double width = input.nextDouble();
        System.out.println("Enter height of the block: ");
        double height = input.nextDouble();
        
        
        //Calculates volume
        double volume = length * width * height;
        
        //Calculates Surface Area
        double SA = 2 * (length*width + length*height + width*height);
        
        //prints volume and surface area
        System.out.println("The volume of the block is " + volume + 
        " and the surface area of the block is " + SA + ".");
        
    }//matches main method
    
}//matches public class Block