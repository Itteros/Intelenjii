package com.itteros.tasks.task2;

public class Employee {
    private int salary;
    public Employee (int salary) {
        this.salary=salary;
    }

    void work() {
        System.out.println("working as an employee!");
    }

    int getSalary() {
        return salary;
    }
}
