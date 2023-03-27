package com.ua.robot.Lesson22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> listStudents = new ArrayList<>();

        listStudents.add(new Student("Ivanovenko", "95"));
        listStudents.add(new Student("Petrenko", "78"));
        listStudents.add(new Student("Shevchuk", "65"));
        listStudents.add(new Student("Borodai", "88"));
        listStudents.add(new Student("Skliarenko", "63"));
        listStudents.add(new Student("Antoniuk", "80"));

        System.out.println(listStudents);

        Collections.sort(listStudents, Comparator.comparing(Student::getLastname));
        System.out.println(listStudents);

        Collections.sort(listStudents, Comparator.comparing(Student::getAverageScore));
        System.out.println(listStudents);


    }
}
