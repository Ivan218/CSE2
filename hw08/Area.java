/*
Ivan Rivera
CSE 002 Chen
hw08 Area.java program
PROGRAM 1 OF 2
*/

/*This program calculates the area of a shape and its parameters which are both 
specified by the user.*/

//import scanner
import java.util.Scanner;
public class Area {
    public static void main(String args[]) {
        //Create a scanner called input
        Scanner input = new Scanner(System.in);
        
        //INPUT
        //This is where the user inputs words until a valid shape is detected
        System.out.println("PLEASE PICK 'triangle', 'rectangle', or 'circle'");
        System.out.print("What shape would you like the area of? ");
        String shape = "0";
        while(true) {
            String answer = input.next();
            if(answer.equals("triangle")) {shape ="triangle"; break;}
            else if(answer.equals("circle")) {shape = "circle"; break;}
            else if(answer.equals("rectangle")) {shape = "rectangle"; break;}
            else {
                System.out.println("Please enter one of the shapes in all lowercase");
                System.out.println("The shapes are 'triangle', 'rectangle', or 'circle' ");
            }
        }
        //END INPUT
        
        /*Create area for later use in storing calculated area. Create dim1 and dim2 to represent
        the value of a dimension needed for any of the shapes. NOTE: dim2 goes unused in the area
        of a circle calculation*/
        double area = 0.0;
        if(shape.equals("triangle")) {
            area = AreaTri();
        }
        else if(shape.equals("rectangle")) {
            area = AreaRect();
        }
        else {
            area = AreaCircle();
        }
        System.out.println("The area of the "+shape+" is "+area);
    }//MAIN METHOD BRACE
    
    
    
    //This method takes the entered radius of a circle and returns the area
    public static double AreaCircle() {
        //INPUT
        System.out.println("Enter the radius of the circle");
        double radius = ReceiveInput();
        //END INPUT
        //calculate and return the area of the circle
        double calculate = 2*radius*3.14159265;
        return calculate;
    }//area of circle method brace
    
    
    //This method takes the entered dimensions of a rectangle and returns the area
    public static double AreaRect() {
        //INPUT the length and height of the rectangle
        System.out.println("Enter the length of the rectangle");
        double length = ReceiveInput();
        System.out.println("Enter the height of the rectangle");
        double height = ReceiveInput();
        //END INPUT
        //Calculate and return the area of the rectangle
        double calculate = length*height;
        return calculate;
    }//area of rectangle method brace
    
    
    //This method takes the input dimensions of a triangle and calculates area of the triangle
    public static double AreaTri() {
        //INPUTS
        //Prompt the user for a valid height, then prompt the user for a valid base length
        System.out.println("Enter the height of the triangle");
        double height = ReceiveInput();
        System.out.println("Enter the length of the base of the triangle");
        double base = ReceiveInput();
        //END INPUTS
        //calculate and return the area of the triangle
        double calculate = .5*base*height;
        return calculate;
    }//area of triangle method brace
    
    
    
    //This program is used to loop until a double is inputted by the user
    public static double ReceiveInput() {
        //define scanner method here as well
        Scanner input = new Scanner(System.in);
        //method loops until it is broken when a valid input is received, then returns that value
         double dim1 = 0.0;
         String test = "1";
         while(true) {
            System.out.print("Please enter a double value: ");
            if(input.hasNextDouble()) {
                dim1 = input.nextDouble();
                break;
            }
            else {System.out.println("This is not a double value");}
            input.next();
        }//while loop brace
        return dim1;
    }//receiveInput method brace
}//public class brace