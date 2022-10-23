/** 
 * Program that represents an inventory item in a store.
 *
 * Activity 10
 * @author Mary Mitchell COMP1210-003
 * @version 11-06-2020
 */
public class InventoryItem {
   // fields
   protected String name;
   protected double price;
   private static double taxRate = 0;
   
   // constructor
   /**
    * Accepts two parameters for name and price of item.
    * Set the fields to parameters.
    *
    * @param nameIn The name of the item.
    * @param priceIn The price of the item.
    */
   public InventoryItem(String nameIn, double priceIn) {
      name = nameIn;
      price = priceIn;
   }
   
   // methods
   /** 
    * Returns the name of the item.
    * 
    * @return The name of the item.
    */
   public String getName() {
      return name;
   }
   /**
    * Calculates the cost of the item with price and tax.
    *
    * @return The cost calculated.
    */
   public double calculateCost() {
      return price * (1 + taxRate);
   }
   /**
    * Static method to set the tax rate. Accepts parameter for
    * tax rate and sets the tax rate field.
    *
    * @param taxRateIn The tax rate to be set.
    */
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;
   }
   /**
    * Returns a string representation of the item with its 
    * name and cost.
    * 
    * @return A representation of the inventory item.
    */
   public String toString() {
      return name + ": $" + calculateCost();
   }
}