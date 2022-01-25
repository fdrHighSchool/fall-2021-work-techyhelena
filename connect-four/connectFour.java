import java.util.*;
public class connectFour {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String[][] board = new String[6][7]; // column by row

    // try finding a way to make the empty grid appear after this text so that the users can have a visual
    System.out.println("\u001B[32mWelcome to Connect Four! Choose a column from 1-7");
    // starting grid
    fillBoard(board);
    displayBoard(board);

    // getting user input
    int userC;
    String letter = "";
    boolean endGame = false;
    int turn = 1;


// board[0].length (the length of the row)
    while(!endGame) {
      // player 1 would be an odd value (X) and player 2 would be an even value (O)
      if(turn % 2 != 0) {
        // player 1's turn
        System.out.println("\u001B[32mPlayer 1: Choose a column");
        userC = s.nextInt();
        // place X
        letter = "[X]";
        // run user input
        playRound(userC, letter, board);
        displayBoard(board);
      }

      turn++;

      if(turn % 2 == 0) {
        // player 2's turn
        System.out.println("\u001B[32mPlayer 2: Choose a column");
        userC = s.nextInt();
        // place O
        letter = "[O]";
        // run user input
        playRound(userC, letter, board);
        displayBoard(board);
      }
    }
  } // end main method
// conditions
  public static boolean winConditions (String[][] board){
    
    return false;
  }
// win conditions
// vertical (level 1)
// make if statement into the for loop to check all the elements in the array

// horizontal (level 2)
// diagonal (level 3)

  public static void fillBoard (String[][] board) {
    for (int row = 0; row < board.length; row++) {
      for (int col = 0; col < board[row].length; col++) {
        board[row][col] = "[ ]";
      } // end inner loop
    } // end outer loop
  } // end fillBoard method

  public static void displayBoard(String[][] board) {
    System.out.println("\033[H\033[2J"); // clear the terminal
    for(int row = 0; row < board.length; row++) {
      for(int col = 0; col < board[row].length; col++) {
        System.out.print(board[row][col] + " ");
      } // end inner for loop
      System.out.println();
    } // end outer for loop
  } // end displayBoard method

  // goal: get user input
  // have user input in the game
  // if row is occupied, decrease row index by one
  public static String[][] playRound(int c, String player, String[][] board) {
    // finding row
    // start from the bottom
    for(int i = board.length - 1; i >= 0; i--) {
        if(board[i][c - 1] == "[ ]") {
          board[i][c - 1] = player;
          break;
        } // end if statement
      } // end first for loop
    return board;
  }
} // end class
