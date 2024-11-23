package org.example;

/**
 * Represents a permanent employee with a base salary and bonus.
 */
public class PermanentEmployee extends Employee {

    /**
     * The base salary of the employee
     */
    private double baseSalary;

    /**
     * The bonus of the employee
     */
    private double bonus;

    public PermanentEmployee(String name, String employeeId) {
        super(name, employeeId);
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus - calculateTaxes();
    }

    /**
     * Calculates the income tax for a permanent employee.
     *
     * @return The calculated income tax amount.
     */
    private double calculateTaxes() {
        // TODO: Implement the actual tax calculation logic.
        // This is a placeholder for the actual implementation.
        return 0;
    }
}
