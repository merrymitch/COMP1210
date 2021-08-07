import java.util.Scanner;
/**
 * Creats an octahedron object and assigns and prints
 * its information.
 *
 * Project 4
 * @author Mary Mitchell COMP1210-003
 * @version 09-18-2020
 */
public class OctahedronApp {
   /**
    * Reads user input for label, color, and edge then prints 
    * the octahedron object information if edge is valid.
    *
    * @param args Command line arguments - not used.
    */
   public static void main(String[] args) {
      String labelInput;
      String colorInput;
      String edgeInput;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter label, color, and edge length for "
         + "an octahedron.");
      System.out.print("\tlabel: ");
      labelInput = input.nextLine();
      System.out.print("\tcolor: ");
      colorInput = input.nextLine();
      System.out.print("\tedge: ");
      edgeInput = input.nextLine();
      double edge = Double.parseDouble(edgeInput);
      if (edge < 0) {
         System.out.print("Error: edge must be non-negative.");
      }
      else {
         Octahedron octa = new Octahedron(labelInput, colorInput, edge);
         System.out.println("\n" + octa);
      }
   }
}