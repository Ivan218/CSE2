/*
Ivan Rivera
Prof. Chen
hw10 Shuffling program
*/

/*This program creates a deck of cards and does various things with it. First
the deck is printed to reveal the initial order of the cards in the deck, then it is
shuffled and reprinted to show it was shuffled. Next, a player receives 5 cards from
the deck as if it were a real deck of playing cards. The player's hands are printed out.
*/

//NOTE: I deleted Prof. Chen's repeated printing found in the for loop which creates the deck of cards, it was redundant

//import scanner for use... don't know why but Chen put it in the code he provided
import java.util.Scanner;

public class Shuffling{
    
    public static void main(String[] args) {
        //SETUP
        //create scanner called scan
        Scanner scan = new Scanner(System.in);
        
        //suits club, heart, spade or diamond
        String[] suitNames={"C","H","S","D"};   
        //each possible rank of a card
        String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
        //creates an array holding all possible types of cards in a standard 52-card deck
        String[] cards = new String[52];
        //represents a player's hand in a 5-card hand game
        String[] hand = new String[5];
        
        //generates a standard 52-card deck in an array, storing it in cards[] then printing out the cards
        for (int i=0; i<52; i++) {
            cards[i]=rankNames[i%13]+suitNames[i/13];
        }
        //END SETUP
        //What each method does:
        //Shows initial order of the cards in the deck
        printArray(cards);
        //Shuffles the cards in the deck
        shuffle(cards);
        System.out.println("Shuffled");
        //Shows the order of the cards after shuffling
        printArray(cards);
        //Deals out 5 cards to a player
        hand = randomizeHand(cards);
        System.out.println("Randomized hand!");
        //Shows the player's hand
        printArray(hand);
    }//main method
    
    
    
    //This method prints out the contents of the desired array
    public static void printArray(String[] array) {
        int size = array.length;
        for(int i=0; i<size; i++) {
            if((i+1)%13==0) {
                System.out.println(array[i]+" ");
            }
            else { 
                System.out.print(array[i]+" ");
            }
        }
        System.out.println();
    }//printArray method
    
    
    /*This method scrambles the original locations of the contents of the array,
    only by reassigning indeces to the strings. This is the shuffling process*/
    public static void shuffle(String[] array) {
        int size = array.length;
        int num;
        String dingnut="";
        for(int i=0; i<array.length; i++) {
            num = (int)(Math.random()*array.length);
            dingnut=array[num];
            array[num]=array[i];
            array[i]=dingnut;
        }//outer for loop
    }//shuffle method
    
    //This method deals out 5 cards from the shuffled deck to the player
    /*This is accomplished by drawing a random card, replacing the value of the
    index which was just drawn by swapping it with the last card, then drawing
    another card from the first 52-i cards where i goes from 0 to 4*/
    public static String[] randomizeHand(String[] array) {
        String[] drawThese = new String[5];
        int num;
        for(int i=0; i<5; i++) {
            num = (int)(Math.random()*(52-i));
            drawThese[i]=array[num];
            array[num]=array[51-i];
        }//outermost for loop
        return drawThese;
    }//randomizeHand method
    
}//public class
