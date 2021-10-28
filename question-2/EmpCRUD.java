import java.util.Scanner;

public class EmpCRUD {

  public static void main(String[] args) {
    HourlyEmployee johnDoe = createHourlyEmployee();
    johnDoe.print();

    SalariedEmployee Jane = createSalariedEmployee();
    Jane.print();

    System.out.println("Program terminated");
  }

  public static HourlyEmployee createHourlyEmployee() {
    System.out.println("Enter details for hourly employee");
    Scanner input = new Scanner(System.in);

    System.out.print("Enter firstName :");
    String firstName = input.next();

    System.out.print("Enter lastName :");
    String lastName = input.next();

    System.out.print("Enter SSN :");
    int ssn = input.nextInt();

    System.out.println("Enter salary :");
    double salary = input.nextDouble();

    System.out.println("number of hours worked :");
    int numberOfHoursWorked = input.nextInt();

    System.out.print("hourlyRate :");
    double hourlyRate = input.nextDouble();

    System.out.println("deductions :");
    double deductions = input.nextDouble();
    HourlyEmployee emp = new HourlyEmployee(
      firstName,
      lastName,
      ssn,
      salary,
      numberOfHoursWorked,
      hourlyRate,
      deductions
    );
    return emp;
  }

  public static SalariedEmployee createSalariedEmployee() {
    System.out.println("Enter details for salaried employee");
    Scanner input = new Scanner(System.in);

    System.out.print("Enter firstName");
    String firstName = input.next();

    System.out.print("Enter lastName");
    String lastName = input.next();

    System.out.print("Enter SSN");
    int ssn = input.nextInt();

    System.out.println("Enter salary");
    double salary = input.nextDouble();

    System.out.print("number of pay periods :");
    int numberOfPayPeriods = input.nextInt();

    System.out.println("deductions :");
    double deductions = input.nextDouble();
    SalariedEmployee emp = new SalariedEmployee(
      firstName,
      lastName,
      ssn,
      salary,
      numberOfPayPeriods,
      deductions
    );

    return emp;
  }
}
