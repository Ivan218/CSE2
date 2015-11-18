



import java.util.Scanner;

public class ChessBoard {
    public static void main(String args[]) {
        String[][] board =new String[8][8];
        CreateBoard(board);
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[i].length; j++) {
                if(j+1!=board[i].length) {System.out.print(board[i][j]+"--");}
                else{System.out.print(board[i][j]);}
            }
            System.out.println();
        }
    }//main method
    
    public static void CreateBoard(String[][] board) {
        
        for(int i=0; i<64; i++) {
            switch(i) {
                case 0: board[0][0]="A1"; break;
                case 1: board [0][1]="A2"; break;
                case 2: board[0][2]="A3"; break;
                case 3: board [0][3]="A4"; break;
                case 4: board[0][4]="A5"; break;
                case 5: board [0][5]="A6"; break;
                case 6: board[0][6]="A7"; break;
                case 7: board [0][7]="A8"; break;
                case 8: board[1][0]="B1"; break;
                case 9: board[1][1]="B2"; break;
                case 10: board[1][2]="B3"; break;
                case 11: board[1][3]="B4"; break;
                case 12: board[1][4]="B5"; break;
                case 13: board[1][5]="B6"; break;
                case 14: board[1][6]="B7"; break;
                case 15: board[1][7]="B8"; break;
                case 16: board[2][0]="C1"; break;
                case 17: board[2][1]="C2"; break;
                case 18: board[2][2]="C3"; break;
                case 19: board[2][3]="C4"; break;
                case 20: board[2][4]="C5"; break;
                case 21: board[2][5]="C6"; break;
                case 22: board[2][6]="C7"; break;
                case 23: board[2][7]="C8"; break;
                case 24: board[3][0]="D1"; break;
                case 25: board[3][1]="D2"; break;
                case 26: board[3][2]="D3"; break;
                case 27: board[3][3]="D4"; break;
                case 28: board[3][4]="D5"; break;
                case 29: board[3][5]="D6"; break;
                case 30: board[3][6]="D7"; break;
                case 31: board[3][7]="D8"; break;
                case 32: board[4][0]="E1"; break;
                case 33: board[4][1]="E2"; break;
                case 34: board[4][2]="E3"; break;
                case 35: board[4][3]="E4"; break;
                case 36: board[4][4]="E5"; break;
                case 37: board[4][5]="E6"; break;
                case 38: board[4][6]="E7"; break;
                case 39: board[4][7]="E8"; break;
                case 40: board[5][0]="F1"; break;
                case 41: board[5][1]="F2"; break;
                case 42: board[5][2]="F3"; break;
                case 43: board[5][3]="F4"; break;
                case 44: board[5][4]="F5"; break;
                case 45: board[5][5]="F6"; break;
                case 46: board[5][6]="F7"; break;
                case 47: board[5][7]="F8"; break;
                case 48: board[6][0]="G1"; break;
                case 49: board[6][1]="G2"; break;
                case 50: board[6][2]="G3"; break;
                case 51: board[6][3]="G4"; break;
                case 52: board[6][4]="G5"; break;
                case 53: board[6][5]="G6"; break;
                case 54: board[6][6]="G7"; break;
                case 55: board[6][7]="G8"; break;
                case 56: board[7][0]="H1"; break;
                case 57: board[7][1]="H2"; break;
                case 58: board[7][2]="H3"; break;
                case 59: board[7][3]="H4"; break;
                case 60: board[7][4]="H5"; break;
                case 61: board[7][5]="H6"; break;
                case 62: board[7][6]="H7"; break;
                case 63: board[7][7]="H8"; break;
            };
        }//for loop
    }//CreateBoard method;
    
}//public class