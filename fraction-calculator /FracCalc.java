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
     public static String getNum(String input) {
       //if there is a whole number the program will output it
       //if not, the program will output 0
       if String whole = firstOperand.substring(0, space) {
         System.out.print("whole: " + whole);
       } else {
         System.out.print("whole: " + 0);
       }
       //variable for dash
       String dash = input.indexOf("/");
       String num = input.substring(space, dash);

       System.out.print(" numerator: " + num);

     } //end getNum

     public static String getDen(String input) {
       //if there is a whole number the program will output it
       //if not, the program will output 0
       if String whole = firstOperand.substring(0, space) {
         System.out.print("whole: " + whole);
       } else {
         System.out.print("whole: " + 0);
       }
       //variable for dash
       String dash = input.indexOf("/");
       String den = input.substring(space, dash);
       System.out.print("denominator: " + den);
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
