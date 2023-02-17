package com.ua.robot.Lesson11;

public class PassengerCar extends Car {

    private int speed;

    @Override
    public String toString() {
        return "PassengerCar";
    }

    public PassengerCar(String model, int year, int speed) {
        super(model, year);
        this.speed = speed;
    }
}