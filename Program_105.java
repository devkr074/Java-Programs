import java.util.Scanner;

public class Program_105 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter number of subjects: ");
        int subjectCount = scanner.nextInt();
        double[] marks = new double[subjectCount];
        double sum = 0;
        for (int i = 0; i < subjectCount; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
            sum += marks[i];
        }
        double average = sum / subjectCount;
        System.out.println("\nStudent Report");
        System.out.println("Name: " + name);
        System.out.println("Total Subjects: " + subjectCount);
        System.out.println("Average Marks: " + average);
        if (average >= 90) {
            System.out.println("Grade: A+");
        } else if (average >= 75) {
            System.out.println("Grade: A");
        } else if (average >= 60) {
            System.out.println("Grade: B");
        } else if (average >= 40) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
        scanner.close();
    }
}