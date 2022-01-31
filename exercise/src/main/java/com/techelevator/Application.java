package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {

    /**
     * The main entry point in the application
     * @param args
     */

    List<Department> departments = new ArrayList<Department>();
    List<Employee> employees = new ArrayList<Employee>();
    Map<String, Project> projects = new HashMap<String, Project>();



    public static void main(String[] args) {
        Application app = new Application();
        app.run();
    }

    private void run() {
        // create some departments
        createDepartments();

        Department marketing = new Department(1, "Marketing");
        Department sales = new Department(2, "Sales");
        Department engineering = new Department(3, "Engineering");

        departments.add(marketing);
        departments.add(sales);
        departments.add(engineering);

        // print each department by name
        printDepartments();

        for(Department department : departments) {
            System.out.println(department.getName());
        }

        // create employees
        createEmployees();

        Employee deanJohnson = new Employee();
        Employee angieSmith = new Employee(2, "Angie", "Smith",
                "asmith@)teams.com", 60000.00, engineering, "08/21/2020");
        Employee margaretThompson = new Employee(3, "Margaret", "Thompson",
                "mthompson@teams.com", 60000.00, marketing, "08/21/2020");

        deanJohnson.setEmployeeId(1); deanJohnson.setFirstName("Dean"); deanJohnson.setLastName("Johnson");
        deanJohnson.setEmail("djohnson@teams.com"); deanJohnson.setSalary(60000.00); deanJohnson.setDepartment(engineering);
        deanJohnson.setHireDate("08/21/2020");

        employees.add(deanJohnson);
        employees.add(angieSmith);
        employees.add(margaretThompson);

        // give Angie a 10% raise, she i2s doing a great job!

        angieSmith.raiseSalary(0.10);

        // print all employees
        printEmployees();

        for(Employee employee : employees) {
            System.out.println(employee.getFullName() + " (" + employee.getSalary() + ") " + employee.getDepartment().getName());
        }

        // create the TEams project
        createTeamsProject();

        Project teams = new Project("TEams", "Project Management Software","10/10/2020", "11/10/2020");
        teams.setTeamMembers(employees, engineering);


        projects.put("TEams", teams);

        // create the Marketing Landing Page Project
        createLandingPageProject();

        Project marketingLandingPage = new Project("Marketing Landing Page", "Lead Capture Landing Page for Marketing",
                "10/10/2020", "10/17/2020");

        marketingLandingPage.setTeamMembers(employees, marketing);

        projects.put("Marketing Landing Page", marketingLandingPage);


        // print each project name and the total number of employees on the project
        printProjectsReport();

        for(Map.Entry<String, Project> project : projects.entrySet()) {
            System.out.println(project.getKey() + ":" + project.getValue().getTeamMembers().size());
        }
    }

    /**
     * Create departments and add them to the collection of departments
     */
    private void createDepartments() {
    }

    /**
     * Print out each department in the collection.
     */
    private void printDepartments() {
        System.out.println("------------- DEPARTMENTS ------------------------------");

    }

    /**
     * Create employees and add them to the collection of employees
     */
    private void createEmployees() {

    }

    /**
     * Print out each employee in the collection.
     */
    private void printEmployees() {
        System.out.println("\n------------- EMPLOYEES ------------------------------");

    }

    /**
     * Create the 'TEams' project.
     */
    private void createTeamsProject() {

    }

    /**
     * Create the 'Marketing Landing Page' project.
     */
    private void createLandingPageProject() {

    }

    /**
     * Print out each project in the collection.
     */
    private void printProjectsReport() {
        System.out.println("\n------------- PROJECTS ------------------------------");

    }

}

