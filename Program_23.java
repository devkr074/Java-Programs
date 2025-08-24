// Even numbers between 1 to 20

class Program_23 {
    public static void main(String args[]) {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}