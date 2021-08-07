import java.util.Comparator;
/**
 * Program to compare monthly cost of DB objects.
 *
 * Project 11
 * @author Mary Mitchell COMP1210-003
 * @version 11-17-2020
 */
public class MonthlyCostComparator implements Comparator<DB> {
   /**
    * Method to compare base cost of DB objects.
    *
    * @param db1 The first DB object.
    * @param db2 The second DB object.
    * @return An int based on comparison.
    */
   public int compare(DB db1, DB db2) {
      if (db1.monthlyCost() > db2.monthlyCost()) {
         return -1;
      }
      else if (db1.monthlyCost() < db2.monthlyCost()) {
         return 1;
      }
      else {
         return 0;
      }
   }
}