import java.io.*;

public class CentralMeasures {
  public static void main(String[] args) {
    System.out.println("The average is: " + average());
  } // end main

//finding the average
// find how much numbers are in the array
// then divide that with the sum of the values
  public static double average() {
    //test case
    //num of values = 10
    //total sum = 110
    //avg = 11
    int[] myNum = {2, 4, 6, 8, 10, 12, 14, 18, 20};
    //getting the amount of values
    int amt = myNum.length;
    int sum = 0;

    //finding the sum
    for (int i = 0; i < myNum.length; i++) {
      sum += myNum[i];
    }

    return sum/amt;

  } //end average()

  //to get 100 random digits
  //loop 100 times Math.random



} // end class
