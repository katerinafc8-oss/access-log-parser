package ru.courses.math;

public class SumAll {

    public static double sumAll(Number... numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i].doubleValue();
        }
        return sum;
    }
    }

