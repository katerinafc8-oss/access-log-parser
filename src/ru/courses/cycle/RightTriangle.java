package ru.courses.cycle;

public interface RightTriangle {
    public static void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            // Выводим пробелы (x - i штук)
            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }
            // Выводим звёздочки (i штук)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();  // Переход на новую строку
        }
    }
}
