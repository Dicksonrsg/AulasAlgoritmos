
package vetoresematrizes;

import java.util.Scanner;

public class jogodavelha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        char ttt[][] = new char[9][9];
        
        char b = 'z', p1 = 'X', p2='O';
        int move = -1, player = 0, q=0;
        
        
                
        System.out.print("This is tic tac toe Game\n"
                + "The table is numbered like this:\n"
                + "0"+"|1|"+ "2\n"+ "3"+"|4|"+ "5\n"+ "6"+"|7|"+ "8\n"
                + "You'll be asked for a move type the number according the position you wanna play.\n"
                + "Player 1 Starts the game and Player 2 follows, alternating turns.\n"
                + "Press 'S' to Start: ");
        b = input.next().charAt(0);
        
        if (b == 'S' ){
            System.out.print("Player 1 uses 'X'\nPlayer 2 uses 'O'\n");
            for (int i = 1; i < 10; i++){
                
                if((i%2)!=0){
                    player = 1;
                    System.out.print("Player 1, what's your move: ");
                    move = input.nextInt();}
                else{
                    player = 2;
                    System.out.print("Player 2, what's your move: ");
                    move = input.nextInt();}

                
                if (move == 0){
                    if (player == 1){ ttt [1][1] = 'X';}
                    if (player == 2){ ttt [1][1] = 'O';}
                    
                }
                else if (move == 1){
                    if (player == 1){ ttt [1][2] = 'X';}
                    if (player == 2){ ttt [1][2] = 'O';}
                    
                }
                else if (move == 2){
                    if (player == 1){ ttt [1][3] = 'X';}
                    if (player == 2){ ttt [1][3] = 'O';}
                    
                }
                else if (move == 3){
                    if (player == 1){ ttt [2][1] = 'X';}
                    if (player == 2){ ttt [2][1] = 'O';}
                    
                } 
                else if (move == 4){
                    if (player == 1){ ttt [2][2] = 'X';}
                    if (player == 2){ ttt [2][2] = 'O';}
                    
                }
                else if (move == 5){
                    if (player == 1){ ttt [2][3] = 'X';}
                    if (player == 2){ ttt [2][3] = 'O';}
                    
                }                
                else if (move == 6){
                    if (player == 1){ ttt [3][1] = 'X';}
                    if (player == 2){ ttt [3][1] = 'O';}
                    
                }
                else if (move == 7){
                    if (player == 1){ ttt [3][2] = 'X';}
                    if (player == 2){ ttt [3][2] = 'O';}
                    
                }
                else if (move == 8){
                    if (player == 1){ ttt [3][3] = 'X';}
                    if (player == 2){ ttt [3][3] = 'O';}
                    
                }
                else {System.out.println("Wrong move.\nTry a number from  0 - 9"); }
                            System.out.println(ttt[1][1]+"|"+ttt[1][2]+"|"+ttt[1][3]+"\n"
                    + ttt[2][1]+"|"+ttt[2][2]+"|"+ttt[2][3]+"\n"
                    + ttt[3][1]+"|"+ttt[3][2]+"|"+ttt[3][3]+"\n");
                            
                                            if (i >4){
                            for(char[] seeker:ttt){
                                if( seeker.equals(p1)){ q++; if (q>2){System.out.println("Player "+player+" wins!"); break;}}
                                
                            }
                }
        }
            System.out.println(ttt[1][1]+"|"+ttt[1][2]+"|"+ttt[1][3]+"\n"
                    + ttt[2][1]+"|"+ttt[2][2]+"|"+ttt[2][3]+"\n"
                    + ttt[3][1]+"|"+ttt[3][2]+"|"+ttt[3][3]+"\n");
        
    }else{System.out.println("Don't you Wanna play? \t Think again and press 'S'");}
    
}
}
