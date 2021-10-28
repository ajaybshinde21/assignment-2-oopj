class SalariedEmployee extends Employee {

  private double salary;
  private int numberOfPayPeriods;
  private double deductions;

  SalariedEmployee(
    String firstName,
    String lastName,
    int ssn,
    double salary,
    int numberOfPayPeriods,
    double deductions
  ) {
    super(firstName, lastName, ssn);
    this.salary = salary;
    this.numberOfPayPeriods = numberOfPayPeriods;
    this.deductions = deductions;
  }

  double computeGrossPay() {
    return (this.salary / (double) this.numberOfPayPeriods);
  }

  double computeNetPay() {
    return computeGrossPay() - deductions;
  }

  double getSalary() {
    return computeNetPay();
  }

  void setSalary(double salary) {
    this.salary = salary;
  }

  void print() {
    System.out.println(
      "Name " + super.getFirstName() + " " + super.getLastName()
    );
    System.out.println("SSN : " + super.getSSN());
    System.out.println("salary : " + this.getSalary());
  }
}
