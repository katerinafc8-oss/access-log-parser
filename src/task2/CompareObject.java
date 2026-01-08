package task2;

import task1.LengthException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import static task2.LogParser.getLogEntryList;

public class CompareObject {
    public static void main(String[] args) {
        String path = "src/resources/access.log";
        analyzeFile(path);
        List<LogEntry> logEntryList = getLogEntryList(path);
        int size = logEntryList.size();
        int googleBotCount = getCountBot(logEntryList, "googlebot");
        int yandexBotCount = getCountBot(logEntryList, "yandexbot");
        double googleBot = shareRequest(googleBotCount, size);
        double yandexBot = shareRequest(yandexBotCount, size);
        System.out.println("количество строк googleBot: " + googleBotCount);
        System.out.println("количество строк yandexBot: " + yandexBotCount);
        System.out.println("доля запросов от YandexBoBot " + yandexBot);
        System.out.println("доля запросов от GoogleBot " + googleBot);
    }

    private static void analyzeFile(String filePath) {
        int totalLines = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                totalLines++;
                int lineLength = line.length();

                if (lineLength >= 1024) {
                    throw new LengthException("Длина строки больше или равна 1024");
                }
            }

            // Вывод результатов
            System.out.println("=== Анализ файла access.log ===");
            System.out.println("Общее количество строк: " + totalLines);

        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static int getCountBot(List<LogEntry> logEntryList, String bot) {
        int size = logEntryList.size();
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (logEntryList.get(i).getUserAgent().toLowerCase().contains(bot)) {
                count++;
            }
        }
        return count;
    }

    private static double shareRequest(int count, int size) {
        return (double) count / size * 100;
    }
}
