import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Used to test BankLoan Class.
 *
 * Activity 7A
 * @author Mary Mitchell COMP1210-003
 * @version 10-13-2020
 */
public class BankLoanTest {

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** Test chargeInterest. **/
   @Test public void chargeInterestTest() {
      BankLoan loan1 = new BankLoan("Jane", .10);
      loan1.borrowFromBank(1000.00);
      loan1.chargeInterest();
      Assert.assertEquals("", 1100, loan1.getBalance(), .000001);
   }
   
   /** Test borrowFromBank. **/
   @Test public void borrowFromBankTest() {
      BankLoan loan1 = new BankLoan("Jane", .01);
      Assert.assertFalse(loan1.borrowFromBank(200000));
      Assert.assertTrue(loan1.borrowFromBank(50000));
   }
   
   /** Test payBank. **/
   @Test public void payBankTest() {
      BankLoan loan1 = new BankLoan("Jane", .01);
      loan1.borrowFromBank(1000.00);
      Assert.assertEquals("", 0, loan1.payBank(200.00), .000001);
      Assert.assertEquals("", 300.00, loan1.payBank(1100.00), 000001);
   }
   
   /** Test setInterestRate. **/
   @Test public void setInterestRateTest() {
      BankLoan loan1 = new BankLoan("Jane", .01);
      Assert.assertFalse(loan1.setInterestRate(1.2));
      Assert.assertTrue(loan1.setInterestRate(0.8));
   }
   
   /** Test toString. **/
   @Test public void toStringTest() {
      BankLoan loan1 = new BankLoan("Jane", .01);
      loan1.borrowFromBank(1000.00);
      String expected = "Name: Jane\r\nInterest rate: 0.01%\r\nBalance"
         + ": $1000.0\r\n";
      Assert.assertEquals(expected, loan1.toString());
   }
   
   /** Test isAmountValid. **/
   @Test public void isAmountValidTest() {
      BankLoan loan1 = new BankLoan("Jane", .01);
      Assert.assertFalse(loan1.isAmountValid(-1.0));
      Assert.assertTrue(loan1.isAmountValid(5.0));
   }
   
   /** Test isInDebt. **/
   @Test public void isInDebtTest() {
      BankLoan loan1 = new BankLoan("Jane", .01);
      loan1.borrowFromBank(1000.00);
      Assert.assertTrue(loan1.isInDebt(loan1));
      loan1.payBank(1000.00);
      Assert.assertFalse(loan1.isInDebt(loan1));
   }
   
   /** Test resetLoansCreated. **/
   @Test public void resetLoansCreatedTest() {
      BankLoan loan1 = new BankLoan("Jane", .01);
      BankLoan loan2 = new BankLoan("Bob", .02);
      BankLoan.resetLoansCreated();
      Assert.assertEquals(0, BankLoan.getLoansCreated());
   }
   
   /** Test getLoansCreated. **/
   @Test public void getLoansCreatedTest() {
      BankLoan.resetLoansCreated();
      BankLoan loan1 = new BankLoan("Jane", .01);
      BankLoan loan2 = new BankLoan("Bob", .02);
      Assert.assertEquals(2, BankLoan.getLoansCreated());
   }
}
