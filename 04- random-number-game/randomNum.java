import java.util.Scanner;

public class randomNum { 
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); //Create a Scanner Object
        //asks user to pick a number 
        System.out.println("Pick a number from 1-20");
        int userNum = myObj.nextInt();
        //inputs a random number in variable
        int targetNum = ((int)(Math.random()*20 +1));

        // will give user feedback on whether or not they guessed it right
        //if user guesses correctly 
        if (userNum == targetNum) {
            System.out.println("Good job, you've guessed it correctly!");
        }
        //if user guesses too high
        if (userNum > targetNum) {
            System.out.println("Your number was too high :^0" + " The number was " + targetNum);
        }
        //if user guesses too low
        if (userNum < targetNum) {
            System.out.println("Your number was too low :'(" + " The number was " + targetNum);
        }
    
        myObj.close();
    } //closing bracket for main
} //closing bracket for public class