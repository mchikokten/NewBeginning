package com.ua.robot.Lesson8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int length = 10;
        int[] array = new int[length];
        fillArrayWithRandomNumbers(array, 10);
        printArray(array);
        System.out.println();
        sortArray(array);
        System.out.println();
        int lowestValue = array[0];
        int highestValue = array[length - 1];
        System.out.println("Lowest value in array is " + lowestValue);
        System.out.println();
        System.out.println("Highest value in array is " + highestValue);
        System.out.println();
        System.out.println("Array sum is " + getArraySum(array));
        System.out.println();
        System.out.println("Average value in array is " + getAverageValueInArray(array));
    }

    static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    static void fillArrayWithRandomNumbers(int[] array, int maxValue) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(maxValue) + 1;
        }
    }

    static void sortArray(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    static int getArraySum(int[] array) {
        int result = 1;
        for (int element : array) {
            result += element;
        }
        return result;
    }

    static int getAverageValueInArray(int[] array) {
        int sum = 1;
        int average = 1;
        for (int element : array) {
            sum += element;
            average = sum / array.length;
        }
        return average;
    }
}
