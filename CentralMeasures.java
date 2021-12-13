import java.util.*;
import java.io.*;

public class CentralMeasures {
  public static void main(String[] args) {
    System.out.println("The average is: " + average(randomArray));
  } // end main

//finding the average
// find how much numbers are in the array
// then divide that with the sum of the values
  public static double average(int[] arr) {
    //test case
    //num of values = 10
    //total sum = 110
    //avg = 11
    int[] myNum = {2, 4, 6, 8, 10, 12, 14, 18, 20};
    //getting the amount of values
    int amt = myNum.length;
    double sum = 0;

    //finding the sum
    /*
    for (int i = 0; i < myNum.length; i++) {
      sum += myNum[i];
    }

    return sum/amt;
    */

    int[] randomArray = new int[100];
    //store the value in the array
    //loop 100 times Math.random
    for (int i = 0; i  < 100; i++) {
      int value = (int)((Math.random() * 100)+ 1);
      randomArray[i] = value;
    }


  } //end average()


//create an array for both the mode and the frequency then check which is the greatest value in frequency
//find the index of the greatest value



} // end class
