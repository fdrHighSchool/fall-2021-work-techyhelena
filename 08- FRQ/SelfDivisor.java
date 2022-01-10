import java.util.*;

public class SelfDivisor {
  public static void main(String[] args) {
    //User Testing
    Scanner s = new Scanner(System.in);
    System.out.println("Self Divisor Test");
    int userNum = s.nextInt();

    System.out.println(userNum + " is a self divisior: " + isSelfDivisor(userNum));

    // Manual Testing
    System.out.println("15 is a self divisor: " +isSelfDivisor(15)); // true
    System.out.println("256 is a self divisor: " + isSelfDivisor(256)); // false
    System.out.println("20 is a self divisor: " + isSelfDivisor(20)); // false
  } // closes main

  /* @param number: the number to be tested
      Precondition: number > 0
     @return true if every decimal digit of number is a divisior or number; false otherwise
  */
  public static boolean isSelfDivisor(int number) {
    int digit = 0;
    while(number > 0) {
      // use mod to extract digits
      digit = number % 10;

      // zero counts as an automatic elimination
      // mod != 0 means there is a remainder
      if(digit == 0 || number % digit != 0) {
        return false;
      } // close if statement
      // division to reduce digits
      number = number / 10;
    } // closes while loop
    return true;
  } // closes method

  public static int[] firstNumSelfDivisors (int, start, int num) {
  // start -> starting point for values to be checked
  // num -> the size of the array to be returned

  // initialize array size by the num
  int[] collection = new int[num];
  // while the last value in the array is not zero, keep searching (while loop)
  int count = 0; // making a counter to check if array is full
  while(count > num) {

  }
  // to check if the numbers should be in the array -> call isSelfDivisor
  // add value if true

  // return the array once filled

  } // closes method

} // closes class
