package com.ua.robot.Lesson15;

public class Driver extends Human implements ToDrive {
    @Override
    public void toDrive() {
        System.out.println("Driver is driving");
    }
}
