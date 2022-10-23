import java.util.ArrayList;
/**
 * Program to hold a set of temperature values and find the highest
 * and lowest temperature from the list.
 * 
 * Activity 6
 * @author Mary Mitchell COMP1210-003
 * @version 09-28-2020
 */
public class Temperatures {
   // instance variable
   private ArrayList<Integer> temperatures = new ArrayList<Integer>();
   // constructor
   /**
    * Accepts an arraylist of integer values and set the temperatures
    * array to the parameter.
    *
    * @param temperaturesIn takes a set of int temperature values.
    */
   public Temperatures(ArrayList<Integer> temperaturesIn) {
      temperatures = temperaturesIn;
   }
   // methods
   /**
    * Determines if list is empty, if so returns 0, otherwise uses a 
    * loop to find the lowest temperature in the list.
    *
    * @return zero if list is empty, otherwise the lowest temperature.
    */
   public int getLowTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      else {
         int low = temperatures.get(0);
         for (int i = 0; i < temperatures.size(); i++) {
            if (temperatures.get(i) < low) {
               low = temperatures.get(i);
            }
         }
         return low;
      }
   }
   /**
    * Determines if list is empty, if so returns 0, otherwise uses a 
    * loop to find the highest temperature in the list.
    *
    * @return zero if list is empty, otherwise the highest temperature.
    */
   public int getHighTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      else {
         int high = temperatures.get(0);
         for (Integer temp : temperatures) {
            if (temp > high) {
               high = temp;
            }
         }
         return high;
      }
   }
   /**
    * Accepts int parameter and returns the parameter if it is lower
    * than the value returned by getLowTemp. Otherwise it returns the 
    * return of getLowTemp.
    *
    * @param lowIn will be compared to return of getLowTemp.
    * @return parameter if lower than value of getLowTemp, otherwise
    * returns getLowTemp.
    */
   public int lowerMinimum(int lowIn) {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
   /**
    * Accepts int parameter and returns the parameter if it is higher 
    * than the value returned by getHighTemp. Otherwise it returns the 
    * return of getHighTemp.
    *
    * @param highIn will be compared to return of getLowTemp.
    * @return parameter if higher than value of getHighTemp, otherwise
    * returns getHighTemp.
    */
   public int higherMaximum(int highIn) {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
   /**
    * Returns string represetation of temperatures array and the 
    * highest and lowest temperatures from the methods.
    *
    * @return string representation of Temperatures.
    */
   public String toString() {
      return "\tTemperatures: " + temperatures
            + "\n\tLow: " + getLowTemp()
            + "\n\tHigh: " + getHighTemp();
   }
}