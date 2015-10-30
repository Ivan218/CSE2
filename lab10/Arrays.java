/*
Ivan Rivera
Brian Chen
CSE 002
10/30/15
*/

/*
*/

import java.util.Scanner;

public class Arrays {
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        int size = (int)(Math.random()*5+6);
        String[] students = new String[size];
        
        for(int i=0; i<size; i++) {
            System.out.print("Student name: ");
            students[i] = input.next();
        }//students for loop
        
        
        int[] midterms = new int[size];
        for(int j=0; j<size; j++) {
            midterms[j] = (int)(Math.random()*100);
        }//midterm for loop
        
        
        for(int k=0; k<size; k++) {
            System.out.println(students[k]+": "+midterms[k]);
        }//print for loop
        
        
    }//main method
}//public class