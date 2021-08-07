import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * Program to test SpherocylinderList.
 *
 * Project 8
 * @author Mary Mitchell COMP1210-003
 * @version 10-29-2020
 */
public class SpherocylinderListTest {

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /** Test getName. **/
   @Test public void getNameTest() {
      Spherocylinder[] spheroList = new Spherocylinder[35];
      SpherocylinderList sList = new SpherocylinderList("name",
         spheroList, 5);
      Assert.assertEquals("name", sList.getName());
   }
   
   /** Test numberOfSpherocylinders. **/
   @Test public void numberOfSpherocylindersTest() {
      Spherocylinder[] spheroList = new Spherocylinder[43];
      SpherocylinderList sList = new SpherocylinderList("name", 
         spheroList, 5);
      SpherocylinderList sCList = new SpherocylinderList("name",
         spheroList, 0);
      Assert.assertEquals(5, sList.numberOfSpherocylinders());
      Assert.assertEquals(0, sCList.numberOfSpherocylinders());
   }
   
   /** Test totalSurfaceArea. **/
   @Test public void totalSurfaceAreaTest() {
      Spherocylinder[] spheroList = new Spherocylinder[20];
      Spherocylinder[] spheroList2 = new Spherocylinder[20];
      Spherocylinder ex1 = new Spherocylinder("name", 4, 5);
      Spherocylinder ex2 = new Spherocylinder("name2", 3, 2);
      spheroList[0] = ex1;
      spheroList[1] = ex2;
      SpherocylinderList sList = new SpherocylinderList("name",
         spheroList, 2);
      SpherocylinderList sCList = new SpherocylinderList("name",
         spheroList2, 0);
      Assert.assertEquals(((2 * Math.PI * 4) * ((2 * 4) + 5))
         + ((2 * Math.PI * 3) * ((2 * 3) + 2)),
            sList.totalSurfaceArea(), 0.000001);
      Assert.assertEquals(0, sCList.totalSurfaceArea(), 0.000001);
   }
   
   /** Test totalVolume. **/
   @Test public void totalVolumeTest() {
      Spherocylinder[] spheroList = new Spherocylinder[20];
      Spherocylinder[] spheroList2 = new Spherocylinder[20];
      Spherocylinder ex1 = new Spherocylinder("name", 1, 1);
      Spherocylinder ex2 = new Spherocylinder("name2", 1, 1);
      spheroList[0] = ex1;
      spheroList[1] = ex2;
      SpherocylinderList sList = new SpherocylinderList("name",
         spheroList, 2);
      SpherocylinderList sCList = new SpherocylinderList("name",
         spheroList2, 0);
      Assert.assertEquals((Math.PI * ((4 * 1.0 / 3) + 1)) * 2, 
         sList.totalVolume(), 0.000001);
      Assert.assertEquals(0, sCList.totalVolume(), 0.000001);
   }
   
   /** Test averageSurfaceArea. **/ 
   @Test public void averageSurfaceAreaTest() {
      Spherocylinder[] spheroList = new Spherocylinder[20];
      Spherocylinder[] spheroList2 = new Spherocylinder[20];
      Spherocylinder ex1 = new Spherocylinder("name", 1, 1);
      Spherocylinder ex2 = new Spherocylinder("name2", 1, 1);
      spheroList[0] = ex1;
      spheroList[1] = ex2;
      SpherocylinderList sList = new SpherocylinderList("name",
         spheroList, 2);
      SpherocylinderList sCList = new SpherocylinderList("name",
         spheroList2, 0);
      Assert.assertEquals(sList.totalSurfaceArea() / 2, 
         sList.averageSurfaceArea(), 0.000001);
      Assert.assertEquals(0, sCList.averageSurfaceArea(), 
         0.000001);
   }
   
   /** Test averageVolume. **/
   @Test public void averageVolumeTest() {
      Spherocylinder[] spheroList = new Spherocylinder[20];
      Spherocylinder[] spheroList2 = new Spherocylinder[20];
      Spherocylinder ex1 = new Spherocylinder("name", 1, 1);
      Spherocylinder ex2 = new Spherocylinder("name2", 1, 1);
      spheroList[0] = ex1;
      spheroList[1] = ex2;
      SpherocylinderList sList = new SpherocylinderList("name",
         spheroList, 2);
      SpherocylinderList sCList = new SpherocylinderList("name",
         spheroList2, 0);
      Assert.assertEquals(sList.totalVolume() / 2, 
         sList.averageVolume(), 0.000001);
      Assert.assertEquals(0, sCList.averageVolume(), 0.000001);
   }
   
   /** Test toString. **/
   @Test public void toStringTest() {
      Spherocylinder[] spheroList = new Spherocylinder[20];
      Spherocylinder ex1 = new Spherocylinder("name", 1, 1);
      spheroList[0] = ex1;
      SpherocylinderList sList = new SpherocylinderList("name",
         spheroList, 1);
      Assert.assertTrue(sList.toString().contains(
         "Number of Spherocylinders: 1"));
   }
   
