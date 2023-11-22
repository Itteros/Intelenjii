package com.itteros.oop.lesson2;

public class ComputerRun {
    public static void main(String[] args) {
        int value = 5;
        Computer computer = new Computer();
        computer.printState();

        Computer computer2=new Computer(1050);
        computer2.printState();

        Computer computer3 = new Computer(10000,10000L);
        computer3.printState();
        computer3.load(true);
    }
}
