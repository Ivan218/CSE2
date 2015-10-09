/*
Ivan Rivera
Lab 07
Encrypted X java program
*/





import java.util.Scanner;

public class encrypted_x {
    
    public static void main(String args[]) {
        //new scanner for keyboard inputs
        Scanner input = new Scanner(System.in);
        System.out.print("Input square side length: ");
        int number = input.nextInt();
        
        for(int i = 0; i<number; i++) {
            for(int j = 0; j<number; j++) {
                if((j==i)||(j==(number-i))) {System.out.print(" ");}
                else{System.out.print("*");}
            }
            System.out.println();
        }
        
    }//match main method
}//match public class