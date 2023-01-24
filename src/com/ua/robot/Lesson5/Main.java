package com.ua.robot.Lesson5;

public class Main {
    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        if (a > b) {
            System.out.println("Greater number is " + a);
            System.out.println("Smaller number is " + b);
        } else if (a == b) {
            System.out.println("Numbers are equal");
        } else {
            System.out.println("Greater number is " + b);
            System.out.println("Smaller number is " + a);
        }

        if (a % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