   /** Test getList. **/
   @Test public void getListTest() {
      Spherocylinder[] spheroList = new Spherocylinder[8];
      SpherocylinderList sList = new SpherocylinderList("name",
         spheroList, 5);
      Assert.assertArrayEquals(spheroList, sList.getList());
   }
   
   /** Test addSpherocylinder. **/
   @Test public void addSpherocylinderTest() {
      Spherocylinder[] spheroList = new Spherocylinder[8];
      SpherocylinderList sList = new SpherocylinderList("name",
         spheroList, 0);
      sList.addSpherocylinder("new", 3, 4);
      Assert.assertEquals(1, sList.numberOfSpherocylinders());
   }
   
   /** Test findSpherocylinder. **/
   @Test public void findSpherocylinderTest() {
      Spherocylinder[] spheroList = new Spherocylinder[7];
      Spherocylinder[] spheroList2 = new Spherocylinder[4];
      Spherocylinder ex1 = new Spherocylinder("one", 1, 2);
      Spherocylinder ex2 = new Spherocylinder("two", 3, 4);
      Spherocylinder ex3 = new Spherocylinder("three", 5, 6);
      spheroList[0] = ex1;
      spheroList[1] = ex2;
      spheroList[2] = ex3;
      spheroList2[0] = ex1;
      SpherocylinderList testList = new SpherocylinderList("name",
         spheroList, 3);
      SpherocylinderList testList2 = new SpherocylinderList("name",
         spheroList2, 1);
      Assert.assertEquals(ex3, testList.findSpherocylinder("Three"));
      Assert.assertEquals(null, testList2.findSpherocylinder("Three"));
   }
   
   /** Test deleteSpherocylinder. **/
   @Test public void deleteSpherocylinderTest() {
      Spherocylinder[] spheroList = new Spherocylinder[7];
      Spherocylinder[] spheroList2 = new Spherocylinder[4];
      Spherocylinder ex1 = new Spherocylinder("one", 1, 2);
      Spherocylinder ex2 = new Spherocylinder("two", 3, 4);
      Spherocylinder ex3 = new Spherocylinder("three", 5, 6);
      spheroList[0] = ex1;
      spheroList[1] = ex2;
      spheroList[2] = ex3;
      spheroList2[0] = ex1;
      SpherocylinderList testList = new SpherocylinderList("name",
         spheroList, 3);
      SpherocylinderList testList2 = new SpherocylinderList("name",
         spheroList2, 1);
      testList.deleteSpherocylinder("ONE");
      Assert.assertEquals(null, spheroList[2]);
      Assert.assertEquals(ex2, testList.deleteSpherocylinder("TWO"));
      Assert.assertEquals(null, testList2.deleteSpherocylinder("TWO"));
   }
   
   /** Test editSpherocylinder. **/
   @Test public void editSpherocylinderTest() {
      Spherocylinder[] spheroList = new Spherocylinder[7];
      Spherocylinder ex1 = new Spherocylinder("one", 1, 2);
      Spherocylinder ex2 = new Spherocylinder("two", 3, 4);
      Spherocylinder ex3 = new Spherocylinder("three", 5, 6);
      spheroList[0] = ex1;
      spheroList[1] = ex2;
      spheroList[2] = ex3;
      SpherocylinderList testList = new SpherocylinderList("name",
         spheroList, 3);
      testList.editSpherocylinder("ONE", 7, 8);
      Assert.assertFalse(testList.editSpherocylinder("HI", 5, 2));
      Assert.assertEquals(7, spheroList[0].getRadius(), 0.000001);
   }
   
   /** Test findSpherocylinderWithLargestVolume. **/
   @Test public void findSpherocylinderWithLargestVolumeTest() {
      Spherocylinder[] spheroList = new Spherocylinder[7];
      Spherocylinder ex1 = new Spherocylinder("one", 1, 2);
      Spherocylinder ex2 = new Spherocylinder("two", 3, 4);
      Spherocylinder ex3 = new Spherocylinder("three", 5, 6);
      spheroList[0] = ex1;
      spheroList[1] = ex2;
      spheroList[2] = ex3;
      Spherocylinder[] spheroList2 = new Spherocylinder[9];
      SpherocylinderList testList = new SpherocylinderList("name",
         spheroList, 3);
      SpherocylinderList testList2 = new SpherocylinderList("name",
         spheroList2, 0);
      Spherocylinder largeSphero = 
         testList.findSpherocylinderWithLargestVolume();
      Assert.assertEquals(ex3, largeSphero);
      Assert.assertEquals(null, 
         testList2.findSpherocylinderWithLargestVolume());
   }
}
