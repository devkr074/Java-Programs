// Class in Java (Student Class)

public class Program_30 {
  public static void main(String[] args) {
    Student student = new Student("John", 101);
    student.displayDetails();
    System.out.println("Grade: " + student.calculateGrade(85));
  }
}

class Student {
  String name;
  int rollNumber;

  public Student(String name, int rollNumber) {
    this.name = name;
    this.rollNumber = rollNumber;
  }

  void displayDetails() {
    System.out.println("Name: " + name);
    System.out.println("Roll Number: " + rollNumber);
  }

  String calculateGrade(int marks) {
    if (marks >= 90) {
      return "A";
    } else if (marks >= 80) {
      return "B";
    } else if (marks >= 70) {
      return "C";
    } else if (marks >= 60) {
      return "D";
    } else {
      return "F";
    }
  }
}