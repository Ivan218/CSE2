/*
Ivan Rivera
Prof. Chen
CSE2
lab11 Search program */

/*This program creates two arrays to conduct a linear search on one unsorted array,
and a binary search on a sorted array*/


import java.util.Scanner;
public class Search {
    
    public static void main(String args[]) {
        Scanner input= new Scanner(System.in);
        int[] array1 = new int[5000];
        int[] array2 = new int[5000];
        
        for(int i=0; i<5000;i++) {
            array1[i]=(int)(Math.random()*100000);
        }
        
        int min=0;
        int max=0;
        
        for(int i=0; i<5000;i++) {
            if(array1[i]<array1[min]) {min=i;}
            if(array1[i]>array1[max]) {max=i;}
        }
        
        System.out.println("max = "+array1[max]+"; min = "+array1[min]);
        System.out.print("Input key: ");
        
        for(int i=0; i<5000;i++) {
            array2[i]=(int)(Math.random()*i+Math.pow(i,2));
            if(i!=0) {
                if(array2[i]<array2[i-1]) {array2[i]+=array2[i-1];}
            }
        }
        
        
        int key = input.nextInt();
        if(key<0) {return;}
        
        int high=array2.length-1;
        int low=0;
        int mid=0;
        boolean success=false;
        int count=0;
        while(high>=low) {
            mid=(high+low)/2;
            if(array2[mid]==key) {success=true; break;}
            else if(array2[mid]>key) {high=mid;}
            else {low=mid;}
            count++;
            if(high>4999) {high=5000; break;}
            if(count==15) {
                if(high==4999) {high = 5000; break;}
                else{break;}
            }
        }//while loop
        
        System.out.println("max = "+array2[0]+"; min = "+array2[4999]);
        if(success) {
            System.out.println("The key was found at index: "+mid);
        }
        else {
            
            System.out.println("The key "+key+" was not found");
            System.out.print("The number above the key is ");
            if(high==5000) {System.out.println("NONE");}
            else {System.out.println(array2[high]);}
            System.out.print("The number below the key is ");
            if(low<0) {System.out.println("NONE");}
            else {System.out.println(array2[low]);}
        }
    }//main method
}//public class