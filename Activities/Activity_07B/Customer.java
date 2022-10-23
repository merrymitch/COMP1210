/** 
 * Program to store customer information, edit it, and return it.
 *
 * Activity 7B
 * @author Mary Mitchell COMP1210-003
 * @version 10-20-2020
 */
public class Customer implements Comparable<Customer> {
   // Instance Variables
   private String name;
   private String location;
   private double balance;
   
   // Constructor
   /**
    * Accepts parameter for customer name. Sets name, location, and 
    * balance.
    * @param nameIn set name field.
    */
   public Customer(String nameIn) {
      name = nameIn;
      location = "";
      balance = 0;
   }
   
   // Methods
   /** 
    * Sets the location field.
    *
    * @param locationIn set location field.
    */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   /**
    * Sets the location with two strings.
    *
    * @param city sets the city.
    * @param state sets the state.
    */
   public void setLocation(String city, String state) {
      location = city + ", " + state;
   }
   /**
    * Adds an amount to the balance.
    *
    * @param amount to be added.
    */
   public void changeBalance(double amount) {
      balance += amount;
   }
   /**
    * @return location of customer.
    */
   public String getLocation() {
      return location;
   }
   /**
    * @return balance of customer.
    */ 
   public double getBalance() {
      return balance;
   }
   /** 
    * @return string representation of customer object.
    */
   public String toString() {
      String output = name + "\n" + getLocation()
         + "\n$" + getBalance();
      return output;
   }
   /**
    * Compares object of this class to another object to another
    * compatible object indicated by the generic parameter.
    *
    * @param obj to be used in comparison.
    * @return 0, -1, or 1 based on comparison.
    */
   public int compareTo(Customer obj) {
      if (Math.abs(this.balance - obj.getBalance()) < 0.000001) {
         return 0;
      }
      else if (this.balance < obj.getBalance()) {
         return -1;
      }
      else {
         return 1;
      }
   }
}