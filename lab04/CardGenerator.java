/*
Ivan Rivera
lab 03
Card Generator
*/

/*This program picks a random number and maps it out to allow for a random 
card to be picked and prints out the statement identifying the card by 
suit and number using if and switch statements*/

public class CardGenerator {
    
    public static void main(String args[]) {
        
        //Take a random number from [1,52] and cast it into an int
        int rand = (int)(Math.random()*51+1);
        String suit;
        
        //identify the suit of the card
        if (rand<=13) {
            suit = "diamonds";
        }
        else if (rand<=26) {
            suit = "clubs";
        }
        else if (rand<=39) {
            suit = "hearts";
        }
        else {
            suit = "spades";
        }     
        
        String num = "0";
        //identify the number of the card
        switch(rand%13) {
            case 1: num = "Ace"; break;
            case 2: num = "2"; break;
            case 3: num = "3"; break;
            case 4: num = "4"; break;
            case 5: num = "5"; break;
            case 6: num = "6"; break;
            case 7: num = "7"; break;
            case 8: num = "8"; break;
            case 9: num = "9"; break;
            case 10: num = "10"; break;
            case 11: num = "Jack"; break;
            case 12: num = "Queen"; break;
            case 0: num = "King"; break;
        }
        
        System.out.println("You picked the "+num+" of "+suit+".");
        
    } //matches public static void
    
}//matches public class