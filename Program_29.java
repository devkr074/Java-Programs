// Class in Java (BankAccount Class)

public class Program_29 {
  public static void main(String[] args) {
    BankAccount account = new BankAccount("12345678", 1000);
    account.deposit(500);
    account.withdraw(200);
    System.out.println("Balance: " + account.balance);
  }
}

class BankAccount {
  String accountNumber;
  double balance;

  public BankAccount(String accountNumber, double balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  void deposit(double amount) {
    balance += amount;
    System.out.println("Deposited: " + amount);
  }

  void withdraw(double amount) {
    if (amount <= balance) {
      balance -= amount;
      System.out.println("Withdrew: " + amount);
    } else {
      System.out.println("Insufficient balance.");
    }
  }
}