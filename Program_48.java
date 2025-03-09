// Encapsulation in Java (BankAccount Class)

public class Program_48 {
  private String accountNumber;
  private double balance;

  public Program_48(String accountNumber, double balance) {
    this.accountNumber = accountNumber;
    setBalance(balance);
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    if (balance >= 0) {
      this.balance = balance;
    } else {
      System.out.println("Balance cannot be negative.");
    }
  }

  public void displayAccountInfo() {
    System.out.println("Account Number: " + accountNumber);
    System.out.println("Balance: " + balance);
  }

  public static void main(String[] args) {
    Program_48 account = new Program_48("12345678", 1000);
    account.displayAccountInfo();
    account.setBalance(500);
    account.displayAccountInfo();
    account.setBalance(-100);
  }
}