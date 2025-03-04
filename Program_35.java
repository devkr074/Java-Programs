// Library Class Hierarchy in Java

public class Program_35 {
    public static void main(String[] args) {
        EBook ebook = new EBook("1984", "George Orwell", 1.5);
        ebook.displayInfo();
    }
}

class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class EBook extends Book {
    double fileSize;

    public EBook(String title, String author, double fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("File Size: " + fileSize + " MB");
    }
}