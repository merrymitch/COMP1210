/**
 * Electronic text taht keeps track of word count and everything
 * done by OnlineTextItem and InventoryItem.
 *
 * Activity 10
 * @author Mary Mitchell COMP1210-003
 * @version 11-06-2020
 */
public class OnlineArticle extends OnlineTextItem {
   // fields
   private int wordCount;
   
   // constructor
   /**
    * Accepts parameter for name and price. Calls constructor of 
    * parent class and sets wordCount to zero.
    *
    * @param nameIn The name of the item.
    * @param priceIn The price of the item.
    */
   public OnlineArticle(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      wordCount = 0;
   }
   /**
    * Accepts parameter for word count and set the field to the 
    * parameter.
    *
    * @param wordCountIn The word count of the article.
    */
   public void setWordCount(int wordCountIn) {
      wordCount = wordCountIn;
   }
}