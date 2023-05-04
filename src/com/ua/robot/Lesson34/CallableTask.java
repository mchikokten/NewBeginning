package com.ua.robot.Lesson34;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallableTask implements Callable<String> {
    @Override
    public String call() throws Exception {
        int number = new Random().nextInt(100);
        return Thread.currentThread().getName() + " " + number;
    }
}
