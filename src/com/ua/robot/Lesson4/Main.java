package com.ua.robot.Lesson4;

public class Main {
    public static void main(String[] args) {
        String str = "Slava Ukraini";

        //method 1
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        //method 2
        String uppercase = str.toUpperCase();
        String lowercase = str.toLowerCase();
        System.out.println(uppercase);
        System.out.println(lowercase);

        int length = str.length();
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(length - 1));

    }
}
