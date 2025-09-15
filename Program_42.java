public class Program_42 {
    public static void main(String[] args) {
        int ages1[] = { 20, 22, 18, 35, 48, 26, 87, 70 };
        float avg, sum = 0;
        int length1 = ages1.length;
        for (int age : ages1) {
            sum += age;
        }
        avg = sum / length1;
        System.out.println("The average age is: " + avg);
        int ages2[] = { 20, 22, 18, 35, 48, 26, 87, 70 };
        int length2 = ages2.length;
        int lowestAge = ages2[0];
        for (int age : ages2) {
            if (lowestAge > age) {
                lowestAge = age;
            }
        }
        System.out.println("The lowest age in the array is: " + lowestAge);
        int[] numbers = { 3, -1, 7, 0, 9 };
        for (int n : numbers) {
            if (n < 0) {
                continue;
            }
            if (n == 0) {
                break;
            }
            System.out.println(n);
        }
        String[] seats = { "Jenny", "Liam", "Angie", "Bo" };
        for (int i = 0; i < seats.length; i++) {
            System.out.println("Seat number " + i + " is taken by " + seats[i]);
        }
    }
}