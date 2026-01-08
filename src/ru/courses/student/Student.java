package ru.courses.student;

import java.util.Arrays;

public class Student {
    private String name;
    private int[] grades;
    private int gradeCount;  // количество оценок

    // Конструктор только с именем
    public Student(String name) {
        this.name = name;
        this.grades = new int[10];  // начальная ёмкость
        this.gradeCount = 0;
    }

    // Конструктор с именем и оценками
    public Student(String name, int... grades) {
        this.name = name;
        this.grades = new int[grades.length + 10];  // с запасом
        this.gradeCount = 0;

        for (int i = 0; i < grades.length; i++) {
            addGrade(grades[i]);
        }
    }

    // Добавление оценки
    public void addGrade(int grade) {
        if (grade < 2 || grade > 5) {
            throw new IllegalArgumentException("Оценка должна быть от 2 до 5, получено: " + grade);
        }

              if (gradeCount == grades.length) {
            grades = Arrays.copyOf(grades, grades.length * 2);
        }

        grades[gradeCount] = grade;
        gradeCount++;
    }

    // Получение копии всех оценок
    public int[] getGrades() {
        return Arrays.copyOf(grades, gradeCount);
    }

    // Получение имени
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        int[] actualGrades = getGrades();
        return name + ": " + Arrays.toString(actualGrades);
    }
}