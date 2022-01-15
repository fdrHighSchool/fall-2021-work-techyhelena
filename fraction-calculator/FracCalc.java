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
        //Getting user input
        String userInput = s.nextLine();
        produceAnswer(userInput);
    } //end main method

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
        int denInt;

        //whole number
        // 1_2/3
        if (firstOperand.indexOf("_") != -1) {
          mixedNum = true;
          ws = firstOperand.substring(0, firstOperand.indexOf("_"));
          wholeInt = Integer.parseInt(ws);
          
          //make into improper fraction 
          numInt = Integer.parseInt(firstOperand.substring(firstOperand.indexOf("_")), firstOperand.indexOf("/"));
          denInt = Integer.parseInt(ds);

          numInt = wholeInt * denInt + numInt; 
          return numInt; 
        }

        // 2/3
        else {
          return wholeInt;
        }

        //numerator
        //when there is no whole number
        if (firstOperand.contains("_") == false) {
          ns = firstOperand.substring(0, firstOperand.indexOf("/"));
          numInt = Integer.parseInt(ns);
          return numInt;
        }
        //when there is a whole number
        if (mixedNum == true) {
          ns = firstOperand.substring(firstOperand.indexOf("_") + 1 , firstOperand.indexOf("/"));
          numInt = Integer.parseInt(ns);
          return numInt;
        }
        //2 + 2 case / no num or den
        if (firstOperand.contains("_") == false && firstOperand.contains("/") == false) {
          ns = firstOperand.substring(0, operator);
          numInt = Integer.parseInt(ns);
          return numInt;
        }

        //denominator
        if (firstOperand.indexOf("/") == -1) {
          denInt = 1;
          return denInt;
        }

        else {
          denInt = Integer.parseInt(ds);
          return denInt;
        }

        //SECOND OPERAND
        boolean mixedNum2 = false;
        String ws2 = "";
        String ns2 = "";
        String ds2 = secondOperand.substring(secondOperand.indexOf("/") + 1);

        //variables for the integers
        int wholeInt2 = 0;
        int numInt2 = 0;
        int denInt2;

        //whole number
        // 1_2/3
        if (secondOperand.indexOf("_") != -1) {
          mixedNum2 = true;
          ws2 = secondOperand.substring(0, secondOperand.indexOf("_"));
          wholeInt2 = Integer.parseInt(ws2);
          //make into improper fraction
          numInt = Integer.parseInt(secondOperand.substring(secondOperand.indexOf("_")), secondOperand.indexOf("/"));
          denInt = Integer.parseInt(ds);

          numInt = wholeInt * denInt + numInt;
          return numInt;
        }

        // 2/3
        else {
          return wholeInt2;
        }

        //numerator
        //when there is no whole number
        if (secondOperand.contains("_") == false) {
          ns2 = secondOperand.substring(0, secondOperand.indexOf("/"));
          numInt2 = Integer.parseInt(ns2);
          return numInt2;
        }

        //when there is a whole number
        if (mixedNum == true) {
          ns2 = secondOperand.substring(secondOperand.indexOf("_") + 1, secondOperand.indexOf("/"));
          numInt2 = Integer.parseInt(ns2);
          return numInt2;
        }

        //2 + 2 case / no num or den
        if (secondOperand.contains("/") == false && secondOperand.contains("_") == false) {
          ns2 = secondOperand.substring(0, operator);
          numInt2 = Integer.parseInt(ns2);
          return numInt2;
        }

        //denominator
        //when there isn't a denominator
        if (secondOperand.indexOf("/") == -1) {
          denInt2 = 1;
          return denInt2;
        }

        else {
          denInt2 = Integer.parseInt(ds2);
          return denInt2;
        }

        //PERFORING MATH METHODS
        if (operator.equals("+")) {
          return add(numInt, denInt, numInt2, denInt2);
        }

        else if (operator.equals("-")) {
          return subtract(numInt, denInt, numInt2, denInt2);
        }

        else if (operator.equals("*")) {
          return multiply(numInt, denInt, numInt2, denInt2);
        }

        else {
          return division(numInt, denInt, numInt2, denInt2);
        }

    }//end produceAnswer method


        // Checkpoint 3: Evaluate the formula and return the result as a fraction.
        //               Example "4/5 * 1_2/4" returns "6/5".
        //               Note: Answer does not need to be reduced, but it must be correct.
 

     public static int add(int num1, int den1, int num2, int den2) {
       int addNum = (num1 *den2) + (num2 * den1);
       int commonDen = (den1 * den2);
       int total = addNum + "/" + commonDen;
       return total;
     }

     public static int subtract(int num1, int den1, int num2, int den2) {
       int subtractNum = (num1 * den2) - (num2 * den1);
       int commonDen = (den1 * den2);
       int total = subtractNum + "/" + commonDen;
     }

     public static int multiply(int num1, int den1, int num2, int den2) {
       int numProduct = num1 * num2;
       int denProduct = den1 * den2;
       int total = numProduct + "/" + denProduct;
       return total;
     }

     public static int divison(int num1, int den1, int num2, int den2) {
       int numQuotient = num1 * den2;
       int denQuotient = num2 * den1;
       int total = numQuotient + "/" + denQuotient;
       return total;
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
