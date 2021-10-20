import java.util.*;

public class Username {
  public static void main(String[] args) {
      //create an instance of the scanner
      Scanner s = new Scanner(System.in);
      //ask the user their first name
      System.out.print("Please enter your first name: ");
      String fName = s.nextLine();
      //ask the user their last name
      System.out.print("Please enter your last name: ");
      String lName = s.nextLine();


      //ask the user their birthday in the form mm/dd/yy
      System.out.print("Hi, " + fName + ", please enter your birthday in mm/dd/yy format: ");
      String birthday = s.nextLine();

      //generate a username for that person based on their data
      String username = "";
      //takes the first letter of the first name 
      username += fName.substring(0, 1);
      //takes the final two letters of the last name (depending on how long they are)
      username += lName.substring(length() - 2);

      System.out.print("Here's your username, please keep it in a safe space.. or else..: ");
      System.out.println(username);
  } //end main method
} //end class
