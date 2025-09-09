public class Program_16 {
    public static void main(String[] args) {
        int myInt1 = 9;
        double myDouble1 = myInt1;
        System.out.println(myInt1);
        System.out.println(myDouble1);
        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble2;
        System.out.println(myDouble2);
        System.out.println(myInt2);
        int maxScore = 500;
        int userScore = 423;
        double percentage = (double) userScore / maxScore * 100.0d;
        System.out.println("User's percentage is " + percentage);
    }
}