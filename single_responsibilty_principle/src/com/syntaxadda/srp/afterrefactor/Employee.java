package com.syntaxadda.srp.afterrefactor;

// Class responsible for managing employee information
class Employee {
    private String name;
    private double salary;
    private int hoursWorked;

    public Employee(String name, double salary, int hoursWorked) {
        this.name = name;
        this.salary = salary;
        this.hoursWorked = hoursWorked;
    }

    // Getters and setters for employee information
    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }
}

// Class responsible for calculating employee salary
class SalaryCalculator {
    // Method to calculate salary
    public double calculateSalary(Employee employee) {
        return employee.getSalary() * employee.getHoursWorked();
    }
}

