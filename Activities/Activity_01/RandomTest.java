public class RandomTest {
   public static void main(String[] args) {
      int n = 100;
      do {
         System.out.println(n);
         n = n + 100;
      } while (n < 1000);
      System.out.println("\n");
      for (int k = 100; k < 1000; k = k + 100) {
         System.out.println(k);
      }
   }
}