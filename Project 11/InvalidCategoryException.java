/**
 * Program for DBList for exceptions of invalid categories.
 *
 * Project 11
 * @author Mary Mitchell COMP1210-003
 * @version 11-17-2020
 */
public class InvalidCategoryException extends Exception {
   /**
    * Constructor that excepts a string for category and invokes
    * super constructor with message.
    *
    * @param categoryIn The invalid category.
    */ 
   public InvalidCategoryException(String categoryIn) {
      super("For category: " + categoryIn);
   }
}