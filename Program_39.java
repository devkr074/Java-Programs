// Polymorphism in Java (Payment System)

interface Payment {
  void pay(double amount);
}

class CreditCardPayment implements Payment {
  @Override
  public void pay(double amount) {
    System.out.println("Paid " + amount + " using Credit Card.");
  }
}

class PayPalPayment implements Payment {
  @Override
  public void pay(double amount) {
    System.out.println("Paid " + amount + " using PayPal.");
  }
}

public class Program_39 {
  public static void main(String[] args) {
    Payment creditCardPayment = new CreditCardPayment();
    Payment payPalPayment = new PayPalPayment();
    creditCardPayment.pay(100.0);
    payPalPayment.pay(200.0);
  }
}