// User Input using BufferedReader Class in Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Your Name: ");
        String name = reader.readLine();
        System.out.println("Hello " + name + "!");
    }
}