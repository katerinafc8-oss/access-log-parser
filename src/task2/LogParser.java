package task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogParser {

    public static List<LogEntry> getLogEntryList(String filePath) {
        List<LogEntry> list = new ArrayList<>();
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            while ((line = reader.readLine()) != null) {
                list.add(parseLine(line));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    private static final Pattern LOG_PATTERN = Pattern.compile(
            "^(\\S+) " +                           // IP-адрес
                    "(\\S+) " +                             // Первый пропущенный параметр (ident)
                    "(\\S+) " +                             // Второй пропущенный параметр (authuser)
                    "\\[([^\\]]+)\\] " +                   // Дата и время
                    "\"([A-Z]+) " +                        // HTTP метод
                    "([^\"]*) " +                          // Путь запроса
                    "[^\"]*\" " +                          // HTTP версия
                    "(\\d+) " +                            // Код ответа
                    "(\\S+) " +                            // Размер ответа
                    "\"([^\"]*)\" " +                      // Referer
                    "\"([^\"]*)\"",                        // User-Agent
            Pattern.MULTILINE
    );

    private static LogEntry parseLine(String logLine) {
        Matcher matcher = LOG_PATTERN.matcher(logLine);
        if (matcher.find()) {
            return new LogEntry(
                    matcher.group(1),  // IP-адрес
                    matcher.group(2),  // Ident (обычно "-")
                    matcher.group(3),  // AuthUser (обычно "-")
                    matcher.group(4),  // Timestamp
                    matcher.group(5),  // HTTP метод
                    matcher.group(6),  // Путь
                    matcher.group(7),  // Код ответа
                    matcher.group(8),  // Размер ответа
                    matcher.group(9),  // Referer
                    matcher.group(10)  // User-Agent
            );
        }
        return null;
    }
}