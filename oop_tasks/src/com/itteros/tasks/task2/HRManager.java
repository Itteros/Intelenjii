package com.itteros.tasks.task2;

public class HRManager extends Employee {
    public HRManager(int salary) {
        super(salary);
    }
    void work() {
        System.out.println("\nManaging employees");
    }

    void addEmployee() {
        System.out.println("\nAdding new employee!");
    }
}
