package com.ua.robot.Lesson23;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        List<String> lastNamesList = List.of("Ivanovenko", "Petrenko", "Shevchuk", "Antoniuk", "Skliarenko", "Antoniuk", "Ivanovenko", "Petrenko", "Shevchuk", "Borodai", "Skliarenko", "Antoniuk", "Ivanovenko", "Petrenko", "Shevchuk", "Borodai", "Skliarenko", "Antoniuk", "Skliarenko", "Antoniuk");
        System.out.println(lastNamesList);
        Map<String, Long> lastNamesMap = lastNamesList.stream()
                .collect(Collectors.groupingBy(String::valueOf, Collectors.counting()));
        System.out.println(lastNamesMap);
        System.out.println();

        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(5));
        }
        System.out.println(numbers);

        var sum = numbers.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println("The sum of numbers is " + sum);

    }

}
