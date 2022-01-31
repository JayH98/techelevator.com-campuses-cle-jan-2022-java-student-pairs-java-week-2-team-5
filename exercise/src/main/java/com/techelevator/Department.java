package com.techelevator;

public class Department {
    private int departmentId;
    private String name;

    public Department(int departmentId, String name) {
        this.departmentId = departmentId;
        this.name = name;
    }

    public int getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return this.name;
    }

    public void setName() {
        this.name = name;
    }

}
