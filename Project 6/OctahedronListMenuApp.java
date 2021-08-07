import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
/**
 * Program to use user input to display and edit Octahedron object
 * information.
 *
 * Project 6
 * @author Mary Mitchell COMP1210-003
 * @version 10-02-2020
 */
public class OctahedronListMenuApp {
   /**
    * Uses Octahedron and OctahedronList methods to display information
    * according to what the user inputs.
    *
    * @param args Command line arguments - not used.
    * @throws IOException from scanning input file.
    */
   public static void main(String[] args) throws IOException {
      String listName = "";
      ArrayList<Octahedron> myList = new ArrayList<Octahedron>();
      String label;
      String color;
      double edge;
      String input;
      String fileName;
      Scanner scan = new Scanner(System.in);
      OctahedronList oList = new OctahedronList(listName, myList);
      System.out.println("Octahedron List System Menu\n"
         + "R - Read File and Create Octahedron List\n"
         + "P - Print Octahedron List\n"
         + "S - Print Summary\n"
         + "A - Add Octahedron\n"
         + "D - Delete Octahedron\n"
         + "F - Find Octahedron\n"
         + "E - Edit Octahedron\n"
         + "Q - Quit");
      do
      {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         input = scan.nextLine();
         if (input.length() == 0) {
            continue;
         }
         input = input.toUpperCase();
         char charInput = input.charAt(0);
         switch (charInput) {
            case 'R':
               System.out.print("\tFile Name: ");
               fileName = scan.nextLine();
               oList = oList.readFile(fileName);
               System.out.println("\tFile read in and Octahedron "
                  + "List created\n");
               break;
            case 'P':
               System.out.println(oList);
               break;
            case 'S':
               System.out.println("\n" + oList.summaryInfo() + "\n");
               break;
            case 'A':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               System.out.print("\tColor: ");
               color = scan.nextLine();
               System.out.print("\tEdge: ");
               edge = Double.parseDouble(scan.nextLine());
               oList.addOctahedron(label, color, edge);
               System.out.println("\t*** Octahedron added ***\n");
               break;
            case 'D':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               if (oList.findOctahedron(label) != null) {
                  label = (oList.findOctahedron(label)).getLabel();
               }
               if (oList.deleteOctahedron(label) != null) {
                  oList.deleteOctahedron(label);
                  System.out.println("\t\"" + label + "\" deleted\n");
               }
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;
            case 'F':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               if (oList.findOctahedron(label) == null) {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               else {
                  System.out.println(oList.findOctahedron(label).toString()
                     + "\n");
               }
               break;
            case 'E': 
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               if (oList.findOctahedron(label) != null) {
                  label = (oList.findOctahedron(label)).getLabel();
               }
               System.out.print("\tColor: ");
               color = scan.nextLine();
               System.out.print("\tEdge: ");
               edge = Double.parseDouble(scan.nextLine());
               if (oList.findOctahedron(label) == null) {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               else {
                  System.out.println("\t\"" + label + "\" successfully "
                     + "edited\n");
               }
            case 'Q':
               break;
            default:
               System.out.println("\t*** invalid code ***\n");
         }
      } while (!input.equalsIgnoreCase("Q"));   
   }
}