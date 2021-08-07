import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * Program to read a value from the user, solve an 
 * equation with it, and display the number of characters
 * before and after the decimal in the answer.
 *
 * Project 3
 * @author Mary Mitchell
 * @version 09-11-2020
 */
public class FormulaSolver {
  /**
   * Reads a value from the user and solves an equation with it.
   * Displays the number of characters before/after the decimal 
   * of the answer.
   *
   * @param args Command line arguments - not used.
   */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      double x, radicand, result;
      // user inputs value for x
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();
      
      // calculates the equation under square root
      radicand = Math.abs((7 * Math.pow(x, 3)) + (5 * Math.pow(x, 2))
         + (3 * x) + 1);
      
      // calculates the whole equation and prints answer
      result = ((6 * Math.pow(x, 3)) - 4) * Math.sqrt(radicand);
      System.out.println("Result: " + result);
     
      // displays # of characters to left/right of decimal
      String stringResult = Double.toString(result);
      System.out.println("# of characters to left of decimal point: "
         + stringResult.indexOf('.'));
      System.out.println("# of characters to right of decimal point: "
         + (stringResult.length() - stringResult.indexOf('.') - 1));
      
      // converts the result to a different format
      DecimalFormat resultfmt = new DecimalFormat("#,##0.0#####");
      System.out.println("Formatted Result: " + resultfmt.format(result));
   }
}