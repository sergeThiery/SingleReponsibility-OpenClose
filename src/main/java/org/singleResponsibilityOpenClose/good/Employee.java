package org.example;

/**
 * Represents an employee with different employee types and
 * corresponding salary calculation methods.
 *
 * This class demonstrates the Open/Closed Principle and the
 * Single Responsibility Principle.
 */
public abstract class Employee {

    /**
     * The name of the employee
     */
    protected String name;

    /**
     * The ID of the employee
     */
    protected String employeeId;

    public Employee(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    /**
     * Calculates the salary for the employee.
     * The implementation varies depending on the employee type.
     *
     * @return The calculated salary amount.
     */
    public abstract double calculateSalary();
}
