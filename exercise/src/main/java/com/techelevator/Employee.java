package com.techelevator;

public class Employee {

    private long employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private double salary;
    private Department department;
    private String hireDate;

    public Employee(long employeeId, String firstName, String lastName,
                    String email, double salary, Department department, String hireDate) {
        this.employeeId = employeeId; this. firstName = firstName; this.lastName = lastName;
        this.email = email; this.salary = salary; this.department = department; this.hireDate = hireDate;
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
        return salary;
    }

    public Department getDepartment() {
        return department;
    }

    public String getHireDate() {
        return hireDate;
    }

    //Step Two: Create the Employee class
    //Create a new class called Employee.java with the following requirements.
    //
    //Instance variables
    //Name	Type	Getter	Setter
    //employeeId	long	x	x
    //firstName	String	x	x
    //lastName	String	x	x
    //email	String	x	x
    //salary	double	x	x
    //department	Department	x	x
    //hireDate	String	x	x
    //Static constants
    //The default starting salary for all employees is $60,000 and is stored in a static constant variable of type double.
    //
    //Constructors
    //Employee needs two constructors.
    //
    //The first one accepts all the arguments needed to create a new Employee: employeeID, firstName, lastName, email, department, and hireDate.
    //
    //Note: The first constructor doesn't include a double argument for the salary. Make sure to initialize each employees' salary to the static constant you created.
    //
    //The second constructor is a no-argument constructor. This constructor allows you to create your Employee objects in multiple ways.
    //
    //Methods
    //Method Name	Description
    //getFullName()	A derived property that returns the employee's full name in the following format: "Last, First"
    //raiseSalary(double percent)	A method that raises the employee's salary by x percent




}
