/**
 * Class to hold an array of numerical values and provide
 * methods that allow user to interact with the class.
 *
 * Activity 8
 * @author Mary Mitchell COMP1210-003
 * @version 10-26-2020
 */
public class Scores {
   // instance variable
   private int[] numbers;
   
   // constructor
   /**
    * Parameter is an array of int values that is used to
    * set the numbers field.
    *
    * @param numbersIn used to set numbers field.
    */
   public Scores(int[] numbersIn) {
      numbers = numbersIn;
   }
   
   // methods
   /**
    * Accepts no parameters and finds the evens in the array
    * and then returns them.
    *
    * @return the evens in the array.
    */
   public int[] findEvens() {
      int numberEvens = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            numberEvens++;
         }
      }
      int[] evens = new int[numberEvens];
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            evens[count] = numbers[i];
            count++;
         }
      }
      return evens;
   }
   /**
    * Accepts no parameters and finds the odds in the array
    * and then returns them.
    *
    * @return the odds in the array.
    */
   public int[] findOdds() {
      int numberOdds = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 != 0) {
            numberOdds++;
         }
      }
      int[] odds = new int[numberOdds];
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 != 0) {
            odds[count] = numbers[i];
            count++;
         }
      }
      return odds;
   }
   /**
    * Accepts no parameters and calculates the average of the 
    * numbers in the array.
    *
    * @return the average of the array integers.
    */
   public double calculateAverage() {
      int sum = 0;
      for (int i = 0; i < numbers.length; i++) {
         sum += numbers[i];
      }
      return ((double) sum / numbers.length);
   }
   /**
    * Accepts no parameters and returns string of integers
    * in the array.
    *
    * @return a string of the numbers in the array.
    */
   public String toString() {
      String result = "";
      for (int i = 0; i < numbers.length; i++) {
         result += numbers[i] + "\t";
      }
      return result;
   }
   /** 
    * Accepts no parameters and returns string of integers 
    * in the array in reverse order.
    *
    * @return a string of the numbers in the array in reverse.
    */
   public String toStringInReverse() {
      String result = "";
      for (int i = numbers.length - 1; i != -1; i--) {
         result += numbers[i] + "\t";
      }
      return result;
   }
}