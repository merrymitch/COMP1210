import java.util.Scanner;
import java.util.ArrayList;
/** 
 * Program that accepts input temperatures into a list and determines
 * the highest and lowest temperatures. Then displays the information.
 *
 * Activity 6
 * @author Mary Mitchell COMP1210-003
 * @version 09-28-2020
 */
public class TemperatureInfo {
   /**
    * Accepts user input of temperature values and puts them in an 
    * ArrayList. Then uses the Temperatures class methods to determine
    * the highest and lowest temperature and print the information.
    *
    * @param args Command line arguments - not used.
    */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      ArrayList<Integer> tempsList = new ArrayList<Integer>();
      String tempInput = "";
      do { 
         System.out.print("Enter a temperature (or nothing to end list): ");
         tempInput = userInput.nextLine().trim();
         if (!tempInput.equals("")) {
            tempsList.add(Integer.parseInt(tempInput));
         }
      } while (!tempInput.equals(""));
      Temperatures temps = new Temperatures(tempsList);
      char choice = 'E';
      do {
         System.out.print("Enter choice - [L]ow temp, [H]igh temp, " 
            + "[P]rint, [E]nd: ");
         choice = userInput.nextLine().toUpperCase().charAt(0);
         switch (choice) {
            case 'L':
               System.out.println("\tLow is " + temps.getLowTemp());
               break;
            case 'H':
               System.out.println("\tHigh is " + temps.getHighTemp());
               break;
            case 'P':
               System.out.println(temps);
               break;
            case 'E':
               System.out.println("\tDone");
               break;
            default:
               System.out.println("\tInvalid choice!");
         }
      } while (choice != 'E');
   }
}