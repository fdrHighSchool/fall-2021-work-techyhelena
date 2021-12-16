import java.util.*;

//resources https://www.geeksforgeeks.org/c-program-find-largest-element-array/?ref=lbp

public class CentralMeasures {
 public static void main(String[] args) {
   //TEST CASE
   //total sum = 55
   //avg = 5.5
   int[] myNum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //num of values = 10
   System.out.println("The average of TestDummy is: " + average(myNum));
   System.out.println("Range of TestDummy: " + range(myNum));

   int[] medArr = {2, 5, 10, 9, 1, 3, 4, 6, 5, 8};

   // 100 random values in an array
   int[] randomArray = new int[100];

   // loop 100 times
   for(int i = 0; i < 100; i++) {
     // choose a random number from 1-100
     int randNum = (int)((Math.random() * 100) + 1);

     // store the values in the array
     randomArray[i] = randNum;
   } //ending for loop

   //testing if it stores data corectly
   System.out.println("randomArray values: " + Arrays.toString(randomArray));
   System.out.println("Average of randomArray: " + average(randomArray));
   System.out.println("Range of randomArray" + range(randomArray) );
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
  int max = findMax(arr);
  //TEST DUMMY
  int[] testDummy = {5, 7, 1, 9, 8, 2, 8, 2, 2};
  //another array to check which number appears the most
  int[] freqDummy = new int[max + 1];

  // this loop adds values into freqDummy
  for(int i = 0; i < testDummy.length; i++) {
    freqDummy[arr[i]]++;
  } //closes for loop


  //have program say theres no mode


   return 0; //placeholder for now
 }

 // method to find max val
  public static int findMax(int[] arr) {
  // int max = 0;
   int max = arr[0]; //setting max to index 0 at default

   for(int i = 0; i < arr.length; i++) {
     if(arr[i] > max) {
       max = arr[i];
     } // end if statement
   } // end for loop

   return max;
 } // end findMax method

  //method to find min val
  public static int findMin(int[] arr) {
    // int min = 0;
    int min = arr[0]; //setting min to index 0 at default

    for(int i = 0; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      } // end if statement
    } // end for loop
    return min;
  }

 // range
 // find the greatest and smallest value
 // then greatest - smallest = range
 public static int range(int[] arr) {
   // range of myNum should be 9
   return findMax(arr) - findMin(arr);
 }

 // median
 // put in numerical order
 // one method: replace values in each index to place everything in numerical order
 // second method: to make another array for the numerical order
 public static double median(int[] arr) {
   int temp = 0;
   for(int j = 0; j < arr.length; j++){
     int

   }
   return 0; //placeholder
 }



} //end class
