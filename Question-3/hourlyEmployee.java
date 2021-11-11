import java.util.Scanner;

class HourlyEmployee extends Employee {

  private double hourlyRate;
  private double salary;
  private int numberOfHoursWorked;
  private double deductions;

  HourlyEmployee(
    String firstName,
    String lastName,
    int ssn,
    double salary,
    int numberOfHoursWorked,
    double hourlyRate,
    double deductions
  ) {
    super(firstName, lastName, ssn);
    this.salary = salary;
    this.hourlyRate = hourlyRate;
    this.numberOfHoursWorked = numberOfHoursWorked;
    this.deductions = deductions;
  }

  double computeGrossPay() {
    return hourlyRate * (double) getNumberOfHoursWorked();
  }

  double computeNetPay() {
    return computeGrossPay() - this.deductions;
  }

  double getSalary() {
    return computeNetPay();
  }

  void setSalary(double salary) {}

  void print() {
    System.out.println(
      "Name " + super.getFirstName() + " " + super.getLastName()
    );
    System.out.println("SSN : " + super.getSSN());
    System.out.println("salary : " + this.getSalary());
  }

  int getNumberOfHoursWorked() {
    return numberOfHoursWorked;
  }
}
