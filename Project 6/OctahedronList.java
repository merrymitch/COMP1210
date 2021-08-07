import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Program to store name of the list and an ArrayList
 * of Octahedron objects. Uses input to do calculations and editing
 * on the objects and the list.
 *
 * Project 6
 * @author Mary Mitchell COMP1210-003
 * @version 10-02-2020
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
   /**
    * Returns the ArrayList(listOcta).
    *
    * @return the ArrayList listOcta.
    */
   public ArrayList<Octahedron> getList() {
      return listOcta;
   }
   /**
    * Accepts a string parameter for the file name. Uses file name to 
    * find file and add its information to an array list and create 
    * OctahedronList objects.
    *
    * @param fileNameIn input for the file to be read.
    * @return oL - OctahedronList object from file.
    * @throws FileNotFoundException if the file cannot be found.
    */ 
   public OctahedronList readFile(String fileNameIn) 
                                  throws FileNotFoundException {
      Scanner scanFile = new Scanner(new File(fileNameIn));
      ArrayList<Octahedron> myList = new ArrayList<Octahedron>();
      String oListName = "";
      String labelRead, colorRead;
      double edgeRead;
      nameList = scanFile.nextLine();
      while (scanFile.hasNext()) {
         labelRead = scanFile.nextLine();
         colorRead = scanFile.nextLine();
         edgeRead = Double.parseDouble(scanFile.nextLine());
         Octahedron o = new Octahedron(labelRead, colorRead, edgeRead);
         myList.add(o);
      }
      OctahedronList oL = new OctahedronList(nameList, myList);
      return oL;                             
   }
   /**
    * Accepts parameters for label, color, and edge. Uses the parameters
    * to create new Octahedron object and add it to the arraylist.
    *
    * @param labelIn represents label of the octahedron.
    * @param colorIn represents color of octahedron.
    * @param edgeIn represents edge of octahedron.
    */
   public void addOctahedron(String labelIn, String colorIn, 
                             double edgeIn) {
      Octahedron o = new Octahedron(labelIn, colorIn, edgeIn);
      listOcta.add(o);
   }
   /**
    * Accepts a parameter for label and uses it to find 
    * the corresponding octahedron in the list.
    * 
    * @param labelIn used to find an octahedron in the list.
    * @return the Octahedron found, if none found return null.
    */
   public Octahedron findOctahedron(String labelIn) {
      int index = -1;
      for (Octahedron o : listOcta) {
         if (o.getLabel().equalsIgnoreCase(labelIn)) {
            index = listOcta.indexOf(o);
         }
         if (index != -1) {
            break;
         }
      }
      if (index == -1) {
         return null;
      }
      else {
         return listOcta.get(index);
      }
   }
   /**
    * Accepts a parameter for label and uses it to find
    * the corresponding octahedron and delete it from the list.
    *
    * @param labelIn used to find an octahedron in the list.
    * @return the Octahedron deleted, if not found return null.
    */
   public Octahedron deleteOctahedron(String labelIn) {
      int index = -1;
      for (Octahedron o : listOcta) {
         if (o.getLabel().equalsIgnoreCase(labelIn)) {
            index = listOcta.indexOf(o);
         }
         if (index != -1) {
            break;
         }
      }
      if (index == -1) {
         return null;
      }
      else {
         Octahedron deltOct = listOcta.get(index);
         listOcta.remove(index);
         return deltOct;
      }
   }
   /**
    * Accepts parameters for label, color, and edge and uses the
    * label to find corresponding octahedron. Once found the color
    * and edge is edited.
    *
    * @param labelIn label to find octahedron.
    * @param colorIn color to be edited into object.
    * @param edgeIn edge to be edited into the object.
    * @return the edited Octehedron, if not found return null.
    */
   public Octahedron editOctahedron(String labelIn, String colorIn,
                                    double edgeIn) {
      
      int index = -1;
      for (Octahedron o : listOcta) {
         if (o.getLabel().equalsIgnoreCase(labelIn)) {
            index = listOcta.indexOf(o);
         }
         if (index != -1) {
            break;
         }
      }
      if (index == -1) {
         return null;
      }
      else {
         listOcta.get(index).setColor(colorIn);
         listOcta.get(index).setEdge(edgeIn);
         return listOcta.get(index);
      }                                  
   }
}