package com.ua.robot.Lesson11;

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck("BMW", 2020, "Auto");
        System.out.println(truck);

        PassengerCar passengerCar = new PassengerCar("Audi", 2021, 250);
        System.out.println(passengerCar);
    }
}
