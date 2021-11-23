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

        //integer variables
        int wholeInt = 0;
        int numInt = 0;
        int denInt = 0;

        //whole number
        // 1_2/3
        if (firstOperand.indexOf("_") != -1) {
          mixedNum = true;
          ws = firstOperand.substring(0, firstOperand.indexOf("_"));
          //making it into an improper
          wholeInt = Integer.parseInt(ws);
          numInt = firstOperand.indexOf("_") + 1 , firstOperand.indexOf("/"));
          denInt = firstOperand.indexOf("/") + 1;
          //add improper into numerator

          // numInt = wholeInt * denInt + numInt;
          // return numInt;
          // System.out.println("whole: " + wholeInt);

        // 2/3
        }
        else {
          int wholeInt = 0;
          System.out.println("whole: " + wholeInt);
        }

        //numerator
        //when there is no whole number
        if (firstOperand.contains("_") == false) {
          ns = firstOperand.substring(0, firstOperand.indexOf("/"));
          numInt = Integer.parseInt(ns);
          System.out.println("numerator: " + numInt);
        }
        //when there is a whole number
        else if (firstOperand.contains("/") && firstOperand.contains("_") == true) {
          ns = firstOperand.substring(firstOperand.indexOf("_") + 1 , firstOperand.indexOf("/"));
          numInt = Integer.parseInt(ns);
          System.out.println("numerator: " + numInt);
        }
        else {
          ns = "0";
          numInt = Integer.parseInt(ns);
          System.out.println("numerator: " + numInt);
        }
        //when there is no dash
        if (firstOperand.conatins("/") == false) {
          ns = firstOperand.substring(0, operand);
          numInt = Integer.parseInt(ns);
        }


        //denominator
        //when there isn't a denominator
        if (firstOperand.indexOf("/") == -1) {
          ds = "1";
          denoInt = Integer.parseInt(ds);
          System.out.println("denominator: "+ denoInt);
        }

        else {
          denoInt = Integer.parseInt(ds);
          System.out.println("denominator: " + denoInt);
        }

        //SECOND OPERAND
        boolean mixedNum2 = false;
        String ws2 = "";
        String ns2 = "";
        String ds2 = secondOperand.substring(secondOperand.indexOf("/") + 1);

        //variables for the integers
        int wholeInt2 = 0;
        int numInt2 = 0;
        int denInt2 = 0;

        //whole number
        // 1_2/3
        if (secondOperand.indexOf("_") != -1) {
          mixedNum2 = true;
          ws2 = secondOperand.substring(0, secondOperand.indexOf("_"));
          wholeInt2 = Integer.parseInt(ws2);

          //System.out.println("whole: " + wholeInt2);
        // 2/3
        } else {
          wholeInt2 = 0;
          System.out.println("whole: " + wholeInt2);
        }

        //numerator
        if (secondOperand.contains("_") == false) {
          ns2 = secondOperand.substring(0, secondOperand.indexOf("/"));
          numInt2 = Integer.parseInt(ns2);
          System.out.println("numerator: " + numInt2);
        }

        else if (secondOperand.contains("/") && secondOperand.contains("_") == true) {
          ns2 = secondOperand.substring(secondOperand.indexOf("_") + 1, secondOperand.indexOf("/"));
          numInt2 = Integer.parseInt(ns2);
          System.out.println("numerator: " + numInt2);
        }
        else {
          numInt2 = 0;
          System.out.println("numerator: " + numInt2);
        }

        //denominator
        //when there isn't a denominator
        if (secondOperand.indexOf("/") == -1) {
          ds2 = "1";
          denoInt2 = Integer.parseInt(ds2);
          System.out.println("denominator: "+ denoInt2);
        }

        else {
          denoInt2 = Integer.parseInt(ds2);
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
       return improperNum;
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


    /*
    public static int getNum(String frac) {
      int num = 0;
      int slashPos = frac.indexOf("/");

      if (frac.contains("_")) {
        int underScorePos = frac.indexOf("_");
        int whole = Integer.parseInt(frac.substring(0, underScorePos));
        int den = getDen(frac);
        num = Integer.parseInt(frac.substring(underScorePos + 1, slashPos));

        return whole * den + num;
      } // end if mixed number

      if (frac.contains("/")) {
        return Integer.parseInt(frac.substring(0, slashPos));
      } // end if normal fraction

      return Integer.parseInt(frac);
    } // end getNum method
    */

}//end class
