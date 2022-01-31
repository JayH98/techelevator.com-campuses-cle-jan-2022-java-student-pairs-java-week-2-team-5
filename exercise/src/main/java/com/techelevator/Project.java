package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Project {

    private String name;
    private String description;
    private String startDate;
    private String dueDate;
    private List<Employee> teamMembers = new ArrayList<Employee>();

    public Project(String name, String description, String startDate, String dueDate) {
        this.name = name; this.description = description; this.startDate = startDate; this.dueDate = dueDate;
    }

    public String getName() {return this.name;}

    public String getDescription() {return this.description;}

    public String getStartDate() {return this.startDate;}

    public String getDueDate() {return this.dueDate;}

    public List<Employee> getTeamMembers() {return this.teamMembers;}

    public void setName(String name) {this.name = name;}

    public void setDescription(String description) {this.description = description;}

    public void setStartDate(String startDate) {this.startDate = startDate;}

    public void setDueDate(String dueDate) {this.dueDate = dueDate;}

    public void setTeamMembers(List<Employee> teamMembers, Department department) {
        for(Employee teamMember : teamMembers) {
            if (department.getName().equalsIgnoreCase(teamMember.getDepartment().getName())){
                this.teamMembers.add(teamMember);
            }
        }
    }






}
