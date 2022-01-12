//REFERENCE TO 2D ARRAY: https://www.geeksforgeeks.org/multidimensional-arrays-in-java/
import java.util.   *;
public class Grades2D {
  public static void main(String[] args) {
    // 15 stydents, each with 5 grades
    // initialize
    // [row index] [column index]
    int[][] studentGrades = new int[15][5];
    // accessing
    System.out.println(studentGrades[studentGrades.length-1][studentGrades[0].length - 1]);
    System.out.println(studentGrades.length); // = 15
    System.out.println(studentGrades[0].length); // = 5

    int num = 1;
    // going thru every row
    for (int row = 0; row < studentGrades.length; row++) {
      // going thru every col
      for(for int col = 0; col < studentsGrades[0].length; col++) {
        //filling numbers in each row and col
        studentGrades[row][col] = num;
        num++;

      } // end col loop
    } // end row loop
    // print
  }

}
