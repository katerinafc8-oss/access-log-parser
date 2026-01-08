package ru.courses.exceptions.task1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

    public static void main(String[] args) {
        analyzeFile("src/ru/courses/exceptions/task1/access.log");
//        String file = getFile("src/ru/courses/exceptions/task1/access.log");
//        System.out.println("!!! " + file);
    }

    public static void analyzeFile(String filePath) {
        int totalLines = 0;
        int maxLength = 0;
        int minLength = Integer.MAX_VALUE;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                totalLines++;
                int lineLength = line.length();

                if (lineLength > maxLength) {
                    maxLength = lineLength;
                }

                if (lineLength < minLength) {
                    minLength = lineLength;
                }
            }

            // Обработка случая пустого файла
            if (totalLines == 0) {
                minLength = 0;
            }

            // Вывод результатов
            System.out.println("=== Анализ файла access.log ===");
            System.out.println("Общее количество строк: " + totalLines);
            System.out.println("Длина самой длинной строки: " + maxLength);
            System.out.println("Длина самой короткой строки: " + minLength);

        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
            e.printStackTrace();
        }
    }


    public static String getFile(String path) {
        StringBuilder lineAdd = new StringBuilder();
        FileReader fileReader;
        try {
            fileReader = new FileReader(path);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try (BufferedReader reader = new BufferedReader(fileReader)) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineAdd.append(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lineAdd.toString();
    }
}
