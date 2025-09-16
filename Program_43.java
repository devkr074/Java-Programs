public class Program_43 {
    public static void main(String[] args) {
        int[][] myNumbers = { { 1, 4, 2 }, { 3, 6, 8 } };
        System.out.println(myNumbers[1][2]);
        System.out.println(myNumbers[0][1]);
        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]);
        System.out.println("Rows: " + myNumbers.length);
        System.out.println("Cols in row 0: " + myNumbers[0].length);
        System.out.println("Cols in row 1: " + myNumbers[1].length);
        for (int row = 0; row < myNumbers.length; row++) {
            for (int col = 0; col < myNumbers[row].length; col++) {
                System.out.println("myNumbers[" + row + "][" + col + "] = " + myNumbers[row][col]);
            }
        }
        for (int[] row : myNumbers) {
            for (int num : row) {
                System.out.println(num);
            }
        }
    }
}