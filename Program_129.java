public class Program_129 {
    public static void main(String[] args) {
        String text = "   Java   ";
        String trimmed = text.trim();
        System.out.println(trimmed);
        text = "  Java \t is \n fun  ";
        String noSpaces = text.replaceAll("\\s+", "");
        System.out.println(noSpaces);
    }
}