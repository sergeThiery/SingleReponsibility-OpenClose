package org.example;

/**
 * Represents a contract employee with an hourly rate and hours worked.
 */
public class ContractEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String name, String employeeId) {
        super(name, employeeId);
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked - calculateSocialSecurity();
    }

    /**
     * Calculates the social security contributions for a contract employee.
     *
     * @return The calculated social security contribution amount.
     */
    private double calculateSocialSecurity() {
        // TODO: Implement the actual social security calculation logic.
        // This is a placeholder for the actual implementation.
        return 0;
    }
}
