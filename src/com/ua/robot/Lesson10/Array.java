package com.ua.robot.Lesson10;

import java.util.Random;

public class Array {

    private int[] array;
    private int length;
    private int maxValue;

    public Array(int length, int maxValue) {
        this.length = length;
        this.maxValue = maxValue;
        array = new int[this.length];
    }

    public int getLength() { return length; }

    public void setLength(int length) {
        this.length = length;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public void fillArrayWithRandomNumbers() {
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(maxValue) + 1;
        }
    }

    public void printArray() {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public void sortArrayFromMinToMax() {
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public void sortArrayFromMaxToMin() {
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }


}
