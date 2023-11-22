package com.itteros;
import java.util.Scanner;
public class homework {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1.Метод distance\n2.Метод hypotenuse\n3.Метод printSquare");
        System.out.println("4.Метод lastDigit\n5.Метод cylinderSurfaceArea\n6.Метод triangleArea");
        System.out.print("Введіть номер завдання:");
        int number = scan.nextInt();
        scan.close();
        if (number == 1) {
            int x1 =10 ;
            int y1 =2 ;
            int x2 =3 ;
            int y2 =15;
            double result = distance(x1,y1,x2,y2);
            System.out.println(result);
        } else if (number == 2) {
            System.out.println("Введіть катет а:");
            int a = scan.nextInt();
            System.out.println("Введіть катет b:");
            int b = scan.nextInt();
            double result1 = hypotenuse(a,b);
            System.out.println("Довжина гіпотенузи: " + result1);
        } else if (number == 3) {
            System.out.println("Введіть мінімальне число:");
            int min = scan.nextInt();
            System.out.println("Введіть максимальне число:");
            int max = scan.nextInt();
            printSquare(min,max);
        } else if (number == 4) {
            int a = -947;
            int res = lastDigit(a);
            System.out.println("Last digit of an integer: " + res);
        } else if (number == 5) {
            double r = 3;
            double h = 4.5;
            double res = cylinderSurfaceArea(r,h);
            System.out.println("Surface area: " + res);
        } else if (number == 6) {
            int a = 8;
            double b = 5.2;
            double c = 7.1;
            double res = triangleArea(a,b,c);
            System.out.println("Area of a triangle: " + res);
        }
    }
    public static double distance(int x1, int y1, int x2, int y2) {
        double d = Math.pow((x2-x1),2) + Math.pow((y2 - y1), 2);
        return Math.sqrt(d);
    }
    public static double hypotenuse(int a, int b) {
        double c = Math.pow(a,2) + Math.pow(b,2);
        return Math.sqrt(c);
    }
    public static void printSquare(int min, int max) {
        int width = max - min + 1;

        for (int i = min; i <= max; i++) {
            for (int j = 0; j < width; j++) {
                int currentNum = min + (i - min + j) % width;
                System.out.print(currentNum + " ");
            }
            System.out.println();
        }
    }
    public static int lastDigit(int a) {
        return a % 10;
    }
    public static double cylinderSurfaceArea(double r, double h) {
        final double PI = Math.PI;
        double surfaceArea = 2*PI*Math.pow(r,2) + 2*PI*r*h;
        return surfaceArea;
    }
    public static double triangleArea (int a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt((s*(s-a)*(s-b)*(s-c)));
    }

}
