/* 
Ivan Rivera
CSE2 Homework 02
Arithmetic

This program takes given information for items which were all bought together
in the same purchase. PA State sales tax is then calculated and accounted for.
The results are printed to the console.
*/

//Define class Arithmetic to match name of file
public class Arithmetic {
  
  //Define main method
  public static void main (String args[]) {
      
      //GIVEN DATA
      //Number of socks purchased
      int nSocks = 3;
      //Cost per pair of socks
      double sockCost$ = 2.58;
      
      //Number of drinking glasses purchased
      int nGlasses = 6;
      //Cost per glass
      double glassCost$ = 2.29;
      
      //Number of boxes of envelopes
      int nEnvelopes=1;
      //cost per box of envelopes
      double envelopeCost$=3.25;
      
      //Define PA sales tax
      double taxPercent=0.06;
      
      
      
      //CALCULATIONS
      //Define total cost of socks before tax
      double cSocks = nSocks * sockCost$;
      //Define tax on socks with 2 decimal places
      double taxSocks = (int)(cSocks * taxPercent*100)/100.0;
      //Define total cost of socks;
      double tSocks = cSocks + taxSocks;
      
      //Define total cost of drinking glasses before tax
      double cGlasses = nGlasses * glassCost$;
      //Define tax on drinking glasses with 2 decimal places
      double taxGlasses = (int)(cGlasses * taxPercent*100)/100.0;
      //Define total cost of glasses
      double tGlasses = cGlasses + taxGlasses;
      
      //Define total cost of envelopes before tax
      double cEnvelopes = nEnvelopes * envelopeCost$;
      //Define tax on envelopes with 2 decimal places
      double taxEnvelopes = (int)(cEnvelopes * taxPercent*100)/100.0;
      //Define total cost of envelopes;
      double tEnvelopes = cEnvelopes + taxEnvelopes;
      
      //Calculate total cost of all items before tax
      double cAll = cSocks + cGlasses + cEnvelopes;
      
      //Calculate total cost of purchase, including sales tax
      double TotalCost = tSocks + tGlasses + tEnvelopes;
      
      
      //PRINT STATEMENTS
      //Manipulate sales tax decimal to 2 decimal places and print out all relevant values
      System.out.println("The total cost of all socks prior to tax is " + cSocks);
      System.out.println("The total cost of all glasses prior to tax is " + cGlasses);
      System.out.println("The total cost of all envelopes prior to tax is " + cEnvelopes);
      System.out.println("The sales tax for socks is " + taxSocks);
      System.out.println("The sales tax for drinking glasses is " + taxGlasses);
      System.out.println("The sales tax for envelopes is " + taxEnvelopes);
      System.out.println("The total cost of all items prior to sales tax is " + cAll);
      
      
      //Print out the total cost to 2 decimal places---- WILL NOT PRINT TOTAL TO 2 DECIMAL PLACES
      //The 0 in the second decimal place is always dropped
      System.out.println("The total amount paid for the items with tax is " + (int)(TotalCost*1000)/1000.0);


  }  //end main method brace
} //end class brace