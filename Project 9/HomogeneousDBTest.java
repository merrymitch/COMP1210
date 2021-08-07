import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * Test program for HomogeneousDB.
 *
 * Project 9
 * @author Mary Mitchell COMP1210-003
 * @version 11-05-2020
 */
public class HomogeneousDBTest {

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** Test getCostFactor method. **/
   @Test public void getCostFactorTest() {
      HomogeneousDB db3 = new HomogeneousDB("Database Three", 2000,
                                             7.5, 100, 14.0);
      Assert.assertEquals(1.2, db3.getCostFactor(), 
                          0.000001);                                      
   }
   
   /** Test monthlyCost method. **/
   @Test public void monthlyCostTest() {
      HomogeneousDB db3 = new HomogeneousDB("Database Three", 2000,
                                             7.5, 100, 14.0);
      Assert.assertEquals((2000.0 + db3.userCost() * 1.2),
                          db3.monthlyCost(), 0.000001);
   }

}
