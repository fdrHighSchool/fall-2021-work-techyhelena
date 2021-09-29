public class RocketShip {
  //make the triangle method
  public static void triangle() {
    System.out.println("  /  \\");
    System.out.println(" /    \\");
    System.out.println("/      \\"); // added an extra / because its a special charcater
  } //closes triangle function


  //makes the vertical 
  public static void line() {
    System.out.println("|      |");
    System.out.println("|      |");
  } //closes the vertical lines

  //start of square function
  public static void square() {
    System.out.println("+------+");
    line();
    System.out.println("+------+");

  } //closes square function

  



  public static void main(String[] args) {
    triangle();
    square();



} //closes main



} // end class
