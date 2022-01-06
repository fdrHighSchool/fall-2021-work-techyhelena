import java.util*;

public class SelfDivisor {
  public static void main(String[] args) {
    int testCase = 15;
  } // closes main

  /* @param number: the number to be tested
      Precondition: number > 0
     @return true if every decimal digit of number is a divisior or number; false otherwise
  */
  public static boolean isSelfDivisor(int number) {
    // loop to go through every value in number
    // chop the number down by 10
    while(number >  0) {
      // checking if each value in number is self divisable
      // use mod -> if the mod of a number is not 0 then there's a remainder (not self dvisiable)
      int answer = testCase;
      System.out.println(testCase % 10);
      System.out.printn(testCase / 10);
      // zero counts as an automatic elimination (false statement)
      if(){

      } // end if statement


    } // closes while loop

    return 0;
  } // closes method

} // closes class
