package com.ua.robot.Lesson33;

import java.util.Random;

public class NumberGenerator extends Thread {

    private Random random;

    public NumberGenerator() {
        this.random = new Random();
    }

    @Override
    public void run() {
        while (true) {
            int number = random.nextInt(10) + 1;
            System.out.println(number);
            if (number == 5) {
                break;
            }
        }
    }
}
