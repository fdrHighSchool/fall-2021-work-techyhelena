import java.util.*;
public class connectFour {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String[][] board = new String[6][7]; // column by row

    System.out.println("\u001B[32mWelcome to Connect Four! Press enter to begin!");
     s.nextLine();
    // starting grid
    fillBoard(board);
    displayBoard(board);

    // getting user input
    int userC;
    String letter = "";
    boolean endGame = false;
    int turn = 0;


    while(!endGame) {
      turn++; 
      // player 1 would be an odd value (X) and player 2 would be an even value (O)
      if(turn % 2 != 0) {
        // player 1's turn
        System.out.println("\u001B[32mPlayer 1: Choose a column");
        letter = "[X]";
      }

      if(turn % 2 == 0) {
        // player 2's turn
        System.out.println("\u001B[32mPlayer 2: Choose a column");
        letter = "[O]";
      }

        // get user column 
        userC = s.nextInt();
      
      // checking conditions before taking user input into game
      if (!fullBoard(board)) {
        // checking if user put in a valid input
        if(validInput(userC ,board) == true) {
          // checking if the column chosen is taken
          if(colFull(userC, board) == false) {
             // run user input
            playRound(userC, letter, board);
            displayBoard(board);
          }
        }
      }

      // tie condition 
      if(fullBoard(board)) {
        System.out.println("\u001B[32m\nTie! Game Over!");
        // maybe add a feature where the user can play again 
        endGame = true; // closes game  
      }

      // win conditions 
      if(verticalWin(board)) {
        System.out.println("\u001B[32m\nGame Over!");
        endGame = true;
      }

      // if user input does not satisfy the conditions above 
      else if(validInput(userC, board) == false) {
        System.out.println("You've entered an invalid input, please try again.");
        turn--; // prompting player to go again
      }

      else if(colFull(userC, board) == true) {
        System.out.println("Please choose another column, the column you picked is full.");
        turn--; // prompting player to go again 
      }
    } // end while loop 
        
  } // end main method

  public static void fillBoard (String[][] board) {
    for (int row = 0; row < board.length; row++) {
      for (int col = 0; col < board[row].length; col++) {
        board[row][col] = "[ ]";
      } 
    } 
  }                                                                 

  public static void displayBoard(String[][] board) {
    System.out.println("\033[H\033[2J"); // clear the terminal
    for(int row = 0; row < board.length; row++) {
      for(int col = 0; col < board[row].length; col++) {
        System.out.print(board[row][col] + " ");
      } 
      System.out.println();
    } 
  } 


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

  // to check if user input a valid value
  // board.length = vertical (straight down)
  // board[0].length = horizontal
  public static boolean validInput (int c, String[][] board) {
    if(c > board[0].length || c <= 0) { // board[0].length (the length of the row)
      return false;
    }
    return true;
  }

  // to check if column is full
  public static boolean colFull(int c, String[][] board) {
    // loop to run through every column to check 
    // i is the row # and c is the column that the player inputed
    // c-1 because the program starts at 0 not 1.
    for(int i = 0; i < board.length - 1; i++) {
      if(board[i][c - 1] == "[ ]") {
      return false;
      }
    
    }
    return true;
  }
  // if the whole board is full -  tie condition 
  public static boolean fullBoard(String[][] board) {
    // loop to check all cols and rows
    for(int row = 0; row < board.length - 1; row++) {
      for(int col = 0; col < board[row].length; col++) {
        if(board[row][col] == "[ ]") { // checking for empty spaces in the array
          return false; 
        }
      }
    }
    return true;
  }


  // win conditions
  // vertical (level 1)
  public static boolean verticalWin(String[][] board) {
    // focus on column - board[0].length
    for(int col = 0; col < board[0].length - 1; col++) { // .length - 1 because program starts at 0 not 1
      // row-- because we're starting from bottom up 
      for(int row = 0; row < board.length - 1; row--) {
        // if player 1 wins
        if(board[col][row].equals(board[col - 1][row]) && board[col][row].equals(board[col - 2][row]) && board[col][row].equals("[X]")) {
          return true;
        }
        // if player 2 wins
        if(board[col][row].equals(board[col - 1][row]) && board[col][row].equals(board[col - 2][row]) && board[col][row].equals("[O]")) {
          return true;
        }
      }
    }
    return false;
   }


  // horizontal (level 2)
  // diagonal (level 3)

} // end class
