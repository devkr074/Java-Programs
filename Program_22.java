// Sum of first 10 natural numbers

class Program_22 {
    public static void main(String args[]) {
        int sum = 0;
        int i = 1;
        do {
            sum += i;
            i++;
        } while (i <= 10);
        System.out.println("Sum of first 10 natural numbers is: " + sum);
    }
}