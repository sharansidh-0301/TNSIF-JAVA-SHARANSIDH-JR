package com.sharansidh.assignment.employees;

public class Developer extends Employee {

    private String role;
    int experience;
    public Developer(String name, int empId, double salary, int experience, String role) {
        super(name, empId, salary);
        this.experience = experience;
        this.role = role;
    }
}
