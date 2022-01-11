//REFERENCE TO 2D ARRAY: https://www.geeksforgeeks.org/multidimensional-arrays-in-java/
public class Grades2D {
  public static void main(String[] args) {
    // 15 stydents, each with 5 grades
    // initialize
    // [row index] [column index]
    int[][] studentGrades = new int[15][5];
    // fill & access
    for(int i = 0; i < studentGrades.length; i++) {
      studentGrades[i] = (int)(Math.random()* 46) +55;
    }
    // print
  }

}
