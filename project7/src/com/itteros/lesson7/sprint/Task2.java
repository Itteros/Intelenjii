package com.itteros.lesson7.sprint;

public class Task2 {
    public static void main(String[] args) {
      float mile, km;
      km = 14;
      mile = (float) (km / 1.6);
      int hours, min, sec;
      hours = 0;
      min = 45;
      sec = 30;
      float time = hours + (float)min/60 + (float)sec/3600;
      float avgSpeed = mile/time;
      System.out.println("Average speed of the athlete " + avgSpeed + " mile per hour");
    }
}
