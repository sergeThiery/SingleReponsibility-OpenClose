package org.example;

/**
 * Represents a daily employee with a daily rate and days worked.
 */
public class DailyEmployee extends Employee {
    private double dailyRate;
    private int daysWorked;

    public DailyEmployee(String name, String employeeId) {
        super(name, employeeId);
    }

    // Constructor, getters and setters

    @Override
    public double calculateSalary() {
        return dailyRate * daysWorked;
    }
}