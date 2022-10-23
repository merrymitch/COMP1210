/**
 * Represents an online text item that users can buy. Represents
 * a number of items so it is an abstract class.
 *
 * Activity 9
 * @author Mary Mitchell COMP1210-003
 * @version 11-03-2020
 */
public abstract class OnlineTextItem extends InventoryItem {
   // constructor
   /**
    * Accepts two parameters. Calls constructor of InventoryItem.
    *
    * @param nameIn The name of the item.
    * @param priceIn The price of the item.
    */
   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn);
   }
   // methods
   /**
    * Only returns the price of the item. These items are not taxed
    * so the method overrides calculateCost and just returns price.
    *
    * @return The price of the item.
    */
   public double calculateCost() {
      return price;
   }
}