import java.util.*;

//resources https://www.geeksforgeeks.org/c-program-find-largest-element-array/?ref=lbp

public class CentralMeasures {
 public static void main(String[] args) {
   //TEST CASE
   //total sum = 55
   //avg = 5.5
   int[] myNum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //num of values = 10
   // System.out.println("The average of TestDummy is: " + average(myNum));
   // System.out.println("Range of TestDummy: " + range(myNum));

   int[] medArr = {2, 5, 10, 9, 1, 3, 4, 6, 5, 8};
   System.out.println("Median: " + median(medArr));

   // 100 random values in an array
   int[] randomArray = new int[100];

   // loop 100 times
   for(int i = 0; i < 100; i++) {
     // choose a random number from 1-100
     int randNum = (int)((Math.random() * 100) + 1);

     // store the values in the array
     randomArray[i] = randNum;
   } //ending for loop

   // testing
   // System.out.println("randomArray values: " + Arrays.toString(randomArray));
   // System.out.println("Average of randomArray: " + average(randomArray));
   // System.out.println("Range of randomArray" + range(randomArray) );

   int[] testDummy = {5, 7, 1, 9, 10, 3, 8, 8, 2};
   System.out.println("Mode: "+ mode(testDummy));
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
 //find the index of the largest freq in original array
 public static String mode(int[] arr) {
  int max = findMax(arr);
  //TEST DUMMY

  //another array to check which number appears the most
  int[] freqDummy = new int[max + 1];

  // this loop adds values into freqDummy
  for(int i = 0; i < arr.length; i++) {
    freqDummy[arr[i]]++;
  } //closes for loop

  System.out.println("Displaying values in freqDummy: " + Arrays.toString(freqDummy));
  //declare variable for max reps
  int maxReps = findMax(freqDummy);
  // System.out.println(maxReps);
  // printing out the index of the maxReps

  // No mode
  if(findMax(freqDummy) == 1) {
    return "NO MODE";
  }

  for(int i = 0; i < freqDummy.length; i++) {
    if(maxReps == freqDummy[i]) {
      return "" + i;
    } // end if statement
  } // end for loop

   return "0"; //placeholder for now
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
 public static double median(int[] arr) {
  // outer loop to track which index to sort next
  for (int i = 0; i < arr.length; i++) {

  // assume min is in correct spot
  int min = arr[i];
  int minLoc = i;

  // store temp for swap later on
  int temp = arr[i];

  // search for min of remaining values
  for (int j = i + 1; j < arr.length; j++) {

    // found a new min!
    if (arr[j] < min) {
      // update info on what and where min is
      min = arr[j];
      minLoc = j;
    } // end if statement
  } // end inner for loop

  // perform the swap
  arr[i] = min;
  arr[minLoc] = temp;
  } // end outer for loop

  //figuring out the median
  // if array has even amount of values
  if (arr.length % 2 == 0) {
    // double - in case its a decimal
    return (double)(arr[arr.length/2] + arr[arr.length/2-1]) / 2;
  } // end if statement
  else {
    return arr[arr.length/2];
  } // end else statement
 }

} //end class
