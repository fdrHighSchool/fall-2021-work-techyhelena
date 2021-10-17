import java.util.Scanner;

public class randomNum { 
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); //Create a Scanner Object

        //asks user to pick a number 
        System.out.println("Pick a number from 1-20");
        int userNum = myObj.nextInt();

        // will give user feedback on whether or not they guessed it right
        int targetNum = ((int)(Math.random()*20 +1));
        //output 
        //if user guesses correctly 
        if (userNum = targetNum) {
            System.out.println("Good job, you've guessed it correctly!");
        }
        //if user guesses too high
        if (userNum > targetNum) {
            System.out.println("Too high, try again :)");
        }

        if (userNum < targetNum) {
            System.out.println("Too low, try again :)");
        }
        
        //output close
        myObj.close();
    } //closing bracket for main
} //closing bracket for public class