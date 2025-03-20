// String Methods in Java

public class Program_13 {
    public static void main(String[] args) {
        String name = "Bro Code";
        int length = name.length();
        System.out.println(length);
        char letter = name.charAt(0);
        System.out.println(letter);
        int index = name.indexOf(" ");
        System.out.println(index);
        int lastIndex = name.lastIndexOf("o");
        System.out.println(lastIndex);
        name = name.toUpperCase();
        name = name.toLowerCase();
        name = name.trim();
        name = name.replace("o", "a");
        if (name.isEmpty()) {
            System.out.println("Your name is empty");
        } else {
            System.out.println("Hello " + name);
        }
        if (name.contains(" ")) {
            System.out.println("Your name contains a space");
        } else {
            System.out.println("Your name DOESN'T contain any spaces");
        }
        if (name.equalsIgnoreCase("password")) {
            System.out.println("Your name can't be password");
        } else {
            System.out.println("Hello " + name);
        }
    }
}