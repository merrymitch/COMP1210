/**
 * Class to hold an arary of InventoryItem objects.
 *
 * Activity 10
 * @author Mary Mitchell COMP1210-003
 * @version 11-06-2020
 */
public class ItemsList {
   // fields
   private InventoryItem[] inventory;
   private int count;
   
   // constructor
   /**
    * Accepts no parameters and instantiates the inventory array
    * to length twenty and increments count.
    */
   public ItemsList() {
      inventory = new InventoryItem[20];
      count = 0;
   }
   
   // methods
   /**
    * Adds an item to the inventory array. 
    *
    * @param itemIn The item to be added to the array.
    */
   public void addItem(InventoryItem itemIn) {
      inventory[count] = itemIn;
      count++;
   }
   /**
    * Accepts surcharge for electronics items and returns the total 
    * price of all the items.
    *
    * @param electronicsSurcharge The surcharge for electronics items.
    * @return The total price of all the items.
    */
   public double calculateTotal(double electronicsSurcharge) {
      double total = 0;
      for (int i = 0; i < count; i++) {
         if (inventory[i] instanceof ElectronicsItem) {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         } 
         else {
            total += inventory[i].calculateCost();
         }
      }
      return total;
   } 
   /**
    * Returns string representation of the itemsList.
    * 
    * @return string representation of the itemList.
    */
   public String toString() {
      String output = "All inventory:\n\n";
      for (int i = 0; i < count; i++) {
         output += inventory[i] + "\n";
      }
      return output;
   }
}