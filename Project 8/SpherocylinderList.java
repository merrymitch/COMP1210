import java.text.DecimalFormat;
/**
 * Class to store name of list and an array of Spherocylinder 
 * objects. Includes methods to return information of list and objects
 * as well as perform calculations on the objects.
 *
 * Project 8
 * @author Mary Mitchell COMP1210-003
 * @version 10-29-2020
 */ 
public class SpherocylinderList {
   // ***Fields***
   private String listName = "";
   private Spherocylinder[] spheros;
   private int numSpheros = 0;
   
   // ***Constructor***
   /**
    * Accepts parameters for list name, array of spherocylinders,
    * and the number of spherocylinders. Then sets the fields.
    *
    * @param listNameIn The name of the list.
    * @param spherosIn The array of spherocylinder objects.
    * @param numSpherosIn The number of spherocylinders.
    */
   public SpherocylinderList(String listNameIn, Spherocylinder[] spherosIn,
                             int numSpherosIn) {
      listName = listNameIn;
      spheros = spherosIn;
      numSpheros = numSpherosIn;
   }
   
   // ***Methods***
   /**
    * Accepts no parameters and returns the name of list.
    *
    * @return The name of the list.
    */
   public String getName() {
      return listName;
   }
   /**
    * Accepts no parameters and returns the number of 
    * spherocylinders in the SpherocylinderList.
    * 
    * @return The number of spherocylinders.
    */
   public int numberOfSpherocylinders() {
      return numSpheros;
   }
   /**
    * Accepts no parameters and returns the total surface area 
    * for all spherocylinder objects in the list.
    * 
    * @return A double representing total surface area.
    */
   public double totalSurfaceArea() {
      int index = 0;
      double totalSA = 0;
      if (numSpheros == 0) {
         return 0;
      }
      else {
         while (index < numSpheros) {
            totalSA += spheros[index].surfaceArea();
            index++;
         }
         return totalSA;
      }
   }
   /**
    * Accepts no parameters and returns the total volume 
    * for all spherocylinder objects in the list.
    *
    * @return A double representing total volume.
    */
   public double totalVolume() {
      int index = 0;
      double totalVol = 0;
      if (numSpheros == 0) {
         return 0;
      }
      else {
         while (index < numSpheros) {
            totalVol += spheros[index].volume();
            index++;
         }
         return totalVol;
      }
   }
   /** 
    * Accepts no parameters and returns the average surface
    * area of all spherocylinders in the list.
    *
    * @return A double representing the average surface area.
    */
   public double averageSurfaceArea() {
      int index = 0;
      double avgSurfArea = 0;
      if (numSpheros == 0) {
         return 0;
      }
      else {
         while (index < numSpheros) {
            avgSurfArea += (spheros[index].surfaceArea())
               / (numSpheros);
            index++;
         }
         return avgSurfArea;
      }
   }
   /**
    * Accepts no parameters and returns the average volume
    * of all spherocylinders in the list.
    *
    * @return A double representing average volume.
    */
   public double averageVolume() {
      int index = 0;
      double avgVolume = 0;
      if (numSpheros == 0) {
         return 0;
      }
      else {
         while (index < numSpheros) {
            avgVolume += (spheros[index].volume())
               / (numSpheros);
            index++;
         }
         return avgVolume;
      }
   }
   /** 
    * Accepts no parameters and returns a string of summary
    * information on the Spherocylinder list.
    *
    * @return A string of information on spherocylinder list.
    */
   public String toString() {
      DecimalFormat fmt = new DecimalFormat("#,##0.0##");
      String output = "";
      output = "----- Summary for " + listName + " -----\n"
         + "Number of Spherocylinders: " + numSpheros + "\n"
         + "Total Surface Area: " + fmt.format(totalSurfaceArea()) + "\n"
         + "Total Volume: " + fmt.format(totalVolume()) + "\n"
         + "Average Surface Area: " + fmt.format(averageSurfaceArea()) + "\n"
         + "Average Volume: " + fmt.format(averageVolume());
      return output;
   }
   /**
    * Accepts no parameters and returns the array of 
    * spherocylinders.
    *
    * @return An array of spherocylinders.
    */ 
   public Spherocylinder[] getList() {
      return spheros;
   }
   /**
    * Accepts three parameters for label, radius, and height. Creates new 
    * spherocylinder object. Returns nothing.
    *
    * @param labelIn The label of new spherocylinder.
    * @param radiusIn The radius of new spherocylinder.
    * @param heightIn The height of new spherocylinder.
    */
   public void addSpherocylinder(String labelIn, double radiusIn,
                                 double heightIn) {
      Spherocylinder newSphero = new Spherocylinder(labelIn, radiusIn,
                                                    heightIn);
      spheros[numSpheros] = newSphero;
      numSpheros++;
   }
   /**
    * Accepts parameter for label and returns the corresponding 
    * spherocylinder object if found. 
    * 
    * @param labelIn The label of spherocylinder object.
    * @return The corresponding spherocylinder object, otherwise null.
    */
   public Spherocylinder findSpherocylinder(String labelIn) {
      Spherocylinder foundSphero = null;
      for (int i = 0; i < numSpheros; i++) {
         if (spheros[i].getLabel().equalsIgnoreCase(labelIn)) {
            foundSphero = spheros[i];
            break;
         }
      }
      return foundSphero;
   }
   /**
    * Accepts parameter for label and finds the corresponding 
    * spherocylinder object and deletes it.
    *
    * @param labelIn The label of spherocylinder object.
    * @return The spherocylinder object that is deleted, 
    * otherwise null.
    */
   public Spherocylinder deleteSpherocylinder(String labelIn) {
      Spherocylinder deleteSphero = null;
      for (int i = 0; i < numSpheros; i++) {
         if (spheros[i].getLabel().equalsIgnoreCase(labelIn)) {
            deleteSphero = spheros[i];
            for (int j = i; j <= numSpheros - 1; j++) {
               spheros[j] = spheros[j + 1];
            }
            spheros[numSpheros - 1] = null;
            numSpheros--;
            break;
         }
      }
      return deleteSphero;
   }
   /**
    * Accepts three parameters for label, radius, and height. Finds
    * the corresponding spherocylinder with the label and edits the 
    * radius and height.
    *
    * @param labelIn The label of spherocylinder.
    * @param radiusIn The new radius of spherocylinder.
    * @param heightIn The new height of spherocylinder.
    * @return True if object is found, otherwise false.
    */
   public boolean editSpherocylinder(String labelIn, double radiusIn,
                                     double heightIn) {
      Spherocylinder editSphero = null;
      for (int i = 0; i < numSpheros; i++) {
         if (spheros[i].getLabel().equalsIgnoreCase(labelIn)) {
            spheros[i].setRadius(radiusIn);
            spheros[i].setCylinderHeight(heightIn);
            editSphero = spheros[i];
            return true;
         }
      }
      return false;
   }
   /**
    * Accepts no parameters. Returns the spherocylinder with largest volume. 
    * If list is empty, returns null.
    *
    * @return Spherocylinder with largest volume, if empty return null.
    */
   public Spherocylinder findSpherocylinderWithLargestVolume() {
      Spherocylinder largestVol;
      if (numSpheros <= 0) {
         largestVol = null;
      }
      else {
         double comparison = spheros[0].volume();
         largestVol = spheros[0];
         for (int i = 0; i < numSpheros; i++) {
            if (spheros[i].volume() > comparison) {
               comparison = spheros[i].volume();
               largestVol = spheros[i];
            }
         }
      }
      return largestVol;
   }

}