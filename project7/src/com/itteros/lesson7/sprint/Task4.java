package com.itteros.lesson7.sprint;

public class Task4 {
    public static void main(String[] args) {
        int totalPopulation2023 , year, totalPopulation2024,totalPopulation2025,totalPopulation2026,totalPopulation2027,totalPopulation2028;
        int secondsPerYear = 365 * 24 * 60 * 60;
        int birthPerYear = secondsPerYear / 17;
        int deathPerYear = secondsPerYear / 7;
        int departurePerYear = secondsPerYear / 45;
        int populationChange = birthPerYear - departurePerYear - departurePerYear;
        totalPopulation2023 = 35234980;
        totalPopulation2024 = totalPopulation2023 + populationChange;
        totalPopulation2025 = totalPopulation2024 + populationChange;
        totalPopulation2026 = totalPopulation2025 + populationChange;
        totalPopulation2027 = totalPopulation2026 + populationChange;
        totalPopulation2028 = totalPopulation2027 + populationChange;
        System.out.println(totalPopulation2024);
        System.out.println(totalPopulation2025);
        System.out.println(totalPopulation2026);
        System.out.println(totalPopulation2027);
        System.out.println(totalPopulation2028);
    }
}
