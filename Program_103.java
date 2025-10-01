import java.util.Scanner;

public class Program_103 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many items do you want in your shopping list? ");
        int itemCount = scanner.nextInt();
        scanner.nextLine();
        String[] shoppingList = new String[itemCount];
        for (int i = 0; i < itemCount; i++) {
            System.out.print("Enter item " + (i + 1) + ": ");
            shoppingList[i] = scanner.nextLine();
        }
        System.out.println("\nYour Shopping List:");
        for (int i = 0; i < itemCount; i++) {
            System.out.println((i + 1) + ". " + shoppingList[i]);
        }
        scanner.close();
    }
}