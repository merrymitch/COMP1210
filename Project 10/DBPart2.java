import java.io.IOException;
/**
 * The main method program for DBList.
 *
 * Project 10
 * @author Mary Mitchell COMP1210-003
 * @version 11-12-2020
 */
public class DBPart2 {
   /**
    * Method reads in file, processes its information,
    * and prints its information.
    *
    * @param args Command line database_data_1.csv.
    * @throws IOException if file not found. 
    */
   public static void main(String[] args) throws IOException {
      if (args.length == 0) {
         System.out.println("File name expected as command line "
            + "argument.");
         System.out.println("Program ending.");
      }
      else {
         String fileIn = args[0];
         DBList fileDBList = new DBList();
         fileDBList.readFile(fileIn);
         System.out.print(fileDBList.generateReport());
         System.out.print(fileDBList.generateReportByName());
         System.out.print(fileDBList.generateReportByMonthlyCost());
      }
   }
}