import java.util.*;

public class FracCalc {
    /**
     * Prompts user for input, passes that input to produceAnswer, then outputs the result.
     * @param args - unused
     */
    public static void main(String[] args){
        // TODO: Read the input from the user and call produceAnswer with an equation
        Scanner s = new Scanner(System.in);
        System.out.println("Fraction Calculator: Please enter a fraction problem. ");
        //allow user to type quit to stop
        System.out.println("Disclaimer: If you wish to quit, simply type 'quit'");
        //Getting user input
        String userInput = s.nextLine();
        // Checkpoint 1: Create a Scanner, read one line of input, pass that input to produceAnswer, print the result.
        System.out.println(produceAnswer(userInput));
        System.out.println("whole: " + getWhole(userInput) + " numerator: " + getNum(userInput) + " denominator: " + getDen(userInput));
        // Checkpoint 2: Accept user input multiple times.
    }//end main method

    /**
     * produceAnswer - This function takes a String 'input' and produces the result.
     * @param input - A fraction string that needs to be evaluated.  For your program, this will be the user input.
     *      Example: input ==> "1/2 + 3/4"
     * @return the result of the fraction after it has been calculated.
     *      Example: return ==> "1_1/4"
     */
    public static String produceAnswer(String input){
        // TODO: Implement this function to produce the solution to the input

        // Checkpoint 1: Return the second operand.  Example "4/5 * 1_2/4" returns "1_2/4".
        //split the equation into parts and store them into variables
        int space = input.indexOf(" ");
        String firstOperand = input.substring(0, space);
        String secondOperand = input.substring(space + 3);
        String operator = input.substring(space + 1);

        return secondOperand;
    }//end produceAnswer method

        // Checkpoint 2: Return the second operand as a string representing each part.
        //               Example "4/5 * 1_2/4" returns "whole:1 numerator:2 denominator:4".

    //getting whole number if there is any
    public static String getWhole(String input) {
      if input.contains(" ") {
        //return the whole number
        //the space before the fraction determines that its a whole number
        return input.substring(0, input.indexOf(" "));
      } //ends if statement
      //if there is a dash then theres no whole number
      //the program will return 0 as the output
      if input.contains("/") {
        return "0"
      }
    } //ends getWhole()

    //getting numerator
    public static String getNum(String input) {
      String space = input.indexOf(" ");
      String dash = input.indexOf("/");
      if input.contains(" ") && input.contains("/"){
        //the numerator is usually after the whole number
        //if we shift one from the space, we're left with the numerator
        //the numerator is always before the dash
        return input.substring(space + 1, dash);
      } //ends if statement
     } //end getNum

     public static String getDen(String input) {
      //setting variables
      String space = input.indexOf(" ");
      String dash = input.indexOf("/");
      //the denominator is always after the dash
      if input.contains("/") {
        return input.substring(dash + 1);
      }


     } //end getDen



        // Checkpoint 3: Evaluate the formula and return the result as a fraction.
        //               Example "4/5 * 1_2/4" returns "6/5".
        //               Note: Answer does not need to be reduced, but it must be correct.
        // Final project: All answers must be reduced.
        //               Example "4/5 * 1_2/4" returns "1_1/5".




    // TODO: Fill in the space below with helper methods

    /**
     * greatestCommonDivisor - Find the largest integer that evenly divides two integers.
     *      Use this helper method in the Final Checkpoint to reduce fractions.
     * @param a - First integer.
     * @param b - Second integer.
     * @return The GCD.
     */
    // public static int greatestCommonDivisor(int a, int b){
    // }//end greatestCommonDivisor method

    /**
     * leastCommonMultiple - Find the smallest integer that can be evenly divided by two integers.
     *      Use this helper method in Checkpoint 3 to evaluate expressions.
     * @param a - First integer.
     * @param b - Second integer.
     * @return The LCM.
     */
    // public static int leastCommonMultiple(int a, int b){


    // }//end leastCommonMultiple

}//end class
