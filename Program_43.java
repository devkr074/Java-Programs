// Abstraction in Java (BankAccount Class)

abstract class BankAccount {
  double balance;

  public BankAccount(double balance) {
    this.balance = balance;
  }

  abstract void deposit(double amount);

  abstract void withdraw(double amount);

  void displayBalance() {
    System.out.println("Balance: " + balance);
  }
}

class SavingsAccount extends BankAccount {
  double interestRate;

  public SavingsAccount(double balance, double interestRate) {
    super(balance);
    this.interestRate = interestRate;
  }

  @Override
  void deposit(double amount) {
    balance += amount;
    System.out.println("Deposited " + amount + " to Savings Account.");
  }

  @Override
  void withdraw(double amount) {
    if (amount <= balance) {
      balance -= amount;
      System.out.println("Withdrew " + amount + " from Savings Account.");
    } else {
      System.out.println("Insufficient balance in Savings Account.");
    }
  }
}

class CheckingAccount extends BankAccount {
  double overdraftLimit;

  public CheckingAccount(double balance, double overdraftLimit) {
    super(balance);
    this.overdraftLimit = overdraftLimit;
  }

  @Override
  void deposit(double amount) {
    balance += amount;
    System.out.println("Deposited " + amount + " to Checking Account.");
  }

  @Override
  void withdraw(double amount) {
    if (amount <= balance + overdraftLimit) {
      balance -= amount;
      System.out.println("Withdrew " + amount + " from Checking Account.");
    } else {
      System.out.println("Overdraft limit exceeded.");
    }
  }
}

public class Program_43 {
  public static void main(String[] args) {
    BankAccount savingsAccount = new SavingsAccount(1000, 0.05);
    BankAccount checkingAccount = new CheckingAccount(500, 200);
    savingsAccount.deposit(200);
    savingsAccount.withdraw(300);
    savingsAccount.displayBalance();
    checkingAccount.deposit(100);
    checkingAccount.withdraw(700);
    checkingAccount.displayBalance();
  }
}