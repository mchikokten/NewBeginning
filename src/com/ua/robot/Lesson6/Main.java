package com.ua.robot.Lesson6;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int k = 1; k < 100; k++) {
            if (k % 2 == 0) {
                System.out.print(k + " ");
            }
        }
        System.out.println();
        int num = 7;
        int factorial = 1;
        for (int l = num; l > 0; l--) {
            factorial = factorial * l;
        }
        System.out.println("Factorial is: " + factorial);

        System.out.println();
        int n = 100;
        int firstNumber = 0;
        int secondNumber = 1;
        System.out.println("Fibonacci Series Up to " + n + ": ");
        while (firstNumber <= n) {
            System.out.print(firstNumber + ", ");
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }
}


