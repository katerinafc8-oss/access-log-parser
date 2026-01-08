package ru.courses.geometry;

public class MeasurableClass {

    // Метод принимает набор объектов типа Measurable
    public static void printLengths(Measurable... objects) {
        System.out.println("=== Длины объектов ===");
        double totalLength = 0;

        for (int i = 0; i < objects.length; i++) {
            double length = objects[i].getLength();
            System.out.println((i + 1) + ". " + objects[i]);
            System.out.println("   Длина: " + length);
            totalLength += length;
        }

        System.out.println("\nОбщая длина всех объектов: " + totalLength);
    }
}
