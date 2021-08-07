import java.util.Scanner;
/**
 * Program to read input values to be used in an equation.
 *
 * Project 2
 * @author Mary Mitchell
 * @version 9-04-2020
 */
public class ExpressionResult {
   /**
    * Reads input of 3 values and uses them in an equation.
    *
    * @param args Command line arguments - not used.
    */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      double x = 0, y = 0, z = 0;
      System.out.println("result = (x - 1.1) (2y + 2.2) (4z + 4.4) / xyz");
      //Prompts user for x value
      System.out.print("\tx = ");
      x = userInput.nextDouble();
      //Prompts user for y value
      System.out.print("\ty = ");
      y = userInput.nextDouble();
      //Prompts user for z value
      System.out.print("\tz = ");
      z = userInput.nextDouble();
      //Prints result of expression
      if (x * y * z == 0) {
         System.out.print("result is \"undefined\"");
      }
      else {
         System.out.print("result = "
            + ((x - 1.1) * (2 * y + 2.2) * (4 * z + 4.4)) / (x * y * z));
      }
   
   }
   
}
