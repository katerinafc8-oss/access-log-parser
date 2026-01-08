package ru.courses.math;

import static java.lang.Double.parseDouble;

public class Sum {

    public static void main(String[] args) {
        double sum = 0.0;



        for (String arg : args) {
            if (isNumeric(arg)) {
                double number = Double.parseDouble(arg);
                sum += number;
            }
            // Если не число - пропускаем (считаем за 0)
        }

        for (String arg : args) {
            try {
                double number = parseDouble(arg);
                sum += number;
            } catch (NumberFormatException e) {
                // Если строка не является числом, считаем за 0
                sum += 0;
            }
        }

        // Выводим результат
        System.out.println((int) sum);
    }

    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c) && c != '.' && c != '-') {
                return false;
            }
        }

        return true;
    }
}
