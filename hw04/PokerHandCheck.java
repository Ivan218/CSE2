/*
Ivan Rivera
hw04
Poker Hand Check program
*/

/* This program "draws" at random 5 cards from a 52 card deck using a mapped
random number generator. The values from the random number generator become the 
card with a suit and number through various ranges via if statements and switch
statements. Every time a card is identified as a number N, the counter for N 
increments by 1. Then the counters for each value are tested to see how many pairs
there may be, or if there is a three of a kind. One cannot receieve a full house
(three of a kind plus pair) via this code. Everything is printed in the end.
*/
public class PokerHandCheck {
    public static void main(String args[]) {
        
        //Draw 5 cards from different decks using a mapped random number generator
        int card1 = (int)(Math.random()*52 + 1);
        int card2 = (int)(Math.random()*52 + 1);
        int card3 = (int)(Math.random()*52 + 1);
        int card4 = (int)(Math.random()*52 + 1);
        int card5 = (int)(Math.random()*52 + 1);
        
        //Initiates variables as strings for later use to identify suits for each card
        String suit1="0";
        String suit2="0";
        String suit3="0";
        String suit4="0";
        String suit5="0";
        
        
        //Assigns a suit to each drawn card based on a range the # falls into
        //CARD1
        if(card1<=13) {suit1="hearts";}
        else if(card1<=26) {suit1="diamonds";}
        else if(card1<=39) {suit1="clubs";}
        else {suit1="spades";}
        //CARD2
        if(card2<=13) {suit2="hearts";}
        else if(card2<=26) {suit2="diamonds";}
        else if(card2<=39) {suit2="clubs";}
        else {suit2="spades";}
        //CARD3
        if(card3<=13) {suit3="hearts";}
        else if(card3<=26) {suit3="diamonds";}
        else if(card3<=39) {suit3="clubs";}
        else {suit3="spades";}
        //CARD4
        if(card4<=13) {suit4="hearts";}
        else if(card4<=26) {suit4="diamonds";}
        else if(card4<=39) {suit4="clubs";}
        else {suit4="spades";}
        //CARD5
        if(card5<=13) {suit5="hearts";}
        else if(card5<=26) {suit5="diamonds";}
        else if(card5<=39) {suit5="clubs";}
        else {suit5="spades";}
        
        
        //Initiate value variables for later use in switch statements
        //So each card may receive a value [2,10], {Ace, Jack, Queen, King}.
        String value1 = "0";
        String value2 = "0";
        String value3 = "0";
        String value4 = "0";
        String value5 = "0";
        
        //Initiates 13 counters for each card value
        int num1=0;
        int num2=0;
        int num3=0;
        int num4=0;
        int num5=0;
        int num6=0;
        int num7=0;
        int num8=0;
        int num9=0;
        int num10=0;
        int num11=0;
        int num12=0;
        int num13=0;
        
        //Assigns a value to each card based on %13 and increments counters accordingly
        switch(card1%13) {
            case 1: value1="Ace"; num1+=1; break;
            case 2: value1="2"; num2+=1; break;
            case 3: value1="3"; num3+=1; break;
            case 4: value1="4"; num4+=1; break;
            case 5: value1="5"; num5+=1; break;
            case 6: value1="6"; num6+=1; break;
            case 7: value1="7"; num7+=1; break;
            case 8: value1="8"; num8+=1; break;
            case 9: value1="9"; num9+=1; break;
            case 10: value1="10"; num10+=1; break;
            case 11: value1="Jack"; num11+=1; break;
            case 12: value1="Queen"; num12+=1; break;
            case 0: value1="King"; num13+=1; break;
        }
        
        switch(card2%13) {
            case 1: value2="Ace"; num1+=1; break;
            case 2: value2="2"; num2+=1; break;
            case 3: value2="3"; num3+=1; break;
            case 4: value2="4"; num4+=1; break;
            case 5: value2="5"; num5+=1; break;
            case 6: value2="6"; num6+=1; break;
            case 7: value2="7"; num7+=1; break;
            case 8: value2="8"; num8+=1; break;
            case 9: value2="9"; num9+=1; break;
            case 10: value2="10"; num10+=1; break;
            case 11: value2="Jack"; num11+=1; break;
            case 12: value2="Queen"; num12+=1; break;
            case 0: value2="King"; num13+=1; break;
        }
        
        switch(card3%13) {
            case 1: value3="Ace"; num1+=1; break;
            case 2: value3="2"; num2+=1; break;
            case 3: value3="3"; num3+=1; break;
            case 4: value3="4"; num4+=1; break;
            case 5: value3="5"; num5+=1; break;
            case 6: value3="6"; num6+=1; break;
            case 7: value3="7"; num7+=1; break;
            case 8: value3="8"; num8+=1; break;
            case 9: value3="9"; num9+=1; break;
            case 10: value3="10"; num10+=1; break;
            case 11: value3="Jack"; num11+=1; break;
            case 12: value3="Queen"; num12+=1; break;
            case 0: value3="King"; num13+=1; break;
        }
        
        switch(card4%13) {
            case 1: value4="Ace"; num1+=1; break;
            case 2: value4="2"; num2+=1; break;
            case 3: value4="3"; num3+=1; break;
            case 4: value4="4"; num4+=1; break;
            case 5: value4="5"; num5+=1; break;
            case 6: value4="6"; num6+=1; break;
            case 7: value4="7"; num7+=1; break;
            case 8: value4="8"; num8+=1; break;
            case 9: value4="9"; num9+=1; break;
            case 10: value4="10"; num10+=1; break;
            case 11: value4="Jack"; num11+=1; break;
            case 12: value4="Queen"; num12+=1; break;
            case 0: value4="King"; num13+=1; break;
        }
        
        switch(card5%13) {
            case 1: value5="Ace"; num1+=1; break;
            case 2: value5="2"; num2+=1; break;
            case 3: value5="3"; num3+=1; break;
            case 4: value5="4"; num4+=1; break;
            case 5: value5="5"; num5+=1; break;
            case 6: value5="6"; num6+=1; break;
            case 7: value5="7"; num7+=1; break;
            case 8: value5="8"; num8+=1; break;
            case 9: value5="9"; num9+=1; break;
            case 10: value5="10"; num10+=1; break;
            case 11: value5="Jack"; num11+=1; break;
            case 12: value5="Queen"; num12+=1; break;
            case 0: value5="King"; num13+=1; break;
        }
        
        //Prints what the random cards were
        System.out.println("Your random cards were:");
        System.out.println("\t The "+value1+" of "+suit1);
        System.out.println("\t The "+value2+" of "+suit2);
        System.out.println("\t The "+value3+" of "+suit3);
        System.out.println("\t The "+value4+" of "+suit4);
        System.out.println("\t The "+value5+" of "+suit5);
        
        //Initiates a pair counter and triple counter for identifying hand conditions
        int pair=0;
        int triple=0;
        
        //Tests EACH COUNTER (13) for pairs or three of a kinds and increments counters accordingly
        if(num1>1) {
            if(num1>2) {triple+=1;}
            else {pair+=1;}
        }
        if(num2>1) {
            if(num2>2) {triple+=1;}
            else {pair+=1;}
        }
        if(num3>1) {
            if(num3>2) {triple+=1;}
            else {pair+=1;}
        }
        if(num4>1) {
            if(num4>2) {triple+=1;}
            else {pair+=1;}
        }
        if(num5>1) {
            if(num5>2) {triple+=1;}
            else {pair+=1;}
        }
        if(num6>1) {
            if(num6>2) {triple+=1;}
            else {pair+=1;}
        }
        if(num7>1) {
            if(num7>2) {triple+=1;}
            else {pair+=1;}
        }
        if(num8>1) {
            if(num8>2) {triple+=1;}
            else {pair+=1;}
        }
        if(num9>1) {
            if(num9>2) {triple+=1;}
            else {pair+=1;}
        }
        if(num10>1) {
            if(num10>2) {triple+=1;}
            else {pair+=1;}
        }
        if(num11>1) {
            if(num11>2) {triple+=1;}
            else {pair+=1;}
        }
        if(num12>1) {
            if(num12>2) {triple+=1;}
            else {pair+=1;}
        }
        if(num13>1) {
            if(num13>2) {triple+=1;}
            else {pair+=1;}
        }
        
        //Tests pair and triple counters for winning hands. Default: high card. Prints results
        if(pair>0) {
            if(pair>1) {
                System.out.println("You got two pair!");
            }
            else {
                System.out.println("You got a pair!");
            }
        }
        else if(triple>0) {
            System.out.println("You got three of a kind!");
        }
        else {
            System.out.println("You got high card. Lame.");
        }
        
        
    }//matching public static void main brace
    
}//matching public class brace