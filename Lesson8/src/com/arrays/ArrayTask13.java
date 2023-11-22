package com.arrays;

public class ArrayTask13 {
    public static void main(String[] args) {


        int[][] matrix = {
                {1, 2, 3},
                {4, 9, 6},
                {7, 8, 5}
        };

        int maxElement = matrix[0][0]; // Инициализируем максимальный элемент значением первого элемента массива

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] > maxElement) {
                    maxElement = matrix[row][col]; // Найден элемент больше текущего максимального
                }
            }
        }

        System.out.println("Наибольший элемент в двумерном массиве: " + maxElement);
    }
}