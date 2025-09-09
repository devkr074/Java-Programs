public class Program_18 {
    public static void main(String[] args) {
        String greeting = "Hello";
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());
        txt = "Hello World";
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate"));
        txt = "Hello";
        System.out.println(txt.charAt(0));
        System.out.println(txt.charAt(4));
        String txt1 = "Hello";
        String txt2 = "Hello";
        String txt3 = "Greetings";
        String txt4 = "Great things";
        System.out.println(txt1.equals(txt2));
        System.out.println(txt3.equals(txt4));
        txt = "   Hello World   ";
        System.out.println("Before: [" + txt + "]");
        System.out.println("After:  [" + txt.trim() + "]");
    }
}