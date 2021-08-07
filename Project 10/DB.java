import java.text.DecimalFormat;
/**
 * Abstract class that describes a DB and provides methods to
 * access its descriptive data.
 *
 * Project 10
 * @author Mary Mitchell COMP1210-003
 * @version 11-12-2020
 */
public abstract class DB implements Comparable<DB> {
   // Fields
   // ***Instance Varibles***
   protected String name;
   protected double baseCost;
   protected double dbStorage;
   // ***Class Variable***
   protected static int count = 0;
   
   // Constructor
   /**
    * Accepts three parameters for name, base cost, and storage.
    * Sets the fields and increments count.
    *
    * @param nameIn The name of the database.
    * @param baseCostIn The base cost of the database.
    * @param dbStorageIn The amount of storage in terabytes.
    */
   public DB(String nameIn, double baseCostIn, double dbStorageIn) {
      name = nameIn;
      baseCost = baseCostIn;
      dbStorage = dbStorageIn;
      count++;
   }
   
   // Methods
   /**
    * Accepts no parameters and returns the String name.
    *
    * @return The name of the database.
    */
   public String getName() {
      return name;
   }
   /**
    * Accepts a String parameter for name. Sets the field.
    *
    * @param nameIn The name of the database.
    */
   public void setName(String nameIn) {
      name = nameIn;
   }
   /**
    * Accepts no parameters and returns the double base cost.
    *
    * @return The base cost of the database.
    */
   public double getBaseCost() {
      return baseCost;
   }
   /**
    * Accepts parameter for base cost. Sets the field.
    *
    * @param baseCostIn The base cost of the database.
    */
   public void setBaseCost(double baseCostIn) {
      baseCost = baseCostIn;
   }
   /**
    * Accepts no parameters and returns the double DB storage.
    *
    * @return The DB storage in terabytes.
    */
   public double getDbStorage() {
      return dbStorage;
   }
   /**
    * Accepts parameter for DB storage. Sets the field.
    *
    * @param dbStorageIn The DB storage in terabytes.
    */
   public void setDbStorage(double dbStorageIn) {
      dbStorage = dbStorageIn;
   }
   /**
    * Accepts no parameters and returns and int for count.
    *
    * @return The count of databases.
    */ 
   public static int getCount() {
      return count;
   }
   /**
    * Accepts no parameters and resets the count to zero.
    */
   public static void resetCount() {
      count = 0;
   }
   /**
    * Accepts no paramets and returns a string describing DB object.
    *
    * @return A string representing a DB object.
    */
   public String toString() {
      DecimalFormat fmt1 = new DecimalFormat("$#,##0.00");
      DecimalFormat fmt2 = new DecimalFormat("0.000");
      String output = name + " (" + this.getClass() + ") Monthly Cost: "
         + fmt1.format(monthlyCost()) + "\n" + "Storage: " 
         + fmt2.format(getDbStorage()) + " TB" + "\n" + "Base Cost: "
         + fmt1.format(getBaseCost());
      return output;
   }
   /**
    * Abstract method with no parameters and returns the monthly cost of DB.
    *
    * @return A double representing the monthly cost of the DB.
    */
   public abstract double monthlyCost();
   /**
    * Compares a database object and returns an int indicating
    * the results of the comparison.
    *
    * @param dbIn The database object to be compared.
    * @return An int based on the comparison.
    */
   public int compareTo(DB dbIn) {
      return name.toLowerCase().compareTo(dbIn.getName().toLowerCase());
   }

}