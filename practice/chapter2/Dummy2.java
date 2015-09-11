//Read input monetary value, then give out the equivalent amount of money in the most efficient manner regarding change

import java.util.Scanner;

public class Dummy2 {
    
    public static void main(String args[]) {
        
        //Define variable that uses method: Scanner
        Scanner input = new Scanner(System.in);
        
        //prompt user for money value
        System.out.println("How much money we talkin'? ");
        double money = input.nextDouble();
        
        int remaining = (int)(money*100);
        
        int dollars = remaining/100;
        remaining %= 100;
        
        int quarters = remaining/25;
        remaining %= 25;
        
        int dimes = remaining/10;
        remaining %= 10;
        
        int nickels = remaining/5;
        remaining %= 5;
        
        int pennies = remaining;
        
        System.out.println("dollars: " + dollars);
        System.out.println("quarters: " + quarters);
        System.out.println("dimes: " + dimes);
        System.out.println("nickels: " + nickels);
        System.out.println("pennies: " + pennies);

    }

}