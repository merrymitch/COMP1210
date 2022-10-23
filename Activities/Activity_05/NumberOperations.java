/**
 * Program to hold an integer value and perform various
 * operations on it.
 *
 * Activity 5
 * @author Mary Mitchell COMP1210-003
 * @version 09-19-2020
 */
public class NumberOperations {
   private int number;
   /**
    * Accepts an int parameter and sets the variable number
    * to that value.
    *
    * @param numberIn sets the value of number.
    */
   // constructor
   public NumberOperations(int numberIn) {
      number = numberIn;
   }
   // methods
   /**
    * Returns the value of number.
    * 
    * @return the value of number.
    */
   public int getValue() {
      return number;
   }
   /**
    * Creates a loop that will iterate as long as i is less than
    * the value of number. The loop will concatentate the value of
    * i if it is odd. Also increment value of i each loop.
    *
    * @return the value of output.
    */
   public String oddsUnder() {
      String output = "";
      int i = 0;
      while (i < number) {
         if (i % 2 != 0) {
            output += i + "\t";
         }
         i++;
      }
      return output;
   }
   /**
    * Creates loop to iterate through each number up until the value 
    * of number. Concatentates the value of powers if it is a power of 
    * 2 and calculates the next power of 2.
    *
    * @return the output of the powers.
    */
   public String powersTwoUnder() {
      String output = "";
      int powers = 1;
      while (powers < number) {
         output += powers + "\t";
         powers = powers * 2;
      }
      return output;
   }
   /**
    * Accepts an int parameter and compares it to number.
    *
    * @param compareNumber will be compared to number.
    * @return 1, -1, 0 based on if number is greater, less or 
    * equal to parameter.
    */
   public int isGreater(int compareNumber) {
      if (number > compareNumber) {
         return 1;
      }
      else if (number < compareNumber) {
         return -1;
      }
      else {
         return 0;
      }
   }
   /**
    * Returns a string representation of the object.
    * 
    * @return the number object.
    */
   public String toString() {
      return number + "";
   }
}
