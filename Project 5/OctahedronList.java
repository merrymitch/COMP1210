import java.util.ArrayList;
import java.text.DecimalFormat;
/**
 * Program to store name of the list and an ArrayList
 * of Octahedron objects. Also calculates total surface area and
 * volume, as well as average surface area, volume, ratio.
 *
 * Project 5
 * @author Mary Mitchell COMP1210-003
 * @version 09-24-2020
 */
public class OctahedronList {
   // Fields
   private String nameList;
   private ArrayList<Octahedron> listOcta = new ArrayList<Octahedron>();
   
   // Constructor
   /**
    * Accepts parameters for a string and an array. Assigns parameters
    * to instance variables.
    *
    * @param nameListIn name of the list of octahedron objects.
    * @param listOctaIn name of the array to hold octahedrons.
    */
   public OctahedronList(String nameListIn, ArrayList<Octahedron>
      listOctaIn) {
      nameList = nameListIn;
      listOcta = listOctaIn;
   } 
   
   // Methods
   /**
    * Returns a string representing name of the list.
    * 
    * @return name of list.
    */
   public String getName() {
      return nameList;
   }
   /**
    * If there are no objects the method returns zero.
    * Otherwise the method returns the number of objects in the list.
    *
    * @return the size of the list.
    */
   public int numberOfOctahedrons() {
      if (listOcta.size() == 0) {
         return 0;
      }
      else {
         return listOcta.size();
      }
   }
   /**
    * If there are no objects the method returns zero.
    * Otherwise uses a loop to calculate the total surface area
    * of the octahedron objects.
    *
    * @return the total surface area.
    */
   public double totalSurfaceArea() {
      int index = 0;
      double totalSurfArea = 0;
      if (listOcta.size() == 0) {
         return 0;
      }
      else {
         while (index < listOcta.size()) {
            totalSurfArea += listOcta.get(index).surfaceArea();
            index++;
         }
         return totalSurfArea;
      }
   }
   /**
    * If there are no objects the method returns zero.
    * Otherwise uses a loop to calculate the total volume
    * of the octahedron objects.
    * 
    * @return total volume.
    */
   public double totalVolume() {
      int index = 0;
      double totalVol = 0;
      if (listOcta.size() == 0) {
         return 0;
      }
      else {
         while (index < listOcta.size()) {
            totalVol += listOcta.get(index).volume();
            index++;
         }
         return totalVol;
      }
   }
   /**
    * If there are no objects the method returns zero.
    * Otherwise uses a loop to calculate the average surface area
    * of the octahedron objects.
    *
    * @return the average surface area.
    */
   public double averageSurfaceArea() {
      int index = 0;
      double avgSurfArea = 0;
      if (listOcta.size() == 0) {
         return 0;
      }
      else {
         while (index < listOcta.size()) {
            avgSurfArea += (listOcta.get(index).surfaceArea())
               / (listOcta.size());
            index++;
         }
         return avgSurfArea;
      }
   }
   /**
    * If there are no objects the method returns zero. 
    * Otherwise uses a loop to calculate the average volume 
    * of the octahedron objects.
    *
    * @return the average volume.
    */
   public double averageVolume() {
      int index = 0;
      double avgVolume = 0;
      if (listOcta.size() == 0) {
         return 0;
      }
      else {
         while (index < listOcta.size()) {
            avgVolume += (listOcta.get(index).volume())
               / (listOcta.size());
            index++;
         }
         return avgVolume;
      }
   }
   /**
    * If there are no objects the method returns zero.
    * Otherwise uses a loop to calculate the average surface area
    * to volume ratio of the octahedron objects.
    *
    * @return the average surface area to volume ratio.
    */
   public double averageSurfaceToVolumeRatio() {
      int index = 0;
      double avgSurfToVol = 0;
      if (listOcta.size() == 0) {
         return 0;
      }
      else {
         while (index < listOcta.size()) {
            avgSurfToVol += (listOcta.get(index).surfaceToVolumeRatio())
               / listOcta.size();
            index++;
         }
         return avgSurfToVol;
      }
   }
   /**
    * Returns a string containing the name of the list.
    * Additionally, uses a loop to return each octahedron in the array.
    *
    * @return the name of the list and the objects in the array.
    */
   public String toString() {
      int index = 0;
      String output = nameList + "\n";
      while (index < listOcta.size()) {
         output += "\n" + listOcta.get(index).toString() + "\n";
         index++;
      }
      return output;
   }
   /** 
    * Returns a string that displays all the information calculated
    * by the octahedronlist class methods. Formats the calculations.
    *
    * @return the summary of information.
    */
   public String summaryInfo() {
      DecimalFormat fmt1 = new DecimalFormat("#,##0.0##");
      String output = "----- Summary for " + nameList + " -----\n"
         + "Number of Octahedrons: " + listOcta.size() + "\n"
         + "Total Surface Area: " + fmt1.format(totalSurfaceArea()) + "\n"
         + "Total Volume: " + fmt1.format(totalVolume()) + "\n"
         + "Average Surface Area: " + fmt1.format(averageSurfaceArea()) + "\n"
         + "Average Volume: " + fmt1.format(averageVolume()) + "\n"
         + "Average Surface/Volume Ratio: " 
         + fmt1.format(averageSurfaceToVolumeRatio());
      return output;
   }
   
}