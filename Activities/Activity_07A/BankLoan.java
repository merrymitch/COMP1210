/**
 * Program to create BankLoan objects and edit them.
 *
 * Activity 7A
 * @author Mary Mitchell COMP1210-003
 * @version 10-13-2020
 */
public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;
   private static int loansCreated = 0;

   /**
    * Accepts parameters for customer name and interest rate.
    * Sets the customer name and interest rate to parameters.
    * Increases the amount of loans created.
    *
    * @param customerNameIn sets customer name.
    * @param interestRateIn sets interest name.
    */
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }

   /**
    * Accepts parameter for amount to be borrowed. If it does not
    * exceed the max loan amount it returns true, else false.
    *
    * @param amount to be borrowed.
    * @return wasLoanMade true if amount does not exceed max loan,
    * else false.
    */
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }

   /**
    * Accepts parameter for amount to be paid to the bank. If the 
    * amount does not cause the balance to be negative it returns
    * 0. Else it returns the overcharge. 
    *
    * @param amountPaid the amount to be paid to bank.
    * @return 0 if the payment goes through, else return the overcharge.
    */
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
   
   /**
    * Returns the balance.
    *
    * @return the balance.
    */
   public double getBalance() {
      return balance;
   }
   
   /**
    * Accepts parameter for interest rate and sets it as long as it is 
    * greater than or equal to zero and less than or equal to 1.
    *
    * @param interestRateIn used to set interest rate.
    * @return true if between [0,1] and false otherwise.
    */
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
    * Returns the interest rate.
    *
    * @return the interest rate.
    */
   public double getInterestRate() {
      return interestRate;
   }
   
   /**
    * Charges the interest rate to the balance.
    */
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   
   /**
    * Returns a string representing the bankloan object.
    *
    * @return string representing the bankloan object.
    */
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }
   
   /**
    * Returns true if a loan amount is valid and otherwise false. 
    * Accepts amount as parameter to determine.
    * 
    * @param amount used to determine if valid.
    * @return true if valid, otherwise false.
    */
   public static boolean isAmountValid(double amount) {
      return amount >= 0;
   } 
   
   /**
    * Accepts parameter for a loan and determines if object is in debt.
    *
    * @param loan to be taken out.
    * @return true if the loan balance is greater than 0 otherwise false.
    */
   public static boolean isInDebt(BankLoan loan) {
      if (loan.getBalance() > 0) {
         return true;
      }
      return false;
   }
   
   /**
    * @return the loans created.
    */
   public static int getLoansCreated() {
      return loansCreated;
   }
   /**
    * Resets the loans created to 0.
    */
   public static void resetLoansCreated() {
      loansCreated = 0;
   }

}
