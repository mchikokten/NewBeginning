package com.ua.robot.Lesson14;

public abstract class Person {

    public Person(String info) {
        this.info = info;
    }

    private String info;

    public Person() {

    }

    public void printPersonInformation() {
        System.out.print(info);
    }


}
