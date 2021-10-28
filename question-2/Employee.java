class Employee {

  int ssn;
  String firstName;
  String lastName;

  Employee(String firstName, String lastName, int ssn) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.ssn = ssn;
  }

  int getSSN() {
    return this.ssn;
  }

  String getFirstName() {
    return this.firstName;
  }

  String getLastName() {
    return this.lastName;
  }

  void setSSN(int ssn) {
    this.ssn = ssn;
  }

  void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  void setLastName(String lastName) {
    this.lastName = lastName;
  }

  void print() {
    System.out.println("Name : " + this.firstName + " " + this.lastName);
    System.out.println("SSN :" + this.ssn);
  }
}
