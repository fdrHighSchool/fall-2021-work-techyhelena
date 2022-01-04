import java.util.*;

/*
Suppose a class was scheduled to have 5 exams
and the teacher was storing those exam grades
for each student in their own array.
Due to a test that many students did poorly on,
a 6th test has been introduced.
*/

public class Exams {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    // sample student with 5 slots for grades
    int[] sampleStudent = new int[5];

    // fill up the "gradebook"
    for(int i = 0; i < sampleStudent.length; i++) {
      sampleStudent[i] = (int)(Math.random() * 46) + 55;
    } // end for loop

    // display the first 5 grades
    // System.out.println(Arrays.toString(sampleStudent));
    // System.out.println(Arrays.toString(secondArray));



  } // end main method

/*
A) Write a method that adds a 6th exam
to the sample student’s set of grades.
*/

  public static int[] secondArray(int[] arr) {
    // increasing slot by one
    int[] modifyGrades = new int[arr.length + 1];
    // grab the original value in first and then add the sixth value last
    for(int i = 0; i < arr.length; i++) {
      modifyGrades[i] = arr[i];
    } //closes for loop

    return modifyGrades;
  } // end secondArray method

/*
B) Write a method that takes the original set
of 5 grades and replaces the lowest grade if
the 6th grade is greater than it.
If it is not, then the original 5 grades remain.
*/


} // end class
