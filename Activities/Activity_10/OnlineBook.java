/**
 * Inherits from OnlineTextItem and represents a book item.
 * 
 * Activity 10
 * @author Mary Mitchell COMP1210-003
 * @version 11-06-2020
 */
public class OnlineBook extends OnlineTextItem {
   // fields
   protected String author;
   
   // constructor
   /**
    * Accepts parameters for name and price. Sets the fields
    * and author to "Author Not Listed".
    *
    * @param nameIn The name of the item.
    * @param priceIn The price of the item.
    */
   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }
   /**
    * Accepts parameter for the author and then sets the field 
    * to the parameter.
    *
    * @param authorIn The author of the text.
    */
   public void setAuthor(String authorIn) {
      author = authorIn;
   }
   /**
    * Returns string representation of the item.
    * 
    * @return The name, author, and cost of item as a string.
    */
   public String toString() {
      return name + " - " + author + ": $" + super.calculateCost();
   }
}