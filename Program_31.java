// Class in Java (Book Class)

public class Program_31 {
  public static void main(String[] args) {
    Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
    book.displayBookDetails();
  }
}

class Book {
  String title;
  String author;
  double price;

  public Book(String title, String author, double price) {
    this.title = title;
    this.author = author;
    this.price = price;
  }

  void displayBookDetails() {
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("Price: " + price);
  }
}