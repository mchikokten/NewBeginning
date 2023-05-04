package com.ua.robot.Lesson34;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<Callable<String>> callables = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            callables.add(new CallableTask());
        }

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        List<Future<String>> futures = executorService.invokeAll(callables);
        System.out.println("Start");
        for (Future<String> future : futures) {
            System.out.println(future.get());
        }
        System.out.println("End");


    }
}
