import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program_80 {
  public static void main(String[] args) {
    try (FileInputStream input = new FileInputStream("filename.txt")) {
      int i;
      while ((i = input.read()) != -1) {
        System.out.print((char) i);
      }
    } catch (IOException e) {
      System.out.println("Error reading file.");
    }
    try (FileInputStream input = new FileInputStream("image.jpg");
        FileOutputStream output = new FileOutputStream("copy.jpg")) {
      int i;
      while ((i = input.read()) != -1) {
        output.write(i);
      }
      System.out.println("File copied successfully.");
    } catch (IOException e) {
      System.out.println("Error handling file.");
    }
  }
}