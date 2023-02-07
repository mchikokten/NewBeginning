package com.ua.robot.Lesson9;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int length = 5;
        int matrix[][] = new int[length][length];
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        getSumOfDiagonals(matrix, length);
    }

    static void getSumOfDiagonals(int[][] matrix, int length) {
        int sumPrincipal = 0;
        int sumSecondary = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    sumPrincipal += matrix[i][j];
                }
                if ((i + j) == (length - 1)) {
                    sumSecondary += matrix[i][j];
                }
            }
        }
        System.out.println("Sum of principal diagonal: " + sumPrincipal);
        System.out.println("Sum of secondary diagonal: " + sumSecondary);
    }
}




