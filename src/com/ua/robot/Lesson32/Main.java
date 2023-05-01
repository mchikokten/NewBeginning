package com.ua.robot.Lesson32;

public class Main {
    public static void main(String[] args) {
    ThreadRunnable threadRunnable = new ThreadRunnable();
    Thread thread1 = new Thread(threadRunnable);
    Thread thread2 = new Thread(threadRunnable);
    thread1.start();
    thread2.start();
    }
}
