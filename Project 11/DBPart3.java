import java.io.IOException;
/**
 * Program for main method of DBList.
 *
 * Project 11
 * @author Mary Mitchell COMP1210-003
 * @version 11-17-2020
 */
public class DBPart3 {
   /**
    * Method reads in file, processes its information,
    * and prints its information.
    *
    * @param args Command line database_data_2_exceptions.csv.
    */
   public static void main(String[] args) {
      try {
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
            System.out.print(fileDBList.generateInvalidRecordsReport());
         }
      }
      catch (IOException error) {
         String fileIn = args[0];
         System.out.println("*** Attempted to read file: " 
            + fileIn + " (No such file or directory)");
      }
   }
}