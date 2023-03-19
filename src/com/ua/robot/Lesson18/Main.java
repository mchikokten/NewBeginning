package com.ua.robot.Lesson18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        List<Integer> list2000000Numbers = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 2000000; i++) {
            list2000000Numbers.add(random.nextInt(10));
        }

        List<Integer> list10Numbers = new ArrayList<>(10);
        Random random2 = new Random();
        for (int i = 0; i < 10; i++) {
            list10Numbers.add(random2.nextInt(10));
        }
        List<Student> listStudents = new LinkedList<>();



        listStudents.add(new Student("Petro", "Petrenko", "1"));
        listStudents.add(new Student("Ihor", "Kovalenko", "1"));
        listStudents.add(new Student("Inna", "Ivaniuk", "2"));
        listStudents.add(new Student("Svitlana", "Morozko", "2"));

        System.out.println(listStudents);
        }
}
