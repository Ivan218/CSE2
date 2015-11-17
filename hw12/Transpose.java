/*
Ivan Rivera
CSE2 Prof. Chen
hw12 Transpose Program

This program takes inputs for the dimensions of a matrix which are only positive integers.
A random matrix with each index having an int-value between -10 and 10 is generated and printed.
Then the matrix is transposed and printed.*/

import java.util.Scanner;

public class Transpose {
    
    public static void main(String args[]) {
        Scanner scans = new Scanner(System.in);
        
        System.out.println("Width and height of random matrix? ");
        int width=scans.nextInt();
        int height=scans.nextInt();
        System.out.println();
        
        int[][] a=randomMatrix(width,height);
        printMatrix(a);
        
        int[][] aT=transposeMatrix(a);
        printMatrix(aT);
        
    }//main method
    
    
    //This method uses the inputs as parameters for generating a matrix with random values at each index
    public static int[][] randomMatrix(int width, int height) {
        int[][] array=new int[height][width];
        
        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array[i].length; j++) {
                array[i][j]=(int)(Math.random()*21)-10;
            }
        }
        return array;
    }//randomMatrix
    
    /*This method loops through rectangular 2D-arrays and prints the contents.
    If the matrix is not rectangular, a warning message is printed.*/
    public static void printMatrix(int[][] array) {
        int example=array[0].length;
        for(int i=1; i<array.length; i++) {
            if(array[i].length!=example) {
                System.out.println("WARNING! MATRIX NOT RECTANGULAR!");
                return;
            }
        }
        
        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array[i].length; j++) {
                System.out.print(array[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println();
    }//printMatrix[][]
    
    //This method transposes the matrix creating a new matrix to represent the transposed one
    public static int[][] transposeMatrix(int[][] array) {
        int r = array.length;
        int c = array[r-1].length;
        int [][] t = new int[c][r];
        
        for(int i = 0; i < r; ++i) {
            for(int j = 0; j < c; ++j) {
                t[j][i] = array[i][j];
            }
        }
        return t;
    }//transposeMatrix[][]
    
}//public class