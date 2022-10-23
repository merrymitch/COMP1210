/**
 * Creates two instances of UserInfo and assigns and prints
 * the information.
 *
 * Activity 4
 * @author Mary Mitchell COMP1210-003
 * @version 09-15-2020
 */
public class UserInfoDriver {
   /**
    * Creates two user objects and assigns and prints their
    * information.
    * @param args Command line arguments - not used.
    */
   public static void main(String[] args) {
      UserInfo user1 = new UserInfo("Pat", "Doe");
      System.out.println("\n" + user1);
      user1.setLocation("Auburn");
      user1.setAge(19);
      user1.logOn();
      System.out.println("\n" + user1);
      
      UserInfo user2 = new UserInfo("Sam", "Jones");
      System.out.println("\n" + user2);
      user2.setLocation("Atlanta");
      user2.setAge(21);
      user2.logOn();
      System.out.println("\n" + user2);
   }
}