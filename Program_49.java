// Encapsulation in Java (Employee Class)

public class Program_49 {
  private String employeeId;
  private double salary;

  public Program_49(String employeeId, double salary) {
    this.employeeId = employeeId;
    setSalary(salary);
  }

  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    if (salary >= 0) {
      this.salary = salary;
    } else {
      System.out.println("Salary cannot be negative.");
    }
  }

  public void displayEmployeeInfo() {
    System.out.println("Employee ID: " + employeeId);
    System.out.println("Salary: " + salary);
  }

  public static void main(String[] args) {
    Program_49 employee = new Program_49("E12345", 5000);
    employee.displayEmployeeInfo();
    employee.setSalary(5500);
    employee.displayEmployeeInfo();
    employee.setSalary(-500);
  }
}