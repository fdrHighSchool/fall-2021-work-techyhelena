import java.util.*;

public class Main {
    /**
     * Prompts user for input, passes that input to produceAnswer, then outputs the result.
     * @param args - unused
     */
    public static void main(String[] args){
        // TODO: Read the input from the user and call produceAnswer with an equation
        Scanner s = new Scanner(System.in);
        System.out.println("Fraction Calculator: Please enter a fraction problem. ");
        //allow user to type quit to stop
        //System.out.println("Disclaimer: If you wish to quit, simply type 'quit'");
        //use .equals 
        //Getting user input
        String userInput = s.nextLine();
        // Checkpoint 1: Create a Scanner, read one line of input, pass that input to produceAnswer, print the result.
        produceAnswer(userInput);
        // Checkpoint 2: Accept user input multiple times.
    }//end main method

    /**
     * produceAnswer - This function takes a String 'input' and produces the result.
     * @param input - A fraction string that needs to be evaluated.  For your program, this will be the user input.
     *      Example: input ==> "1/2 + 3/4"
     * @return the result of the fraction after it has been calculated.
     *      Example: return ==> "1_1/4"
     */
    public static String produceAnswer(String input) {
        // TODO: Implement this function to produce the solution to the input
        //seperating the fractions into two parts 
        int space = input.indexOf(" ");
        String firstOperand = input.substring(0, space);
        String secondOperand = input.substring(space + 3);
        String operator = input.substring(space + 1);

        //FIRST OPERAND
        boolean mixedNum = false; 
        String ws = "";
        String ns = "";
        String ds = firstOperand.substring(firstOperand.indexOf("/") + 1);

        //whole number 
        // 1_2/3
        if (firstOperand.indexOf("_") != -1) {
          mixedNum = true; 
          ws = firstOperand.substring(0, firstOperand.indexOf("_"));
          int wholeInt = Integer.parseInt(ws);
          System.out.println("whole: " + wholeInt);
        // 2/3
        } else {
          ws = "0";
          int wholeInt = Integer.parseInt(ws);
          System.out.println("whole: " + wholeInt);
        }

        //numerator 
        if (firstOperand.contains("_") == false) {
          ns = firstOperand.substring(0, firstOperand.indexOf("/"));
          int numInt = Integer.parseInt(ns);
          System.out.println("numerator: " + numInt);
        }

        else if (firstOperand.contains("/") && firstOperand.contains("_") == true) {
          ns = firstOperand.substring(firstOperand.indexOf("_") + 1);
          int numInt = Integer.parseInt(ns);
          System.out.println("numerator: " + numInt);
        } 
           else {
          ns = "0";
          int numInt = Integer.parseInt(ns); 
          System.out.println("numerator: " + numInt);
        }

        //denominator 
        //when there isn't a denominator
        if (firstOperand.indexOf("/") == -1) {
          ds = "1";
          int denoInt = Integer.parseInt(ds);
          System.out.println("denominator: "+ denoInt);
        } 

        else {
          int denoInt = Integer.parseInt(ds);
          System.out.println("denominator:" + denoInt);
        } 
        
        //SECOND OPERAND 
        boolean mixedNum2 = false; 
        String ws2 = "";
        String ns2 = "";
        String ds2 = secondOperand.substring(secondOperand.indexOf("/") + 1);

        //whole number 
        // 1_2/3
        if (firstOperand.indexOf("_") != -1) {
          mixedNum2 = true; 
          ws2 = secondOperand.substring(0, secondOperand.indexOf("_"));
          int wholeInt2 = Integer.parseInt(ws2);
          System.out.println("whole: " + wholeInt2);
        // 2/3
        } else {
          ws2 = "0";
          int wholeInt2 = Integer.parseInt(ws2);
          System.out.println("whole: " + wholeInt2);
        }

        //numerator 
        if (secondOperand.contains("_") == false) {
          ns2 = secondOperand.substring(0, secondOperand.indexOf("/"));
          int numInt2 = Integer.parseInt(ns2);
          System.out.println("numerator: " + numInt2);
        }

        else if (secondOperand.contains("/") && secondOperand.contains("_") == true) {
          ns2 = secondOperand.substring(secondOperand.indexOf("_") + 1);
          int numInt2 = Integer.parseInt(ns2);
          System.out.println("numerator: " + numInt2);
        } 
        else {
          ns2 = "0";
          int numInt2 = Integer.parseInt(ns2); 
          System.out.println("numerator: " + numInt2);
        }

        //denominator 
        //when there isn't a denominator
        if (secondOperand.indexOf("/") == -1) {
          ds2 = "1";
          int denoInt2 = Integer.parseInt(ds2);
          System.out.println("denominator: "+ denoInt2);
        } 

        else {
          int denoInt2 = Integer.parseInt(ds2);
          System.out.println("denominator:" + denoInt2);
        } 

        return "";
    }//end produceAnswer method


        // Checkpoint 3: Evaluate the formula and return the result as a fraction.
        //               Example "4/5 * 1_2/4" returns "6/5".
        //               Note: Answer does not need to be reduced, but it must be correct.

    //make an improper method 
    public static int Improper(int whole, int num, int den) {
      int improperNum = whole * den;
      improperNum = improperNum + num; 
      return 0; //placeholder
      // return improperNum;
    }

    public static int doMath(int num1, int den1, String operand, int num, int den2) {
      if (operand.equals("*")) {
        multiply(num1, den1, num2, den2);
      }

      if (operand.equals("/")) {
        divison(num, den1, num2, den2);
      }
    }

    public static int multiply(int num1, int den1, int num2, int den2) {
      int numProduct = num1 * num2;
      int denProduct = den1 * den2; 
      int totalProduct = numProduct + "/" + denProduct;
      return 0; //placeholder
      // return totalProduct;
    }


    public static int divison(int num1, int den1, int num2, int den2) {
      int numQuotient = num1 * den2;
      int denQuotient = num2 * den1; 
      int totalQuotient = numQuotient + "/" + denQuotient;
      return 0; //placeholder
      //return totalQuotient;
    }


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
