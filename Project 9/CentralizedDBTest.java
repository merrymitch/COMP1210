import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * Test program for CentralizedDB.
 *
 * Project 9
 * @author Mary Mitchell COMP1210-003
 * @version 11-05-2020
 */
public class CentralizedDBTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /** Test DB getName and setName methods. **/
   @Test public void getSetNameTest() {
      CentralizedDB db1 = new CentralizedDB("Database One", 1200.0,
                                            5.00, 1500.0);
      db1.setName("Database One Test");
      Assert.assertEquals("Database One Test", 
                           db1.getName());                            
   }
   
   /** Test DB setBaseCost method. **/
   @Test public void setBaseCostTest() {
      CentralizedDB db1 = new CentralizedDB("Database One", 1200.0,
                                            5.00, 1500.0);
      db1.setBaseCost(1000.0);
      Assert.assertEquals(1000.0, db1.getBaseCost(),
                          0.000001);
   }
   
   /** Test setDbStorage method. **/
   @Test public void setDbStorageTest() {
      CentralizedDB db1 = new CentralizedDB("Database One", 1200.0,
                                            5.00, 1500.0);
      db1.setDbStorage(1000.0);
      Assert.assertEquals(1000.0, db1.getDbStorage(),
                          0.000001);
   }
   
   /** Test resetCount method. **/
   @Test public void resetCountTest() {
      CentralizedDB db1 = new CentralizedDB("Database One", 1200.0,
                                            5.00, 1500.0);
      CentralizedDB db2 = new CentralizedDB("Database Two", 1200.0,
                                            5.00, 1500.0);
      db2.resetCount();
      Assert.assertEquals(0, db2.getCount());
   }


   /** Test getLicense and setLicense methods. **/
   @Test public void getSetLicenseTest() {
      CentralizedDB db1 = new CentralizedDB("Database One", 1200.0,
                                            5.00, 1500.0);
      Assert.assertEquals(1500.0, db1.getLicense(), 0.000001);
      db1.setLicense(3000.0);
      Assert.assertEquals(3000.0, db1.getLicense(), 0.000001);
   }
   
   /** Test monthlyCost method. **/
   @Test public void monthlyCostTest() {
      CentralizedDB db1 = new CentralizedDB("Database One", 1200.0,
                                            5.00, 1500.0);
      Assert.assertEquals((1200.0 + 1500.0), db1.monthlyCost(), 0.000001);
   }
   
   /** Test toString method. **/
   @Test public void toStringTest() {
      CentralizedDB db1 = new CentralizedDB("Database One", 1200.0,
                                            5.00, 1500.0);
      Assert.assertTrue(db1.toString().contains("Storage:"));
   }
   
}
