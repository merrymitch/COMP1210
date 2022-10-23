/**
 * Program to perform division between two numbers.
 *
 * Activity 11
 * @author Mary Mitchell COMP1210-003
 * @version 11-14-020
 */
public class Division {
   /**
    * Accepts two int values and performs division.
    *
    * @param numeratorIn The numerator of the division.
    * @param denominatorIn The denominator of the division.
    * @return The result of the division or 0 if improper division.
    */
   public static int intDivide(int numeratorIn, int denominatorIn) {
      try {
         return numeratorIn / denominatorIn;
      } 
      catch (ArithmeticException e) {
         return 0;
      }
   }
   /** 
    * Accepts two int values and performs floating point division.
    *
    * @param numeratorIn The numerator of the division.
    * @param denominatorIn The denominator of the division.
    * @throws IllegalArgumentException if denominator is 0.
    * @return The result of the division or throws if denom is 0.
    */
   public static float decimalDivide(int numeratorIn, int denominatorIn) {
      if (denominatorIn == 0) {
         throw new IllegalArgumentException("The denominator "
            + "cannot be zero.");
      }
      return (float) numeratorIn / denominatorIn;
   }
}