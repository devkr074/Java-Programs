import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program_81 {
  public static void main(String[] args) {
    String text = "Hello World!";
    try (FileOutputStream output = new FileOutputStream("filename.txt")) {
      output.write(text.getBytes());
      System.out.println("Successfully wrote to file.");
    } catch (IOException e) {
      System.out.println("Error writing file.");
      e.printStackTrace();
    }
    try (FileInputStream input = new FileInputStream("image.jpg");
        FileOutputStream output = new FileOutputStream("copy.jpg")) {
      int b;
      while ((b = input.read()) != -1) {
        output.write(b);
      }
      System.out.println("File copied successfully.");
    } catch (IOException e) {
      System.out.println("Error handling file.");
    }
    String appendText = "\nAppended text!";
    try (FileOutputStream output = new FileOutputStream("filename.txt", true)) {
      output.write(appendText.getBytes());
      System.out.println("Successfully appended to file.");
    } catch (IOException e) {
      System.out.println("Error writing file.");
      e.printStackTrace();
    }
  }
}