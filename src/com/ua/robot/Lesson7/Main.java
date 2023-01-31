package com.ua.robot.Lesson7;

public class Main {
    public static void main(String[] args) {
        int a = GetNumberTwoCubed(8);
        System.out.println(a);
        PrintStars(5);
        PrintSymbolNumberOfTimes(7, "#");
    }

    static int GetNumberTwoCubed(int i) {
        return i * i * i;
    }

    static void PrintStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    static void PrintSymbolNumberOfTimes(int number, String symbol) {
        for (int i = 0; i < number; i++) {
            System.out.print(symbol);
        }
    }
}
