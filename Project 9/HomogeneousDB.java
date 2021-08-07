/** 
 * Defines a Homogeneous database derived from DistributedDB class.
 *
 * Project 9
 * @author Mary Mitchell COMP1210-003
 * @version 11-05-2020
 */
public class HomogeneousDB extends DistributedDB {
   // Fields 
   // ***Constant***
   /** Constant for the cost factor.**/
   public static final double COST_FACTOR = 1.2;
   
   // Constructor
   /**
    * Accepts all five parameters from parent constructor.
    * 
    * @param nameIn The name of the database.
    * @param baseCostIn The base cost of the database.
    * @param dbStorageIn The storage in terabytes.
    * @param userNumberIn The number of users.
    * @param costPerUserIn The cost per user.
    */
   public HomogeneousDB(String nameIn, double baseCostIn, double dbStorageIn,
                        int userNumberIn, double costPerUserIn) {
      super(nameIn, baseCostIn, dbStorageIn, userNumberIn, 
            costPerUserIn);                  
   }
   
   // Methods
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
    * @return The monthly cost.
    */
   public double monthlyCost() {
      double monthlyCost = baseCost + userCost() * HomogeneousDB.COST_FACTOR;
      return monthlyCost;
   }
   
}