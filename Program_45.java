// Abstraction in Java (Payment Interface)

interface Payment {
  void processPayment(double amount);
}

class CreditCardPayment implements Payment {
  @Override
  public void processPayment(double amount) {
    System.out.println("Processed " + amount + " using Credit Card.");
  }
}

class PayPalPayment implements Payment {
  @Override
  public void processPayment(double amount) {
    System.out.println("Processed " + amount + " using PayPal.");
  }
}

public class Program_45 {
  public static void main(String[] args) {
    Payment creditCardPayment = new CreditCardPayment();
    Payment payPalPayment = new PayPalPayment();
    creditCardPayment.processPayment(100.0);
    payPalPayment.processPayment(200.0);
  }
}