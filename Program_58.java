// File Writing in Java

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Program_58 {
    public static void main(String[] args) {
        String filePath = "test.txt";
        String textContent = """
                Roses are Red
                Violets are Blue
                BOOTY BOOTY BOOTY
                ROCKIN' EVERWHERE!
                """;
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(textContent);
            System.out.println("File has been written");
        } catch (FileNotFoundException e) {
            System.out.println("Could not locate file location");
        } catch (IOException e) {
            System.out.println("Could not write file");
        }
    }
}