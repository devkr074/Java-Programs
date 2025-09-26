import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program_83 {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("filename.txt"))) {
            bw.write("First line");
            bw.newLine();
            bw.write("Second line");
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("Error writing file.");
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("filename.txt", true))) {
            bw.newLine();
            bw.write("Appended line");
            System.out.println("Successfully appended to the file.");
        } catch (IOException e) {
            System.out.println("Error writing file.");
        }
    }
}