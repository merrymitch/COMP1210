import java.text.DecimalFormat;
/**
 * Defines a Centralized database derived from DB class.
 *
 * Project 10
 * @author Mary Mitchell COMP1210-003
 * @version 11-12-2020
 */
public class CentralizedDB extends DB {
   // Fields
   // ***Instance Variables*** 
   private double license;
   
   // Constructor
   /**
    * Accepts the three parameters from DB and also one for license.
    *
    * @param nameIn The name of the database.
    * @param baseCostIn The base cost of the database.
    * @param dbStorageIn The storage in terabytes.
    * @param licenseIn The license of the database.
    */
   public CentralizedDB(String nameIn, double baseCostIn, double dbStorageIn,
                        double licenseIn) {
      super(nameIn, baseCostIn, dbStorageIn);
      license = licenseIn;                   
   }
   
   // Methods
   /**
    * Accepts no parameters and returns double license.
    *
    * @return The license of the database.
    */
   public double getLicense() {
      return license;
   }
   /**
    * Accepts parameter for license and sets the field.
    *
    * @param licenseIn The license of the database.
    */
   public void setLicense(double licenseIn) {
      license = licenseIn;
   }
   /**
    * Accepts no parameters and returns double for monthly cost.
    *
    * @return The monthly cost of centralized database.
    */
   public double monthlyCost() {
      double monthlyCost;
      monthlyCost = baseCost + license;
      return monthlyCost;
   }
   /**
    * Returns a String representation of CentralizedDB object.
    *
    * @return A String representation of CentralizedDB object.
    */
   public String toString() {
      DecimalFormat fmt3 = new DecimalFormat("$#,##0.00");
      String cDbOutput = super.toString();
      cDbOutput += "\n" + "License: " + fmt3.format(license);
      return cDbOutput;
   }
   
}