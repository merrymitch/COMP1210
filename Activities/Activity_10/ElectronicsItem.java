/**
 * Class that inherits from InventoryItem. Has the same characteristics
 * but takes into account shipping costs.
 * 
 * Activity 10
 * @author Mary Mitchell COMP1210-003
 * @version 11-06-2020
 */
public class ElectronicsItem extends InventoryItem {
   // fields
   protected double weight;
   /**
    * Constant variable for shipping cost.
    */ 
   public static final double SHIPPING_COST = 1.5;
   
   //constructor
   /**
    * Accepts three parameters for name, price, and weight. 
    * Sets the fields and invokes constructor for InventoryItem.
    *
    * @param nameIn The name of the item.
    * @param priceIn The price of the item.
    * @param weightIn The weight of the item.
    */ 
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
      super(nameIn, priceIn);
      weight = weightIn;
   }
   /**
    * Overrides the calculateCost method to take into account shipping.
    *
    * @return The cost with shipping included.
    */
   public double calculateCost() {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }
}