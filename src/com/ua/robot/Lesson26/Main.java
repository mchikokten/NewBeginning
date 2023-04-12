package com.ua.robot.Lesson26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws BelowZeroException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = scanner.nextInt();
        int doubleNumber = number * number;
        System.out.println(doubleNumber);
        if (number < 0) {
            throw new BelowZeroException();
        }
    }
}