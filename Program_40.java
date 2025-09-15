public class Program_40 {
    public static void main(String[] args) {
        String[] cars1 = { "Volvo", "BMW", "Ford", "Mazda" };
        cars1[0] = "Opel";
        System.out.println(cars1[0]);
        System.out.println(cars1.length);
        String[] cars2 = new String[4];
        cars2[0] = "Volvo";
        cars2[1] = "BMW";
        cars2[2] = "Ford";
        cars2[3] = "Mazda";
        System.out.println(cars2[0]);
        String[] cars3 = new String[] { "Volvo", "BMW", "Ford", "Mazda" };
        System.out.println(cars3);
    }
}