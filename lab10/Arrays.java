/*
Ivan Rivera
<<<<<<< HEAD
Prof. Chen
CSE002
lab10 Arrays

/*
*/

import java.util.Scanner;

public class Arrays {
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        int size = (int)(Math.random()*5+6);
        String[] students = new String[size];

        int[] midterms = new int[size];
        for(int i=0; i<size; i++) {
            System.out.print("Student name: ");
            students[i] = input.next();
            midterms[i] = (int)(Math.random()*101);
        }
        for(int i=0; i<size; i++) {System.out.println(students[i]+": "+midterms[i]);}
    }
}