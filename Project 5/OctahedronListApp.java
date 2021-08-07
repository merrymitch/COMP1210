import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
/**
 * Program to read input file from user and create Octahedron 
 * objects from the file and store them in an array. Also creates
 * OctahedronList object and prints its information.
 *
 * Project 5
 * @author Mary Mitchell COMP1210-003
 * @version 09-24-2020
 */
public class OctahedronListApp {
   /**
    * Reads in a file from the user and puts its information into
    * Octahedron objects stored in an array. Then creates an 
    * OctahedronList object that prints a summary of the objects' info.
    *
    * @param args Command line arguments - not used.
    * @throws IOException from scanning input file.
    */
   public static void main(String[] args) throws IOException 
   {
      // Scanner object.
      Scanner scan = new Scanner(System.in);
      // ArrayList for Octahedron objects.
      ArrayList<Octahedron> octaList = new ArrayList<Octahedron>();
      // Variables.
      String nameListInput;
      String labelInput;
      String colorInput;
      double edgeInput;
      // Output and reading files.
      System.out.print("Enter file name: ");
      String fileName = scan.nextLine();
      System.out.println();
      Scanner scanFile = new Scanner(new File(fileName));
      nameListInput = scanFile.nextLine();
      // Read the file and assign info to variables.
      // Creates Octahedron objects to add to the ArrayList.
      while (scanFile.hasNext()) {
         labelInput = scanFile.nextLine();
         colorInput = scanFile.nextLine();
         edgeInput = Double.parseDouble(scanFile.nextLine());
         Octahedron octa = new Octahedron(labelInput,
            colorInput, edgeInput);
         octaList.add(octa);
      }
      // Creates OctahedronList object and prints its info.
      OctahedronList listOfOctas = new OctahedronList(nameListInput,
         octaList);
      System.out.println(listOfOctas);
      System.out.println();
      System.out.println(listOfOctas.summaryInfo());
   }
}