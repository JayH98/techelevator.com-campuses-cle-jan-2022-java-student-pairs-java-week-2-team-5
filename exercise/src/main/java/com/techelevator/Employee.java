package com.techelevator;

public class Employee {

    private long employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private double salary = SALARY;
    private Department department;
    private String hireDate;

    public Employee(long employeeId, String firstName, String lastName,
                    String email, Department department, String hireDate) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
        this.hireDate = hireDate;
    }

    public Employee() {

    }


    public long getEmployeeId() {
        return this.employeeId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public double getSalary() {
        return this.salary;
    }

    public Department getDepartment() {
        return department;
    }

    public String getHireDate() {
        return hireDate;
    }

    public String getFullName() {
        return lastName + ", " + firstName;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public void raiseSalary(double percent) {
        this.salary = this.salary + (this.salary * (percent / 100));

    }

    private static final double SALARY = 60000;

}

