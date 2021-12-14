import java.util.*;

public class CentralMeasures {
  public static void main(String[] args) {
    //TEST CASE
    //num of values = 10
    //total sum = 55
    //avg = 5.5
    int[] myNum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    System.out.println("The average is: " + average(myNum)); 

    // 100 random values in an array
    int[] randomArray = new int[100];

    // loop 100 times
    for(int i = 0; i < 100; i++) {
      // choose a random number from 1-100
      int ranNum = (int)((Math.random() * 100) + 1);

      // store the values in the array
      randomArray[i] = ranNum;
    } //ending for loop

    //testing if it stores data corectly
    System.out.println("randomArray values: " + Arrays.toString(randomArray));
    System.out.println("Average of randomArray: " + average(randomArray));
  } // end main 

  public static double average(int[] arr) {
    // declare accumulator variable
    double total = 0.0;

    // add up all of the data
    for(int i = 0; i < arr.length; i++) {
      total += arr[i];
    }

    // divide total by number of data values
    return total / arr.length;
  } //end average()


  //create an array for both the mode and the frequency 
  //check which is the greatest value in frequency
  //find the index of the largest freq.

  public static int mode(int[] arr) {
   //TEST DUMMY 
   int[] testDummy = {5, 7, 1, 9, 8, 2, 8, 2, 2};
   //another array to check which number appears the most
   int[] freqDummy = new int[9];

    // a loop to check 
    for () {

    } // closes for loop
  }

} //end class
