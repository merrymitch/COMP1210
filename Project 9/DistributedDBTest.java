import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * Test program for DistributedDB.
 *
 * Project 9
 * @author Mary Mitchell COMP1210-003
 * @version 11-05-2020
 */
public class DistributedDBTest {

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** Test getNumberOfUsers and setNumberOfUsers methods. **/
   @Test public void getSetNumberOfUsersTest() {
      DistributedDB db2 = new DistributedDB("Database Two", 2000.0,
                                             7.5, 100, 12.0);
      Assert.assertEquals(100, db2.getNumberOfUsers(), 0.000001);
      db2.setNumberOfUsers(300);
      Assert.assertEquals(300, db2.getNumberOfUsers(), 0.000001);
   }
   
   /** Test getCostPerUser and setCostPerUser methods. **/
   @Test public void getSetCostPerUserTest() {
      DistributedDB db2 = new DistributedDB("Database Two", 2000.0,
                                             7.5, 100, 12.0);
      Assert.assertEquals(12.0, db2.getCostPerUser(), 0.000001);
      db2.setCostPerUser(15.0);
      Assert.assertEquals(15.0, db2.getCostPerUser(), 0.000001);
   }
   
   /** Test userCost method. **/
   @Test public void userCostTest() {
      DistributedDB db2 = new DistributedDB("Database Two", 2000.0,
                                             7.5, 100, 12.0);
      Assert.assertEquals((100 * 12.0), db2.userCost(), 
                           0.000001);                                       
   }
   
   /** Test getCostFactor method. **/
   @Test public void getCostFactorTest() {
      DistributedDB db2 = new DistributedDB("Database Two", 2000.0,
                                             7.5, 100, 12.0);
      Assert.assertEquals(1.1, db2.getCostFactor(), 
                          0.000001);                                           
   }
   
   
   /** Test monthlyCost method. **/
   @Test public void monthlyCostTest() {
      DistributedDB db2 = new DistributedDB("Database Two", 2000.0,
                                             7.5, 100, 12.0);
      Assert.assertEquals((2000.0 + db2.userCost() * 1.1),
                           db2.monthlyCost(), 0.000001);
   }
   
   /** Test toString method. **/
   @Test public void toStringTest() {
      DistributedDB db2 = new DistributedDB("Database Two", 2000.0,
                                             7.5, 100, 12.0);
      Assert.assertTrue(db2.toString().contains("Database Two"));
   }

}
