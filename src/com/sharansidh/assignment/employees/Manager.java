package com.sharansidh.assignment.employees;

public class Manager extends Employee{
    private String location;
    private String department;
    public Manager(String name, int empId, double salary,  String location, String department) {
        super(name, empId, salary);
        this.location = location;
        this.department = department;
    }
}
