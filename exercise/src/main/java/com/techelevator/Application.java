package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {
    List <Department> departments = new ArrayList<>();
    List <Employee> employees = new ArrayList<>();
    Map<String, Project> projects = new HashMap<>();
    /**
     * The main entry point in the application
     * @param args
     */
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
        for (Department department : departments) {
            System.out.println(department.getName());
        }

        // create employees
        createEmployees();
        Employee deanJohnson = new Employee();
        Employee angieSmith = new Employee(2, "Angie", "Smith", "asmith@teams.com",
                engineering, "08/21/2020");
        Employee margaretThompson = new Employee(3, "Margaret", "Thompson", "mthompson@teams.com",
                 marketing, "08/21/2020");

        deanJohnson.setEmployeeId(1);
        deanJohnson.setFirstName("Dean");
        deanJohnson.setLastName("Johnson");
        deanJohnson.setEmail("djohnson@teams.com");
        deanJohnson.setSalary(60000);
        deanJohnson.setDepartment(engineering);
        deanJohnson.setHireDate("08/21/2020");

        employees.add(deanJohnson);
        employees.add(angieSmith);
        employees.add(margaretThompson);

        // give Angie a 10% raise, she is doing a great job!
        angieSmith.raiseSalary(10);

        // print all employees
        printEmployees();
        for (Employee employee : employees) {
            System.out.println(employee.getFullName() + " (" + employee.getSalary() + ") " + employee.getDepartment().getName());
        }


        // create the TEams project
        createTeamsProject();
        Project teams = new Project("TEams", "Project Management Software", "10/10/2020", "11/11/2020");

        teams.setTeamMembers(employees, engineering);

        projects.put(teams.getName(), teams);

        // create the Marketing Landing Page Project
        createLandingPageProject();
        Project marketingLandingPage = new Project("Marketing Landing Page", "Lead Capture Landing Page For Marketing",
                "10/10/2020", "10/17/2020");

        marketingLandingPage.setTeamMembers(employees, marketing);

        projects.put(marketingLandingPage.getName(), marketingLandingPage);

        // print each project name and the total number of employees on the project
        printProjectsReport();

        for (Map.Entry<String, Project> project : projects.entrySet()) {
            System.out.println(project.getKey() + ": " + project.getValue().getTeamMembers().size());
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
