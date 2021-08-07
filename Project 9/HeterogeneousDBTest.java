import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * Test program for HeterogeneousDB.
 *
 * Project 9
 * @author Mary Mitchell COMP1210-003
 * @version 11-05-2020
 */
public class HeterogeneousDBTest {

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /** Test getCostFactor method. **/
   @Test public void getCostFactorTest() {
      HeterogeneousDB db4 = new HeterogeneousDB("Database Four", 2000,
                                                7.5, 100, 14.0);
      Assert.assertEquals(1.3, db4.getCostFactor(), 
                          0.000001);

   }
   
   /** Test monthlyCost method. **/
   @Test public void monthlyCostTest() {
      HeterogeneousDB db4 = new HeterogeneousDB("Database Four", 2000,
                                                7.5, 100, 14.0);
      Assert.assertEquals((2000.0 + db4.userCost() * 1.3),
                          db4.monthlyCost(), 0.000001);
   }
}
