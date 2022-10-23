/**
 * Program to store and set user information.
 *
 * Activity 4
 * @author Mary Mitchell COMP1210 - 003
 * @version 09-15-2020
 */
public class UserInfo {
   // instance variables
   private String firstName;
   private String lastName;
   private String location;
   private int age;
   private int status;
   private static final int OFFLINE = 0, ONLINE = 1;
   
   // constructor
   /**
    * Takes two parameters of input, the user's first and last name.
    *
    * @param firstNameIn The first name of the user.
    * @param lastNameIn The last name of the user.
    */
   public UserInfo(String firstNameIn, String lastNameIn) {
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   }
   
   // methods
   /**
    * Returns a String representation of the object,
    * including user name, location, age, and status.
    * Determines whether the user's status is Online or offline.
    *
    * @return String representation of user object.
    */
   public String toString() {
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE) {
         output += "Offline";
      }
      else {
         output += "Online";
      }
      return output;
   }
   /**
    * Sets the location of the user object.
    *
    * @param locationIn The location of the user.
    */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   /**
    * Determines if age is set and greater than zero.
    * Returns whether the age is set. 
    * 
    * @param ageIn Sets the age of the user.
    * @return Whether the age is set.
    */
   public boolean setAge(int ageIn) {
      boolean isSet = false;
      if (ageIn > 0) {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }
   /**
    * Returns the age of the user object.
    *
    * @return The age of the user object.
    */
   public int getAge() {
      return age;
   }
   /**
    * Returns the location of the user object.
    *
    * @return the location of the user object.
    */
   public String getLocation() {
      return location;
   }
   /**
    * Set the user object to offline.
    */
   public void logOff() {
      status = OFFLINE;
   }
   /**
    * Sets the user object to online.
    */
   public void logOn() {
      status = ONLINE;
   }
   
}