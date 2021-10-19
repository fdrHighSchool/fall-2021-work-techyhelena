import java.util.Scanner;
import java.util.Response;

public class randomNum {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); //Create a Scanner Object
        //welcomes user into the game
        int userResponse = myObj.nextLine();
        System.out.println("Welcome, would you like to play a game?" + "\nYes (y)" + "No (n)");
        if(userResponse.equals("y")){
          //asks user to pick a number
          System.out.println("Pick a number from 1-20");
        } else {
          System.out.println("Aw man.. maybe you'll change your mind later? :D");
        } //closes else

        //variable for the number of tries user has
        int userTries = 3;
        int userNum = myObj.nextInt();
        //inputs a random number in variable
        int targetNum = ((int)(Math.random()*20 +1));

        // will give user feedback on whether or not they guessed it right
        //if user guesses correctly
        if (userNum == targetNum) {
            System.out.println("Good job, you've guessed it correctly!");
        }

          //loops game whenever user doesn't get the correct answer
          // for (int i=0; i < 2; i++) {
            //if user guesses too high
        //     if (userNum > targetNum) {
        //         System.out.println("Your number was too high :^0" + "You have " + userTries " left!");
        //
        //     }
        //
        //   }
        // }

        //if user guesses too high
        // if (userNum > targetNum) {
        //     System.out.println("Your number was too high :^0" + "\nThe number was " + targetNum + "\nThank you for playing!");
        // }
        //if user guesses too low
        // if (userNum < targetNum) {
        //     System.out.println("Your number was too low :'(" + "\nThe number was " + targetNum + "\nThank you for playing!");
        // }


        // myObj.close();
    } //closing bracket for main
} //closing bracket for public class
