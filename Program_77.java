import java.io.FileWriter;
import java.io.IOException;

public class Program_77 {
  public static void main(String[] args) {
    try (FileWriter myWriter = new FileWriter("filename.txt")) {
      myWriter.write("Files in Java might be tricky, but it is fun enough!");
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    try (FileWriter myWriter = new FileWriter("filename.txt", true)) {
      myWriter.write("\nAppended text!");
      System.out.println("Successfully appended to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}