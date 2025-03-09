// Encapsulation in Java (Product Class)

public class Program_50 {
  private String productId;
  private String productName;
  private double price;

  public Program_50(String productId, String productName, double price) {
    this.productId = productId;
    this.productName = productName;
    setPrice(price);
  }

  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    if (price >= 0) {
      this.price = price;
    } else {
      System.out.println("Price cannot be negative.");
    }
  }

  public void displayProductInfo() {
    System.out.println("Product ID: " + productId);
    System.out.println("Product Name: " + productName);
    System.out.println("Price: " + price);
  }

  public static void main(String[] args) {
    Program_50 product = new Program_50("P001", "Laptop", 1500);
    product.displayProductInfo();
    product.setPrice(1600);
    product.displayProductInfo();
    product.setPrice(-100);
  }
}