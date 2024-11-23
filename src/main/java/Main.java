package org.example;

public class Main {

    public static void main(String[] args){
        Employee_Bad employeeBad = new Employee_Bad("Tech", "2AD", TypeEmployee.CONTRACTUAL);
        employeeBad.calculateSalary();
    }
}
