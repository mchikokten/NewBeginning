package com.ua.robot.Lesson7;

public class Main {
    public static void main(String[] args) {
        int a = getNumberTwoCubed(8);
        System.out.println(a);
        printStars(5);
        printSymbolNumberOfTimes(7, "#");
    }

    static int getNumberTwoCubed(int i) {
        return i * i * i;
    }

    static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    static void printSymbolNumberOfTimes(int number, String symbol) {
        for (int i = 0; i < number; i++) {
            System.out.print(symbol);
        }
    }
}
