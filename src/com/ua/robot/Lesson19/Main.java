package com.ua.robot.Lesson19;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Integer> hashSetList = new HashSet<>(1000);

        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            hashSetList.add(random.nextInt(50)+1);
        }

        Set<Integer> linkedHashSetList = new LinkedHashSet<>(1000);
        for (int i = 0; i < 1000; i++) {
            linkedHashSetList.add(random.nextInt(50)+1);
        }

        Set<Integer> treeSetList = new TreeSet<>();
        for (int i = 0; i < 1000; i++) {
            treeSetList.add(random.nextInt(50)+1);
        }

        System.out.println(hashSetList);
        System.out.println(linkedHashSetList);
        System.out.println(treeSetList);
    }
}
