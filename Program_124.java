public class Program_124 {
    public static void main(String[] args) {
        String text = "W3Schools was founded in 1998";
        int count = 0;
        for (char c : text.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        System.out.println("Digits: " + count);
    }
}