// Polymorphism in Java (Employee Hierarchy)

abstract class Employee {
  String name;
  int age;

  public Employee(String name, int age) {
    this.name = name;
    this.age = age;
  }

  abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
  double monthlySalary;

  public FullTimeEmployee(String name, int age, double monthlySalary) {
    super(name, age);
    this.monthlySalary = monthlySalary;
  }

  @Override
  double calculateSalary() {
    return monthlySalary;
  }
}

class PartTimeEmployee extends Employee {
  double hourlyRate;
  int hoursWorked;

  public PartTimeEmployee(String name, int age, double hourlyRate, int hoursWorked) {
    super(name, age);
    this.hourlyRate = hourlyRate;
    this.hoursWorked = hoursWorked;
  }

  @Override
  double calculateSalary() {
    return hourlyRate * hoursWorked;
  }
}

public class Program_40 {
  public static void main(String[] args) {
    Employee fullTimeEmployee = new FullTimeEmployee("Alice", 30, 3000);
    Employee partTimeEmployee = new PartTimeEmployee("Bob", 25, 20, 80);
    System.out.println("Full-Time Employee Salary: " + fullTimeEmployee.calculateSalary());
    System.out.println("Part-Time Employee Salary: " + partTimeEmployee.calculateSalary());
  }
}