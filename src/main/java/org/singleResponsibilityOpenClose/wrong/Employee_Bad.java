package org.example;

/**
 * Represents an employee with different employee types and
 * corresponding salary calculation methods.
 *
 * This class violates the Single Responsibility Principle (SRP)
 * and the Open/Closed Principle, as it handles multiple
 * responsibilities and requires modification to add new
 * employee types.
 */
public class Employee_Bad {

    /**
     * Name of the Employee
     */
    private String name;

    /**
     * The ID of the Employee
     */
    private String employeeId;

    /**
     * The base salary
     */
    private double baseSalary;

    /**
     * Bonus of the employee
     */
    private double bonus;

    /**
     * The hourly rate that the employee has agreed
     */
    private double hourlyRate;

    /**
     * The number of hours that the employee has worked
     */
    private int hoursWorked;

    /**
     * The daily Rate
     */
    private double dailyRate;

    private TypeEmployee employeeType;

    /**
     * The number of days the employee has worked
     */
    private int daysWorked;

    public Employee_Bad(String name, String employeeId, TypeEmployee typeEmployee) {
        this.name = name;
        this.employeeId = employeeId;
        this.employeeType = typeEmployee;
    }

    public double calculateSalary() {
        if (employeeType.equals(TypeEmployee.PERMANENT)) {
            System.out.println("Permanent employee's salary");
            return baseSalary + bonus - calculateTaxes();
        } else if (employeeType.equals(TypeEmployee.CONTRACTUAL)) {
            System.out.println("Contractual employee's salary");
            return hourlyRate * hoursWorked - calculateSocialSecurity();
        } else if (employeeType.equals(TypeEmployee.DAILY)) {
            System.out.println("Daily employee's salary");
            return dailyRate * daysWorked;
        } else {
            throw new IllegalArgumentException("Unknown employee type");
        }
    }

    /**
     * Calculates the income tax for the employee.
     *
     * This method should implement the actual tax calculation logic
     * based on the tax laws and regulations applicable in Cameroon.
     *
     * @return The calculated income tax amount.
     */
    private double calculateTaxes() {
        // Implement your tax calculation logic here
        // This will depend on the specific tax laws and regulations
        // applicable to your context (e.g., Cameroon).

        // Example: simple progressive tax calculation
        if (baseSalary <= 10000) {
            return baseSalary * 0.1; // 10% tax for low income
        } else if (baseSalary <= 50000) {
            return baseSalary * 0.2; // 20% tax for medium income
        } else {
            return baseSalary * 0.3; // 30% tax for high income
        }
    }

    /**
     * Calculates the social security contributions for the employee.
     *
     * This method should implement the actual calculation logic
     * based on the social security laws and regulations applicable
     * in Cameroon.
     *
     * @return The calculated social security contribution amount.
     */
    private double calculateSocialSecurity() {
        // TODO: Implement the actual social security calculation logic for Cameroon.
        // This is a placeholder for the actual implementation.

        // Example: simple calculation based on a fixed percentage of the hourly rate
        return hourlyRate * hoursWorked * 0.05; // 5% social security contribution
    }

}
