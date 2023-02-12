package com.ua.robot.Lesson10;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("John", "male", 30, "100");

        Professor professor1 = new Professor("Ben", "Mister", "911", "Ben@gmail.com");

        Array array = new Array(10, 20);
        array.fillArrayWithRandomNumbers();
        array.printArray();
        System.out.println();
        array.sortArrayFromMinToMax();
        array.printArray();
        System.out.println();
        array.sortArrayFromMaxToMin();
        array.printArray();
        System.out.println();

    }
}
