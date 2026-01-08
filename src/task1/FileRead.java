package task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) {
        analyzeFile("src/resources/access.log");
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

            if (maxLength >= 1024) {
                throw new LengthException("Длина самой длинной строки больше или равна 1024");
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
}
