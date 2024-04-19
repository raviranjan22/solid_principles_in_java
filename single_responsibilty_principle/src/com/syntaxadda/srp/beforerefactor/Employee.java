package com.syntaxadda.srp.beforerefactor;
class Employee {
    private String name;
    private double salary;
    private int hoursWorked;

    public Employee(String name, double salary, int hoursWorked) {
        this.name = name;
        this.salary = salary;
        this.hoursWorked = hoursWorked;
    }

    // Method to calculate salary
    public double calculateSalary() {
        return salary * hoursWorked;
    }

    // Methods to manage employee information
    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    // Getters
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
