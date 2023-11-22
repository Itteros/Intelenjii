package com.itteros.oop.task1;

public class TimeIntervalRunner {

    public static void main(String[] args) {
        TimeInterval timeInterval = new TimeInterval(55,24,5);
        System.out.println(timeInterval.totalSeconds());

        TimeInterval timeInterval1 = new TimeInterval(timeInterval.totalSeconds());
        System.out.println(timeInterval1.totalSeconds());
        timeInterval1.print();

        TimeInterval sumIntervals = timeInterval.sum(timeInterval1);
        sumIntervals.print();
    }
}
