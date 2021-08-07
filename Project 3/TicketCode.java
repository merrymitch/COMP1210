import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;
/**
 * Program to read coded input about a ticket and print its 
 * information and a random prize number.
 *
 * Project 3
 * @author Mary Mitchell
 * @version 09-11-2020
 */
public class TicketCode {
  /**
   * Reads coded input from the user and converts it to 
   * a readable display of information and calculates the 
   * cost of the ticket.
   * Then it generates a random prize number.
   *
   * @param args Command line arguments - not used.
   */
   public static void main(String[] args) {
     // user input for the coded ticket
      Scanner userInput = new Scanner(System.in);
      String ticketCode = "";
      System.out.print("Enter ticket code: ");
      ticketCode = userInput.nextLine().trim();
               
      // if code is under 26 characters it is invalid
      if (ticketCode.length() < 26) {
         System.out.println();
         System.out.println("Invalid ticket code.");
         System.out.println("Ticket code must have at least 26 characters.");
      }
      else { //if input is valid, prints all ticket information
        
         // ticket code is divided into categories
      
         // description 
         String description = ticketCode.substring(25, ticketCode.length());
      
         // date
         String month = ticketCode.substring(11, 13);
         String day = ticketCode.substring(13, 15);
         String year = ticketCode.substring(15, 19);
      
         // time
         String timeHour = ticketCode.substring(7, 9);
         String timeMinute = ticketCode.substring(9, 11);
      
         // where the seat is located
         String section = ticketCode.substring(19, 21);
         String row = ticketCode.substring(21, 23);
         String seat = ticketCode.substring(23, 25);
      
         // the price, discount, cost of ticket
         String stringPrice = ticketCode.substring(0, 3) + "." 
            + ticketCode.substring(3, 5);
         double price = Double.parseDouble(stringPrice);
         DecimalFormat moneyfmt = new DecimalFormat("$#,##0.00");
         String stringDiscount = "." + ticketCode.substring(5, 7);
         double discount = Double.parseDouble(stringDiscount);
         DecimalFormat discountfmt = new DecimalFormat("0%");
         double cost = price - (price * discount);
      
         // generates random prize number from 1-999
         Random generator = new Random();
         int prizeNum = generator.nextInt(999) + 1;
         DecimalFormat prizefmt = new DecimalFormat("000");
      
         System.out.println();
         System.out.println("Description: " + description
            + "   Date: " + month + "/" + day + "/" + year
            + "   Time: " + timeHour + ":" + timeMinute);
         System.out.println("Section: " + section 
            + "   Row: " + row 
            + "   Seat: " + seat);
         System.out.println("Price: " + moneyfmt.format(price)
            + "   Discount: " + discountfmt.format(discount)
            + "   Cost: " + moneyfmt.format(cost));
         System.out.println("Prize Number: " + prizefmt.format(prizeNum));      
      }
   }
}
