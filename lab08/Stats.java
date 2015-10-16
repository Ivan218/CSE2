/*
Ivan Rivera
CSE 2 Chen
Lab 08
Stats.java program
*/

/*This program takes 5 inputs from smallest to largest (no other order) and
uses 3 methods to calculate the mean, the median and print out those two values!
*/



import java.util.Scanner;

public class Stats {
    
    public static void main(String args[]) {
        //Define a scanner
        Scanner input = new Scanner(System.in);
        
        //INPUT
        System.out.print("Gimme a number! ");
        double n1 = input.nextDouble();
        System.out.print("Gimme another number! ");
        double n2 = input.nextDouble();
        while(n2<n1) {
            System.out.print("This number should be bigger than the last, try again! ");
            n2 = input.nextDouble();
        }
        System.out.print("Gimme another number! ");
        double n3 = input.nextDouble();
        while(n3<n2) {
            System.out.print("This number should be bigger than the last, try again! ");
            n3 = input.nextDouble();
        }
        System.out.print("Gimme another number! ");
        double n4 = input.nextDouble();
        while(n4<n3) {
            System.out.print("This number should be bigger than the last, try again! ");
            n4 = input.nextDouble();
        }
        System.out.print("Gimme another number! ");
        double n5 = input.nextDouble();
        while(n5<n4) {
            System.out.print("This number should be bigger than the last, try again! ");
            n5 = input.nextDouble();
        }
        //END INPUT
        //Print out mean and median while calling those methods in one line
        printInfo(mean(n1,n2,n3,n4,n5), median(n1,n2,n3,n4,n5));
        
    }//main method brace
    
    //mean method
    //This method takes the average of the 5 inputs and returns that double value
    public static double mean(double num1, double num2, double num3, double num4, double num5) {
        double avg = (num1+num2+num3+num4+num5)/5.0;
        return avg;
    }//mean method brace
    
    //median method
    //This method returns the third value since the inputs are forced in this order anyways
    public static double median(double num1, double num2, double num3, double num4, double num5) {
        return num3;
    }//median method brace
    
    //printing method
    //This method prints using two inputs, which are intended to be the mean and median method calls
    public static void printInfo(double avg, double mediann) {
        System.out.println("The mean is "+ avg);
        System.out.println("The median is "+mediann);
    }//printInfo method brace
    
}//public class brace