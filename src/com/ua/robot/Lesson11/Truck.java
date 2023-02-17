package com.ua.robot.Lesson11;

public class Truck extends Car {

    private String trasmissionType;

    @Override
    public String toString() {
        return "Truck";
    }

    public Truck(String model, int year, String trasmissionType){
            super(model, year);
            this.trasmissionType = trasmissionType;
        }
    }
