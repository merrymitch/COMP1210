import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Provides methods for reading in data files and generating reports.
 * 
 * Project 10
 * @author Mary Mitchell COMP1210-003
 * @version 11-12-2020
 */
public class DBList {
   // Fields
   private DB[] dbList;
   private String[] invalidRecords;
   
   // Constructor
   /**
    * Sets the array fields to length zero.
    */
   public DBList() {
      dbList = new DB[0];
      invalidRecords = new String[0];
   }
   
   // Methods
   /**
    * Accepts no parameters and returns an array of type DB.
    *
    * @return An array of type DB.
    */
   public DB[] getDBArray() {
      return dbList;
   }
   /**
    * Accepts no parameters and returns an array of invalid records.
    *
    * @return An array of invalid records.
    */
   public String[] getInvalidRecordsArray() {
      return invalidRecords;
   }
   /**
    * Accepts a DB object and increases capacity of dbList by one.
    * Adds the DB object to the list and returns nothing.
    *
    * @param dbIn The DB object to be added.
    */
   public void addDB(DB dbIn) {
      dbList = Arrays.copyOf(dbList, dbList.length + 1);
      dbList[dbList.length - 1] = dbIn;
   }
   /**
    * Accepts a String, increases the capacity of invalidRecords by one,
    * and adds the string to the list and returns nothing.
    *
    * @param stringIn The string to be added.
    */
   public void addInvalidRecord(String stringIn) {
      invalidRecords = Arrays.copyOf(invalidRecords,
         invalidRecords.length + 1);
      invalidRecords[invalidRecords.length - 1] = stringIn;
   }
   /**
    * Accepts data file name and reads it in. For each line read, the
    * appropriate DB object is created and added to the array.
    * No return value.
    *
    * @param fileIn The file to be read in.
    * @throws FileNotFoundException if file is not found.
    */
   public void readFile(String fileIn) throws FileNotFoundException {
      Scanner scan1 = new Scanner(new File(fileIn));
      while (scan1.hasNext()) {
         String dbLine = scan1.nextLine();
         Scanner scanDB = new Scanner(dbLine);
         scanDB.useDelimiter(",");
         DB fileDB;
         char type = scanDB.next().charAt(0);
         String dbName = scanDB.next();
         double dbBaseCost = Double.parseDouble(scanDB.next());
         double dbStore = Double.parseDouble(scanDB.next());
         switch (type) {
            case 'C':
               double licenseIn = Double.parseDouble(scanDB.next());
               fileDB = new CentralizedDB(dbName, dbBaseCost,
                  dbStore, licenseIn);
               addDB(fileDB);
               break;
            case 'D':
               int userNumberIn = Integer.parseInt(scanDB.next());
               double costPerUserIn =
                  Double.parseDouble(scanDB.next());
               fileDB = new DistributedDB(dbName, dbBaseCost, dbStore, 
                  userNumberIn, costPerUserIn);
               addDB(fileDB);
               break;
            case 'H':
               int userNumberIn2 = Integer.parseInt(scanDB.next());
               double costPerUserIn2 = 
                  Double.parseDouble(scanDB.next());
               fileDB = new HomogeneousDB(dbName, dbBaseCost, dbStore,
                  userNumberIn2, costPerUserIn2);
               addDB(fileDB);
               break;
            case 'E':
               int userNumberIn3 = Integer.parseInt(scanDB.next());
               double costPerUserIn3 = 
                  Double.parseDouble(scanDB.next());
               fileDB = new HeterogeneousDB(dbName, dbBaseCost, dbStore,
                  userNumberIn3, costPerUserIn3);
               addDB(fileDB);
               break;
            default:
               break;
         }
         
      }
      
   }
   /**
    * Processes the DB array using the original order from the file
    * to produce Monthly Database Report and return it as a String.
    *
    * @return String of original order of file.
    */
   public String generateReport() {
      String output = "-------------------------------" + "\n" 
         + "Monthly Database Report" + "\n" 
         + "-------------------------------" + "\n";
      for (DB db : dbList) {
         output += db.toString() + "\n\n";
      }
      return output;
   }
   /**
    * Sorts the DB array by its natural ordering and processes it by 
    * name and return it as a String.
    *
    * @return String of sorted (by name) array.
    */
   public String generateReportByName() {
      String output = "-----------------------------------------" + "\n" 
         + "Monthly Database Report (by Name)" + "\n" 
         + "-----------------------------------------" + "\n";
      Arrays.sort(getDBArray());
      for (DB db : dbList) {
         output += db.toString() + "\n\n";
      }
      return output;
   }
   /**
    * Sorts the DB array by its monthly cost and returns it as a String.
    *
    * @return String of sorted (by monthly cost) array.
    */
   public String generateReportByMonthlyCost() {
      String output = "-------------------------------------------------" 
         + "\n" + "Monthly Database Report (by Monthly Cost)" + "\n" 
         + "-------------------------------------------------" + "\n";
      Arrays.sort(getDBArray(), new MonthlyCostComparator());
      for (DB db : dbList) {
         output += db.toString() + "\n\n";
      }
      return output;
   }
}