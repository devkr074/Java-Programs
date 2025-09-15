public class Program_41 {
    public static void main(String[] args) {
        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        int[] numbers = { 10, 20, 30, 40 };
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        for (String car : cars) {
            System.out.println(car);
        }
        String[] seats = { "Jenny", "Liam", "Angie", "Bo" };
        for (int i = 0; i < seats.length; i++) {
            System.out.println("Seat number " + i + " is taken by " + seats[i]);
        }
    }
}