import java.text.DecimalFormat;
/**
 * Defines a Distributed database derived from DB class.
 *
 * Project 10
 * @author Mary Mitchell COMP1210-003
 * @version 11-12-2020
 */
public class DistributedDB extends DB {
   // Fields
   // ***Instance Variables***
   protected int userNumber;
   protected double costPerUser;
   // ***Constant***
   /** Constant for the cost factor. **/
   public static final double COST_FACTOR = 1.1;
   
   // Constructor
   /** 
    * Accepts the three parameters from DB and also two for userNumber 
    * and userCost.
    *
    * @param nameIn The name of the database.
    * @param baseCostIn The base cost of the database.
    * @param dbStorageIn The storage in terabytes.
    * @param userNumberIn The number of users.
    * @param costPerUserIn The cost per user.
    */
   public DistributedDB(String nameIn, double baseCostIn, double dbStorageIn,
                        int userNumberIn, double costPerUserIn) {
      super(nameIn, baseCostIn, dbStorageIn);
      userNumber = userNumberIn;
      costPerUser = costPerUserIn;                   
   }  
   
   // Methods
   /**
    * Accepts no parameters and returns the number of users.
    *
    * @return The number of users.
    */ 
   public int getNumberOfUsers() {
      return userNumber;
   }   
   /**
    * Accepts parameter for number of users. Sets the field.
    *
    * @param userNumberIn The number of users.
    */   
   public void setNumberOfUsers(int userNumberIn) {
      userNumber = userNumberIn;
   }  
   /**
    * Accepts no parameters and returns the cost per user.
    *
    * @return The cost per user.
    */         
   public double getCostPerUser() {
      return costPerUser;
   }  
   /**
    * Accepts a paramter for cost per user. Sets the field.
    *
    * @param costPerUserIn The cost per user.
    */
   public void setCostPerUser(double costPerUserIn) {
      costPerUser = costPerUserIn;
   }
   /**
    * Accepts no parameters and returns the calculated user cost.
    *
    * @return The calculated user cost.
    */
   public double userCost() {
      double userCost;
      userCost = userNumber * costPerUser;
      return userCost;
   }
   /**
    * Accepts no parameters and returns the cost factor.
    * 
    * @return The cost factor.
    */
   public double getCostFactor() {
      return COST_FACTOR;
   } 
   /**
    * Accepts no parameters and returns double for monthly cost.
    *
    * @return The monthly cost of distributed database.
    */
   public double monthlyCost() {
      double monthlyCost = baseCost + userCost() * DistributedDB.COST_FACTOR;
      return monthlyCost;
   }
   /**
    * Returns a String representation of DistributedDB object.
    *
    * @return a String representation of DistributedDB object.
    */
   public String toString() {
      DecimalFormat fmt4 = new DecimalFormat("$#,##0.00");
      String dDbOutput = super.toString();
      dDbOutput += "\n" + "Number of Users: " + getNumberOfUsers() + "\n"
         + "Cost per User: " + fmt4.format(getCostPerUser()) + "\n"
         + "User Cost: " + fmt4.format(userCost()) + "\n"
         + "Cost Factor: " + getCostFactor();
      return dDbOutput;
   }
                
}