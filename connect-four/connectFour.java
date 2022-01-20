import java.util.*;

public class connectFour {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    String[][] board = new String[6][7]; // column by row
    // getting user input 

    System.out.println("\u001B[32mConnect Four!\n Choose a column");
    int C1 = s.nextInt();
    System.out.println("Now choose a row");
    int R1 = s.nextInt();

    // player 2
    int C2 = s.nextInt();
    int R2 = s.nextInt();

    // boolean loop = false; 
    String player1 = "[X]";
    String player2 = "[O]";
    

    // starting grid 
    fillBoard(board);
    displayBoard(board);

    // testing user input
    placePieces(userC, userR, board);
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

  // goal: get user input 
  // have user input in the game
  // if row is occupied, decrease row index by one 
  

  public static String[][] placePieces1(int c, int r, String[][] board) {

    for(int i = board.length - 1; i >= 0; i--) { 
      if(board[i][c] == "[ ]") {
        for(int i = board.length - 1; i >= 0; i--) {
          board[i][c][r] = "[X]";
        }
      }
    } 
    return board;
  }

  // public static String[][] placePieces2(int c, int r, String[][] board) {
  //   for(int i = board.length - 1; i >= 0; i--) {
  //     if(board[i][c][r] == "[ ]") {
  //       board[i][c][r] = "[O]";
  //     }
  //   }
  //   return board;
  // }
  

  // figure out how to display it in different rows 

} // end class