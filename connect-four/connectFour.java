import java.util.*;

public class connectFour {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    String[][] board = new String[6][7]; // column by row
    String letter = "[X]";


    System.out.println("\u001B[32mConnect Four!\n Player 1: Choose a column");
    // starting grid
    fillBoard(board);
    displayBoard(board);
    int userInput = s.nextInt();
    System.out.println("Player 1: Now choose a row");


    // testing user input
    playRound(userInput, board);
    displayBoard(board);
    // System.out.println(Arrays.toString(board));

    // example, player 1 chooses col 3
    /*
    board[5][2] = "[X]";
    s.nextLine();
    displayBoard(board);

    // player 2 also chooses col 3
    board[4][2] = "[O]";
    s.nextLine();
    displayBoard(board);
    */
  } // end main method


  public static void fillBoard(String[][] board) {
    for(int row = 0; row < board.length; row++) {
      for(int col = 0; col < board[row].length; col++) {
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


  public static String[][] playRound(int input, String[][] board) {
    // column
    for(int i = board.length - 1; i >= 0; i-- ) {
      
    }

    for(int i = board.length - 1; i >= 0; i--) {
      if(board[i][input - 1][] == "[ ]") {
        if(letter = "[X]") {
          letter = "[O]";
          board[i][input - 1] = letter;
        }

      }
    }
    return board;
  }

  /*
  to determine which row to go into, check the highest number and decrease by one if there is an occupied spot
  */


// to check win -> check after 4 rounds for efficiency


} // end class
