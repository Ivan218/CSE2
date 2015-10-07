/*
Ivan Rivera
hw06
BarGraph Program
*/


/*This program takes valid inputs on expenses per day, provides a graph representation
of expenditures, calculates average daily expenditures, then calculates an estimate of
4 year expenditures*/

//import scanner
import java.util.Scanner;

public class BarGraph {
    
    public static void main (String args[]) {
        
        //Declare scanner method
        Scanner input = new Scanner(System.in);
        
        //Get costs for each day of the week stored into identifiers with corresponding day of week
        
        System.out.print("Expenses for Monday:     $");
        double Mon = input.nextDouble();
        while(Mon<0) {
            System.out.print("invalid input, either negative or not a number, try again:   $");
            Mon = input.nextDouble();
        }
        System.out.print("Expenses for Tuesday:    $");
        double Tue = input.nextDouble();
        while(Tue<0) {
            System.out.print("invalid input, either negative or not a number, try again:   $");
            Tue = input.nextDouble();
        }
        System.out.print("Expenses for Wednesday:  $");
        double Wed = input.nextDouble();
        while(Wed<0) {
            System.out.print("invalid input, either negative or not a number, try again:   $");
            Wed = input.nextDouble();
        }
        
        System.out.print("Expenses for Thursday:   $");
        double Thu = input.nextDouble();
        while(Thu<0) {
            System.out.print("invalid input, either negative or not a number, try again:   $");
            Thu = input.nextDouble();
        }
        
        System.out.print("Expenses for Friday:     $");
        double Fri = input.nextDouble();
        while(Fri<0) {
            System.out.print("invalid input, either negative or not a number, try again:   $");
            Fri = input.nextDouble();
        }
        
        System.out.print("Expenses for Saturday:   $");
        double Sat = input.nextDouble();
        while(Sat<0) {
            System.out.print("invalid input, either negative or not a number, try again:   $");
            Sat = input.nextDouble();
        }
        
        System.out.print("Expenses for Sunday:     $");
        double Sun = input.nextDouble();
        while(Sun<0) {
            System.out.print("invalid input, either negative or not a number, try again:   $");
            Sun = input.nextDouble();
        }
        //calculate average daily expenses
        double avg = (Mon+Tue+Wed+Thu+Fri+Sat+Sun)/7.00;
        
        //while loops create bar graphs with one '*' per dollar spent
        //create counters for each day first
        int a = (int)Mon;
        int b = (int)Tue;
        int c = (int)Wed;
        int d = (int)Thu;
        int e = (int)Fri;
        int f = (int)Sat;
        int g = (int)Sun;
        
        System.out.println();
        System.out.println("Expenses for Monday:   ");
        while(a>0) {
            System.out.print("*");
            a-=1.00;
        }
        System.out.println("");
        System.out.println("Expenses for Tuesday:   ");
        while(b>0) {
            System.out.print("*");
            b-=1.00;
        }
        System.out.println("");
        System.out.println("Expenses for Wednesday:    ");
        while(c>0) {
            System.out.print("*");
            c-=1.00;
        }
        System.out.println("");
        System.out.println("Expenses for Thursday:    ");
        while(d>0) {
            System.out.print("*");
            d-=1.00;
        }
        System.out.println("");
        System.out.println("Expenses for Friday:    ");
        while(e>0) {
            System.out.print("*");
            e-=1.00;
        }
        System.out.println("");
        System.out.println("Expenses for Saturday:    ");
        while(f>0) {
            System.out.print("*");
            f-=1.00;
        }
        System.out.println("");
        System.out.println("Expenses for Sunday:    ");
        while(g>0) {
            System.out.print("*");
            g-=1.00;
        }
        System.out.println("");
        //END PRINTING
        //Print separators then avg
        System.out.println("_________________________");
        System.out.println("_________________________");
        System.out.println("Your average daily expenses are $"+((int)(avg*100.0)/100.0));
        
        
        double fluctuate = 0;
        double est = 0;
        //create fluctuation using Math.random()
        //est keeps track of 4 year estimate of expenditures
        //using a for loop, calculate estimated expenditure for 4 years
        for(int i=1; i<208; i++) {
            fluctuate = (Math.random()*40-20.0)/100.0;
            est += ((fluctuate+1.0)*avg)*7;
            avg *=fluctuate+1.0;
        }
        System.out.println("Your estimated expenditures for the next 4 years total to: $"+((int)(est*100.0)/100.0));
    }//match public static void main method
}//match public class