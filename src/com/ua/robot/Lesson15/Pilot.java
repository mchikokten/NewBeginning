package com.ua.robot.Lesson15;

public class Pilot extends Human implements ToFly {

    @Override
    public void toFly() {
        System.out.println("Pilot is flying");
    }
}
