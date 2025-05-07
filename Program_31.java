// Array in Java

import java.util.Arrays;

public class Program_31 {
    public static void main(String[] args) {
        String[] fruits = { "apple", "orange", "banana", "coconut" };
        fruits[0] = "pineapple";
        int numOfFruits = fruits.length;
        System.out.println(numOfFruits);
        Arrays.sort(fruits);
        Arrays.fill(fruits, "pineapple");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}