package com.ua.robot.Lesson14;

public class Main {
    public static void main(String[] args) {

        Person st1 = new Student("Iryna", "Gulko", "Java", 95);
        Person professor = new Professor("Petro", "Vakulenko", "911", "PetroVaculenko@gmail.com");

    st1.printPersonInformation();
    System.out.println();
    professor.printPersonInformation();
    }
}
