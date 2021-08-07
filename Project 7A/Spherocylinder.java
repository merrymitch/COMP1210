import java.text.DecimalFormat;
/**
 * Program to represent a Spherocylinder object.
 * Stores label, radius, and height to calculate 
 * different values for the object.
 *
 * Project 7A
 * @author Mary Mitchell COMP1210-003
 * @version 10-15-2020
 */
public class Spherocylinder {
   // ***Fields***
   // Instance Variables
   private String label = "";
   private double radius = 0;
   private double cylinderHeight = 0;
   // Class Variable
   private static int count = 0;
   
   // ***Constructor***
   /**
    * Accepts three parameters representing label, radius,
    * and height. Sets the fields. Increments class variable count.
    *
    * @param labelIn The label of the Spherocylinder.
    * @param radiusIn The radius of the Spherocylinder.
    * @param heightIn The height of the Spherocylinder.
    */
   public Spherocylinder(String labelIn, double radiusIn, double heightIn) {
      setLabel(labelIn);
      setRadius(radiusIn);
      setCylinderHeight(heightIn);
      count++;
   }
   
   // ***Methods***
   /**
    * Accepts no parameters and returns a string representing label.
    *
    * @return String representing label.
    */
   public String getLabel() {
      return label;
   }
   /**
    * Takes string parameter for label and returns true if 
    * parameter is not null. If true string is trimmed and set 
    * to label. If null method returns false and label not set.
    *
    * @param labelIn Sets the label field.
    * @return false if labelIn is null, otherwise return true.
    */
   public boolean setLabel(String labelIn) {
      boolean isLabelSet = false;
      if (labelIn != null) {
         label = labelIn.trim();
         isLabelSet = true;
         return isLabelSet;
      }
      else {
         return isLabelSet;
      }
   }
   /**
    * Accepts no parameters and returns a double representing radius.
    *
    * @return Double representing radius.
    */
   public double getRadius() {
      return radius;
   }
   /**
    * Takes double parameter for radius and returns true if 
    * parameter is non-negative. If true parameter is set 
    * to radius. If negative method returns false and radius not set.
    *
    * @param radiusIn Sets the radius field.
    * @return false if radiusIn is negative, otherwise return true.
    */
   public boolean setRadius(double radiusIn) {
      if (radiusIn >= 0) {
         radius = radiusIn;
         return true;
      }
      else {
         return false;
      }
   }
   /**
    * Accepts no parameters and returns a double representing height.
    *
    * @return Double representing height.
    */
   public double getCylinderHeight() {
      return cylinderHeight;
   }
   /**
    * Takes double parameter for height and returns true if 
    * parameter is non-negative. If true parameter is set 
    * to height. If negative method returns false and height not set.
    *
    * @param heightIn Sets the height field.
    * @return false if heightIn is negative, otherwise return true.
    */
   public boolean setCylinderHeight(double heightIn) {
      if (heightIn >= 0) {
         cylinderHeight = heightIn;
         return true;
      }
      else {
         return false;
      }
   }
   /**
    * Accepts no parameters and returns double for circumference.
    *
    * @return Double representing circumference.
    */ 
   public double circumference() {
      double circumference;
      circumference = 2 * (Math.PI) * radius;
      return circumference;
   }
   /**
    * Accepts no parameters and returns double for surface area.
    *
    * @return Double representing surface area.
    */
   public double surfaceArea() {
      double surfaceArea;
      surfaceArea = (2 * (Math.PI) * radius) * ((2 * radius) + cylinderHeight);
      return surfaceArea;
   }
   /** 
    * Accepts no parameters and returns double for volume.
    *
    * @return Double representing volume.
    */
   public double volume() {
      double volume;
      volume = (Math.PI * Math.pow(radius, 2)) * (4 * radius / 3 
               + cylinderHeight);
      return volume;
   }
   /**
    * @return string representation of Spherocylinder object.
    */
   public String toString() {
      DecimalFormat df1 = new DecimalFormat("#,##0.0##");
      String output = "Spherocylinder " + "\"" + label + "\"" + " with "
         + "radius " + radius + " and cylinder height " + cylinderHeight 
         + " has:" + "\n" + "\t";
      output += "circumference = " + df1.format(circumference())
         + " units" + "\n" + "\t";
      output += "surface area = " + df1.format(surfaceArea())
         + " square units" + "\n" + "\t";
      output += "volume = " + df1.format(volume())
         + " cubic units" + "\n";
      return output;
   }
   /** 
    * Static method that accepts no parameters and returns int 
    * representing count field.
    *
    * @return Int representing count field.
    */
   public static int getCount() {
      return count;
   }
   /**
    * Static method that accepts no parameters and sets count to zero.
    */
   public static void resetCount() {
      count = 0;
   }
   /**
    * Accepts parameter of type Object and returns false if parameter
    * is not a Spherocylinder. Otherwise cast to Shperocylinder
    * if it has same field values.
    *
    * @param obj Checked for equality to Spherocylinder.
    * @return false if not Spherocylinder.
    */
   public boolean equals(Object obj) {
      if (!(obj instanceof Spherocylinder)) {
         return false;
      }
      else {
         Spherocylinder d = (Spherocylinder) obj;
         return (label.equalsIgnoreCase(d.getLabel())
            && Math.abs(radius - d.getRadius()) < .000001
            && Math.abs(cylinderHeight - d.getCylinderHeight())
               < .000001);
      }
   }
   /** 
    * Accepts no parameters and returns int zero.
    *
    * @return zero of type int.
    */
   public int hashCode() {
      return 0;
   }
}