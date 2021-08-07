import java.text.DecimalFormat;
/**
 * Program that defines Octahedron objects by storing label, color,
 * and edge length, as well as calculating surface area, volume, and 
 * surface area to volume ratio.
 * 
 * Project 5
 * @author Mary Mitchell COMP1210-003
 * @version 09-24-2020
 */
public class Octahedron {
   // instance variables
   private String label = "";
   private String color = "";
   private double edge = 0;
   
   // constructor
   /**
    * Accepts three parameters, label, color, and edge.
    * 
    * @param labelIn The label of the octahedron.
    * @param colorIn The color of the octahedron.
    * @param edgeIn The length of the edge of the octahedron.
    */
   public Octahedron(String labelIn, String colorIn, double edgeIn) {
      setLabel(labelIn);
      setColor(colorIn);
      setEdge(edgeIn);
   }
   // methods
   /**
    * Returns the label of octahedron.
    * 
    * @return Returns label of octahedron.
    */
   public String getLabel() {
      return label;
   }
   /**
    * Accepts a string parameter for the label. 
    * If the string is valid the label is set to the trimmed String and
    * the boolean value returns true. If label is null, method returns false.
    *
    * @param labelIn sets label of octahedron if valid.
    * @return true if string is valid, otherwise returns false.
    */
   public boolean setLabel(String labelIn) {
      boolean isSetLabel = false;
      if (labelIn != null) {
         label = labelIn.trim();
         isSetLabel = true;
         return isSetLabel;
      }
      else {
         return isSetLabel;
      }
   }
   /**
    * Accepts no parameters and 
    * returns a String representing the color field.
    *
    * @return color of octahedron.
    */
   public String getColor() {
      return color;
   } 
   /**
    * Accepts string parameter for color.
    * If string is valid, color is set to the trimmed string and
    * returns true, if not method returns false.
    *
    * @param colorIn sets color of octahedron if valid.
    * @return true if string is valid, otherwise return false.
    */
   public boolean setColor(String colorIn) {
      boolean isSetColor = false;
      if (colorIn != null) {
         isSetColor = true;
         color = colorIn.trim();
         return isSetColor;
      }
      else {
         return isSetColor;
      }
   }
   /**
    * Accepts no parameters and
    * returns a double representing the edge field.
    *
    * @return edge of octahedron.
    */
   public double getEdge() {
      return edge;
   }
   /**
    * Accepts string parameter for edge.
    * If string is valid, edge is set to the trimed string and 
    * returns true, if not method returns false.
    *
    * @param edgeIn sets edge of octahedron if valid.
    * @return true is string is valid, otherwise return false.
    */
   public boolean setEdge(double edgeIn) {
      if (edgeIn >= 0) {
         edge = edgeIn;
         return true;
      }
      else {
         return false;
      }
   }
   /** 
    * Accepts no parameters and returns the double value for the
    * surface area calculated using the value for edge.
    *
    * @return value for surface area.
    */
   public double surfaceArea() {
      double surfaceArea;
      surfaceArea = 2 * Math.sqrt(3) * Math.pow(edge, 2);
      return surfaceArea;
   }
   /**
    * Accepts no parameters and returns the double value for the volume
    * calculated using the value for edge.
    * 
    * @return value for volume.
    */
   public double volume() {
      double volume;
      volume = (Math.sqrt(2) / 3) * Math.pow(edge, 3);
      return volume;
   }
   /**
    * Accepts no parameters and returns the double value calculated by dividing
    * the surface area by volume.
    *
    * @return calculated surface area to volume ratio.
    */
   public double surfaceToVolumeRatio() {
      double surfaceToVolumeRatio;
      surfaceToVolumeRatio = surfaceArea() / volume();
      return surfaceToVolumeRatio;
   }
   /**
    * Returns a string representing the octahedron object.
    *
    * @return string representing octahedron object.
    */
   public String toString() {
      DecimalFormat df1 = new DecimalFormat("#,##0.0###");
      String output = "Octahedron " + "\"" + label + "\"" + " is " + "\"" 
         + color + "\"" + " with 12 edges of length " + edge + " units." 
         + "\n" + "\t";
      output += "surface area = " + df1.format(surfaceArea()) 
         + " square units" + "\n" + "\t";
      output += "volume = " + df1.format(volume())
         + " cubic units" + "\n" + "\t";
      output += "surface/volume ratio = " + df1.format(surfaceToVolumeRatio());
      return output;
   }
   
}