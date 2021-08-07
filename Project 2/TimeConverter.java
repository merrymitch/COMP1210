import java.util.Scanner;
/**
* Program to calculate and display time measurements from input.
*
* Project 2
* @author Mary Mitchell
* @version 09-04-2020
*/
public class TimeConverter {
   /**
    * Uses input of seconds to convert to other time measurements.
    *
    * @param args Command line arguments - not used.
    */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      int rawTime = 0;
      int days = 0;
      int hours = 0;
      int minutes = 0;
      int seconds = 0;
      //Prompt user for time measurement in seconds
      System.out.print("Enter the raw time measurement in seconds: ");
      rawTime = userInput.nextInt();
      if (rawTime < 0) {
         System.out.print("Measurement must be non-negative!");
      }
      else {
         //Convert measurement into days, hours, minutes, seconds
         System.out.println();
         System.out.println("Measurement by combined days, "
            + "hours, minutes, seconds: ");
         //Calculate days
         days = rawTime / (24 * 60 * 60);
         System.out.println("\tdays: " + days);
         //Calculate hours
         hours = (rawTime % (24 * 60 * 60)) / (60 * 60);
         System.out.println("\thours: " + hours);
         //Calculate minutes
         minutes = ((rawTime % (24 * 60 * 60)) % (60 * 60)) / 60;
         System.out.println("\tminutes: " + minutes);
         //Calculate seconds
         seconds = ((rawTime % (24 * 60 * 60)) % (60 * 60)) % 60;
         System.out.println("\tseconds: " + seconds);
         //Print all the calculations
         System.out.println();
         System.out.println(rawTime + " seconds = " + days + " days, " 
            + hours + " hours, " + minutes + " minutes, " 
            + seconds + " seconds");
      }
   }
}