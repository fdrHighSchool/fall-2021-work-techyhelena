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
    int turn = 1;


    while(!endGame) {
      // player 1 would be an odd value (X) and player 2 would be an even value (O)
      if(turn % 2 != 0) {
        // player 1's turn
        System.out.println("\u001B[32mPlayer 1: Choose a column");
        userC = s.nextInt();
        // checking if user put in a valid input
        validInput(userC, board);
        if(validInput(userC ,board) == false) {
          System.out.println("You've entered an invalid input, please try again.");
          s.nextInt(); // allowing them to try again
        }
        if(takenSpot(userC, board) == true) {
          System.out.println("Please choose another column, that spot has been taken.");
          s.nextInt();
        }
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
        if(validInput(userC ,board) == false) {
          System.out.println("You've entered an invalid input, please try again.");
          s.nextInt(); // allowing them to try again
        }
        if(takenSpot(userC, board) == true) {
          System.out.println("Please choose another column, that spot has been taken.");
          userC = s.nextInt();
        }
        // place O
        letter = "[O]";
        // run user input
        playRound(userC, letter, board);
        displayBoard(board);
      }
    }
  } // end main method

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

  // to check if user input a valid value
  public static boolean validInput (int c, String[][] board) {
    if(c > board[0].length) { // board[0].length (the length of the row)
      return false;
    }
    return true;
  }

  // to check if spot is taken
  public static boolean takenSpot(int c, String[][] board) {
    if(!board[c - 1].equals("[ ]")) {
      return true;
    }
    return false;
  }

  // win conditions
  // vertical (level 1)
  // public static boolean verticalWin(String[][] board) {

  // }


  // horizontal (level 2)
  // diagonal (level 3)

} // end class
