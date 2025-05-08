// 2D Array in Java

public class Program_35 {
    public static void main(String[] args) {
        String[][] groceries = { { "apple", "orange", "banana" },
                { "potato", "onion", "carrot" },
                { "chicken", "pork", "beef", "fish" } };
        groceries[2][1] = "eggs";
        for (String[] foods : groceries) {
            for (String food : foods) {
                System.out.print(food + " ");
            }
            System.out.println();
        }
        char[][] telephone = { { '1', '2', '3' },
                { '4', '5', '6' },
                { '7', '8', '9' },
                { '*', '0', '#' } };
        for (char[] row : telephone) {
            for (char number : row) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}