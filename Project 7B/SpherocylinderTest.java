import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * Program to test Spherocylinder class.
 *
 * Project 7B
 * @author Mary Mitchell COMP1210-003
 * @version 10-22-2020
 */
public class SpherocylinderTest {

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** Test getLabel. **/
   @Test public void getLabelTest() {
      Spherocylinder ex = new Spherocylinder("Small Ex", 0.5, 0.25);
      String expected = "Small Ex";
      Assert.assertEquals(expected, ex.getLabel());
   }
   
   /** Test setLabel. **/
   @Test public void setLabelTest() {
      Spherocylinder ex = new Spherocylinder("Small Ex", 0.5, 0.25);
      String label1 = "Medium Ex";
      boolean good = ex.setLabel(label1);
      boolean bad = ex.setLabel(null);
      Assert.assertTrue(good);
      Assert.assertFalse(bad);
   }
   
   /** Test getRadius. **/
   @Test public void getRadiusTest() {
      Spherocylinder ex = new Spherocylinder("Small Ex", 0.5, 0.25);
      double expected = 0.5;
      Assert.assertEquals(expected, ex.getRadius(), .000001);
   }
   
   /** Test setRadius. **/
   @Test public void setRadiusTest() {
      Spherocylinder ex = new Spherocylinder("Small Ex", 0.5, 0.25);
      boolean good = ex.setRadius(0.96);
      boolean bad = ex.setRadius(-0.85);
      Assert.assertTrue(good);
      Assert.assertFalse(bad);
   }
   
   /** Test getCylinderHeight. **/
   @Test public void getCylinderHeightTest() {
      Spherocylinder ex = new Spherocylinder("Medium Ex", 0.8, 0.5);
      double expected = 0.5;
      Assert.assertEquals(expected, ex.getCylinderHeight(), .000001);
   }
   
   /** Test setCylinderHeight. **/
   @Test public void setCylinderHeightTest() {
      Spherocylinder ex = new Spherocylinder("Medium Ex", 0.8, 0.5);
      boolean good = ex.setCylinderHeight(0.67);
      boolean bad = ex.setCylinderHeight(-2.0);
      Assert.assertTrue(good);
      Assert.assertFalse(bad);
   }
   
   /** Test circumference. **/
   @Test public void circumferenceTest() {
      Spherocylinder ex = new Spherocylinder("Large Ex", 0, 0.60);
      double circumference = ex.circumference();
      Assert.assertEquals(0, circumference, .000001);
   }
   
   /** Test surfaceArea. **/
   @Test public void surfaceAreaTest() {
      Spherocylinder ex = new Spherocylinder("Large Ex", 0, 0);
      double surfaceArea = ex.surfaceArea();
      Assert.assertEquals(0, surfaceArea, 0.000001);
   }
   
   /** Test volume. **/
   @Test public void volumeTest() {
      Spherocylinder ex = new Spherocylinder("Medium Ex", 0, 0);
      double volume = ex.volume();
      Assert.assertEquals(0, volume, .000001);
   }
   
   /** Test toString. **/
   @Test public void toStringTest() {
      Spherocylinder ex = new Spherocylinder("Large Ex", 0.8, 0.5);
      Assert.assertTrue(ex.toString().contains("\"Large Ex\""));
   }
   
   /** Test getCount. **/
   @Test public void getCountTest() {
      Spherocylinder.resetCount();
      Spherocylinder ex1 = new Spherocylinder("Large Ex", 0.8, 0.5);
      Spherocylinder ex2 = new Spherocylinder("Medium Ex", 0, 0);
      Assert.assertEquals(2, Spherocylinder.getCount());
   }
   
   /** Test resetCount. **/
   @Test public void resetCount() {
      Spherocylinder ex = new Spherocylinder("Medium Ex", 0.6, 0.35);
      Spherocylinder.resetCount();
      Assert.assertEquals(0, Spherocylinder.getCount());
   }
   
   /** Test equals label. **/
   @Test public void equalsTest1() {
      Spherocylinder sc1 = new Spherocylinder("Medium Ex", 98.32, 99.0);
      Spherocylinder sc2 = new Spherocylinder("Large Ex", 98.32, 99.0);
      Assert.assertFalse(sc1.equals(sc2));
   }
   
   /** Test equals radius. **/
   @Test public void equalsTest2() {
      Spherocylinder sc1 = new Spherocylinder("Medium Ex", 10.8, 9.6);
      Spherocylinder sc2 = new Spherocylinder("Medium Ex", 98.32, 9.6);
      Assert.assertFalse(sc1.equals(sc2));
   }
   
   /** Test equals height. **/
   @Test public void equalsTest3() {
      Spherocylinder sc1 = new Spherocylinder("Medium Ex", 10.8, 9.6);
      Spherocylinder sc2 = new Spherocylinder("Medium Ex", 10.8, 99.0);
      Assert.assertFalse(sc1.equals(sc2));
   }
   
   /** Test equals true. **/
   @Test public void equalsTest4() {
      Spherocylinder sc1 = new Spherocylinder("Medium Ex", 10.8, 9.6);
      Spherocylinder sc2 = new Spherocylinder("Medium Ex", 10.8, 9.6);
      Assert.assertEquals(sc1, sc2);
      Assert.assertTrue(sc1.equals(sc2));
   }
   
   /** Test equals false. **/
   @Test public void equalsTest5() {
      Spherocylinder sc1 = new Spherocylinder("Medium Ex", 10.8, 9.6);
      String notSC = "Not a spherocylinder";
      Assert.assertFalse(sc1.equals(notSC));
   }
   
   /** Test hashCode. **/
   @Test public void hashCodeTest() {
      Spherocylinder ex = new Spherocylinder("Medium Ex", 0.6, 0.35);
      int hCode = ex.hashCode();
      Assert.assertEquals(0, hCode);
   }
   
   /** Test compareTo less than. **/
   @Test public void compareToTest1() {
      Spherocylinder sc1 = new Spherocylinder("Small Ex", 0.5, 0.25);
      Spherocylinder sc2 = new Spherocylinder("Large Ex", 98.32, 99.0);
      Assert.assertTrue(sc1.compareTo(sc2) < 0);
   }
   
   /** Test compareTo equals. **/
   @Test public void compareToTest2() {
      Spherocylinder sc1 = new Spherocylinder("Small Ex", 0.5, 0.25);
      Spherocylinder sc2 = new Spherocylinder("Small Ex", 0.5, 0.25);
      Assert.assertTrue(sc1.compareTo(sc2) == 0);
   }
   
   /** Test compareTo greater than. **/
   @Test public void compareToTest3() {
      Spherocylinder sc1 = new Spherocylinder("Small Ex", 0.5, 0.25);
      Spherocylinder sc2 = new Spherocylinder("Large Ex", 98.32, 99.0);
      Assert.assertTrue(sc2.compareTo(sc1) > 0);
   }
   
}
