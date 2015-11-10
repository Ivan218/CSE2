/*
Ivan Rivera
Prof. Chen
CSE2 Linear program
*/

/*This program takes 15 int inputs in nonstrictly ascending order, inquires of an
int to search for, then performs the binary search method in the ordered array of grades,
followed by the scrambling of the array so the program can perform a necessary linear search
of the same key
*/


import java.util.Scanner;

public class CSE2Linear {
    /*The main method accomplishes the creation of the array appropriately, and
    calls the other methods to run the remainder of the tasks*/
    
    public static void main(String args[]) {
        //prepare a scanner and create the array of students' grades
        Scanner input = new Scanner(System.in);
        int[] grades = new int[15];
        int temp=0;
        
        /*This nested craziness uses a for loop to store a qualifying int in every
        index of the array by looping in a while loop until an appropriate int is
        typed in. CONDITIONS: 1) Must be an int; 2) Must be between [0,100];
        3) Must be nonstrictly ascending.*/
        for(int i=0; i<15; i++) {
            while(true) {
                System.out.print("Input a grade for student "+i+": ");
                if(input.hasNextInt()) {
                    temp = input.nextInt(); 
                    if(temp <101 && temp >-1) {
                        if(i==0) {
                            grades[i]=temp;
                            break;
                        }
                        if(temp>=grades[i-1]) {
                            grades[i]=temp;
                            break;
                        }
                        else {System.out.println("ERROR: This grade must be higher than the last grade!");}
                    }
                    else {System.out.println("ERROR: This grade must be between 0 and 100!");}
                }
                else {
                    System.out.println("ERROR: You need an Int");
                    input.next();
                }
            }//while loop
        }//for loop
        //These System.out.println()'s are just for space
        System.out.println();
        System.out.println();
        System.out.println();
        printArray(grades);
        
        //get key from user and perform binary search
        System.out.println("What grade would you like to search for?");
        int key = input.nextInt();
        binarySearch(grades, key);
        
        //scramble and print the array then perform a linear search with the same key
        scramble(grades);
        printArray(grades);
        linearSearch(grades, key);
    }//main method
    
    
    //This method prints all contents of the requested array by looping through it
    public static void printArray(int[] array) {
        for(int i=0; i<array.length; i++) {
            if((i+1)%5==0) {System.out.println("student["+i+"] = "+array[i]);}
            else{System.out.print("student["+i+"] = "+array[i]+"; ");}
        }//for loop
    }//printArray
    
    
    
    /*This method conducts a standard binarySearch for the first index that has the desired key
    and printing to the console the number of iterations it took to find the desired grade. The method
    also appropriately gives a message to the user if the grade was not found*/
    public static void binarySearch(int[] array, int key) {
        int high = array.length-1;
        int low =0;
        int mid=0;
        int count=0;
        boolean found = false;
    
        while(high>=low) {
            mid = (high+low)/2;
            if(array[mid]==key) {
                found=true;
                break;
            }
            else if(array[mid]>key) {high=mid-1;}
            else {low=mid+1;}
            ++count;
        }
        if(found) {System.out.println("Key was found at index "+mid+" after "+count+" iterations");}
        else {System.out.println("The requested grade was not found");}
    }//binarySearch
    
    
    
    /*This method performs a standard linear search and prints the number of iterations
    it takes to find the desired key after scrambling, if the key is found in the array.
    Otherwise, it prints an appropirate message to the user.*/
    public static void linearSearch(int[] array, int key) {
        int index=-1;
        int count=1;
        
        for( int i=0; i<array.length; i++, count++) {
            if(array[i]==key) {
                index=i;
                break;
            }
        }
        if(index==-1) {System.out.println("The requested grade was not found");}
        else {System.out.println("After "+count+" iterations, the grade "+key+" was found at index "+index);}
    }//linearSeach
    
    
    
    //This method simply takes 2 members of the array and swaps them array.length times
    public static void scramble(int[] array) {
        int temp, temp2;
        for(int i=0; i<array.length; i++) {
            temp=(int)(Math.random()*array.length);
            temp2=array[i];
            array[i]=array[temp];
            array[temp]=temp2;
        }
    }//scramble
    
}//public class