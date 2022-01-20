import java.util.*;

public class connectFour {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    String[][] board = new String[6][7]; // column by row
    // getting user input

    System.out.println("\u001B[32mConnect Four!\n Player 1: Choose a column");
    int userC = s.nextInt();
    System.out.println("\u001B[32mConnect Four!\n Player 1: Now choose a row");
    int userR = s.nextInt();

    // boolean loop = false;
    String letter = "X";

    // starting grid
    fillBoard(board);
    displayBoard(board);

    // testing user input
    playRound(userInput, board);
    displayBoard(board);



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
    while() {

    }

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

  // goal: get user input
  // have user input in the game
  // if row is occupied, decrease row index by one

  // turn variable
  // player 1 would be an odd value (X) and player 2 would be an even value (O)

  public static String[][] playRound(int c, int player, String[][] board) {
    // finding row
    // start from the bottom

    for(int i = board.length - 1; i >= 0; i--) {
      if(board[size - 1] = "[ ]") {
        if(board[i][c - 1] == "[ ]") {
          board[i][c - 1] = "[X]";
        } // end second for loop
      } // end first for loop

    }
    return board;
  }

  // figure out how to display it in different rows

} // end class
