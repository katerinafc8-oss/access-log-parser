package ru.courses.main;

import ru.courses.other.Sauce;
import ru.courses.other.Spiciness;
import ru.courses.task_enum.Op;

import static ru.courses.task_enum.Op.*;


public class Main {

    public static void main(String[] args) {
        System.out.println(op(1, 2, OP_1));
        System.out.println(op(1, 2, OP_2));
        System.out.println(op(1, 2, OP_3));
        System.out.println(op(1, 2, OP_4));

    }
        static int op ( int x, int y, Op op){
            switch (op) {
                case OP_1:
                    return x + y;
                case OP_2:
                    return x - y;
                case OP_3:
                    return x * y;
                case OP_4:
                    return x / y;
            }
            return 0;
        }
    }

//        Sauce sauce1 = new Sauce("Первый", Spiciness.VERY_SPICY);
//        Sauce sauce2 = new Sauce("Второй", Spiciness.SPICY);
//        Sauce sauce3 = new Sauce("Третий", Spiciness.NOT_SPICY);
//        System.out.println(sauce1);
//        System.out.println(sauce2);
//        System.out.println(sauce3);


    /*
    {
        Fractionnew fractionnew1 = new Fractionnew(3, 4);
        Fractionnew fractionnew2 = new Fractionnew(5, 4);
        Fractionnew fractionnew3 = new Fractionnew(5, 4);
        Fractionnew fractionnew4 = new Fractionnew(4, 5);

        System.out.println("Сравнение fractionnew1 и fractionnew2 " + fractionnew1.equals(fractionnew2));
        System.out.println("Сравнение fractionnew2 и fractionnew3 " + fractionnew2.equals(fractionnew3));
        System.out.println("Сравнение fractionnew3 и fractionnew4 " + fractionnew3.equals(fractionnew4));


        Fractionnew fractionnew5 = fractionnew1.clone();
        System.out.println("Сравнение fractionnew5 и fractionnew1 " + fractionnew5.equals(fractionnew1));
    }

}
*/
/*
public class Main {

    public static void main(String[] args) {
        Point point1 = new Point(3, 4);
        Point point2 = new Point(5, 10);
        Point point3 = new Point(3, 4);
        Point point4 = new Point(8, 16);

        PolyLine polyLine1 = new PolyLine(point1, point2,point3);
        PolyLine polyLine2 = new PolyLine(point1, point2,point3);
        PolyLine polyLine3 = new PolyLine(point4, point2,point3);
        System.out.println("Сравнение PolyLine 1 и PolyLine2 " + polyLine1.equals(polyLine2));
        System.out.println("Сравнение PolyLine 1 и PolyLine3 " + polyLine1.equals(polyLine3));

    }

}*/
/*
public class Main {

    public static void main(String[] args) {
        Point point1 = new Point(3, 4);
        Point point2 = new Point(5, 10);
        Point point3 = new Point(3, 4);
        Point point4 = new Point(8, 16);
        Point point5 = new Point(3, 4);
        Point point6 = new Point(5, 10);
        Line line1 = new Line(point1, point2);
        Line line2 = new Line(point3, point4);
        Line line3 = new Line(point5, point6);
        System.out.println("Сравнение Line 1 и Line2 " + line1.equals(line2));
        System.out.println("Сравнение Line 1 и Line3 " + line1.equals(line3));
        Line line4 = line2.clone();
        System.out.println("Сравнение Line 2 и Line4 " + line2.equals(line4));
    }

}

//        Line line1 = new Line(1, 3, 5, 8);
//        Line line2 = new Line(10, 11, 15, 19);
//        Line line3 = new Line(line1.getEnd(), line2.getStart());
//
//        System.out.println("=== Исходное состояние ===");
//        System.out.println(line3);
//        System.out.println();
//
//// Изменяем координаты напрямую через публичные поля
//        System.out.println("=== Изменяем координаты точек Line3 ===");
//        line3.getStart().x = 10;
//        line3.getStart().y = 20;
//        line3.getEnd().x = 30;
//        line3.getEnd().y = 40;
//    }

//}



/*
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point p1 = new Point(5, 10);
        Point p2 = new Point(3, 7);
        Point p3 = new Point(3, 7);

        // Тест equals()
        System.out.println("p1.equals(p2): " + p1.equals(p2));
        System.out.println("p1.equals(p3): " + p1.equals(p3));
        System.out.println("p1.equals(p3): " + p2.equals(p3));
        System.out.println("p1 == p2: " + (p1 == p2));
        System.out.println("p2 == p3: " + (p2 == p3));
        System.out.println("p1 == p3: " + (p1 == p3));
        // Тест clone()
        Point p4 = p1.clone();
        System.out.println("\nОригинал: " + p1);
        System.out.println("Клон: " + p4);
        System.out.println("p1.equals(p4): " + p1.equals(p4));
        System.out.println("p1 == p4: " + (p1 == p4));

        // Изменение клона
        p4.setX(100);
        System.out.println("\nПосле изменения клона:");
        System.out.println("Оригинал: " + p1); // Point(5, 10)
        System.out.println("Клон: " + p4);     // Point(100, 10)
    }

}
  /*  public static void main(String[] args) {

        // 1. Точка из java.awt - доступна по простому имени
        Point awtPoint = new Point(30, 40);
        System.out.println("Точка Java: " + awtPoint);

        // 2. Точка из ru.courses.geometry - используем полное имя
        ru.courses.geometry.Point myPoint = new ru.courses.geometry.Point(10, 20);
        System.out.println(" Точка из Geometry: " + myPoint);
    }
}*/
/*

    // Возведение в степень
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Введите два числа");
            return;
        }

        double result = power(args[2], args[3]);
        System.out.println("Результат: " + args[2] + "^" + args[3] + " = " + result);
    }
}
//        {
//            // Проверка наличия аргументов
//            if (args.length < 2) {
//                System.out.println("2^3 = " + power("2", "3"));
//                System.out.println("5^2 = " + power("5", "0"));
//                return;
//            }
//
//            // Вызов метода с параметрами командной строки
//            String x = args[0];
//            String y = args[1];
//
//            double result = power(x, y);
//
//            System.out.println(x + "^" + y + " = " + result);
//        }


/*
        //Measurable
        // Создаём точки
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 0);
        Point p3 = new Point(3, 4);

        // Создаём обычную линию
        Line line = new Line(p1, p2);

        // Создаём обычную ломаную
        PolyLine polyLine = new PolyLine(p1, p2, p3);

        // Создаём замкнутую ломаную
        ClosedPolyLine closedPolyLine = new ClosedPolyLine(p1, p2, p3);

        // Передаём все объекты в метод
        MeasurableClass.printLengths(line, polyLine, closedPolyLine);


        System.out.println("Линия длиной: " + line.getLength());
        System.out.println("Обычная ломаная длиной: " + polyLine.getLength());
        System.out.println("Замкнутая ломаная длиной: " + closedPolyLine.getLength());
    }

}*/
/*
ClosePolyline
     // Треугольник 3-4-5
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 0);
        Point p3 = new Point(3, 4);

        System.out.println("=== ломаная ===");
        PolyLine line = new PolyLine(p1, p2, p3);
        System.out.println("Длина: " + line.length());
        // 3 + 4 = 7.0

 */


//Polyline

        /* 1. Создать Ломаную
        Point p1 = new Point(1, 5);
        Point p2 = new Point(2, 8);
        Point p3 = new Point(5, 3);
        Point p4 = new Point(8, 9);

        PolyLine polyLine = new PolyLine(p1, p2, p3, p4);
        System.out.println("1. Ломаная создана через точки {1;5}, {2;8}, {5;3}, {8;9}");

        // 2. Рассчитать длину
        double length = polyLine.getLength();
        System.out.println("2. Длина ломаной: " + length);

        // 3. Получить массив линий
        Line[] lines = polyLine.getLines();
        System.out.println("3. Массив линий получен, количество линий: " + lines.length);

        // 4. Рассчитать длину массива линий
        double linesLength = 0;
        for (int i = 0; i < lines.length; i++) {
            linesLength += lines[i].getLength();
        }
        System.out.println("4. Суммарная длина массива линий: " + linesLength);

        // 5. Сравнить длины
        System.out.println("\n5. Сравнение длин:");
        System.out.println("   Длина ломаной:       " + length);
        System.out.println("   Длина массива линий: " + linesLength);
        System.out.println("   Совпадают: " + (length == linesLength));


        // 6. Изменить точку {2;8} на {12;8}
        System.out.println("\n6. Изменение точки p2:");
        System.out.println("   ДО изменения:");
        System.out.println("     p2 = " + p2);
        System.out.println("     Длина ломаной: " + polyLine.getLength());
        System.out.println("     Линия 1: " + lines[0] + ", длина: " + lines[0].getLength());
        System.out.println("     Линия 2: " + lines[1] + ", длина: " + lines[1].getLength());

        p2.setX(12);  // Меняем координату X с 2 на 12

        System.out.println("\n   ПОСЛЕ изменения:");
        System.out.println("     p2 = " + p2);
        System.out.println("     Длина ломаной: " + polyLine.getLength());
        System.out.println("     Линия 1: " + lines[0] + ", длина: " + lines[0].getLength());
        System.out.println("     Линия 2: " + lines[1] + ", длина: " + lines[1].getLength());
    }
}*/
      /*Line

Line line1 = new Line(1, 3, 5, 8);
Line line2 = new Line(10, 11, 15, 19);
Line line3 = new Line(line1.getEnd(), line2.getStart());

        System.out.println("=== Исходное состояние ===");
        System.out.println(line3);
        System.out.println();

// Изменяем координаты напрямую через публичные поля
        System.out.println("=== Изменяем координаты точек Line3 ===");
        line3.getStart().x = 10;
        line3.getStart().y = 20;
        line3.getEnd().x = 30;
        line3.getEnd().y = 40;

        System.out.println("\n=== После изменения ===");
        System.out.println("Line 1: " + line1);
        System.out.println("Line 2: " + line2);
        System.out.println("Line 3: " + line3);
        System.out.println();

double totalLength = line1.getLength() + line2.getLength() + line3.getLength();
        System.out.println("=== Длины линий ===");
        System.out.println("Длина Line 1: " + line1.getLength());
        System.out.println("Длина Line 2: " + line2.getLength());
        System.out.println("Длина Line 3: " + line3.getLength());
        System.out.println("Суммарная длина: " + totalLength);*/

/*Point
 // Создание 2D точки
        Point p2d = new Point(5, 10);
        System.out.println("2D точка: " + p2d);

        // Создание 3D точки
        Point3D p3d = new Point3D(5, 10, 15);
        System.out.println("3D точка: " + p3d);

        // Доступ к координатам
        System.out.println("\nКоординаты 3D точки:");
        System.out.println("x = " + p3d.x);
        System.out.println("y = " + p3d.y);
        System.out.println("z = " + p3d.z);

        // Изменение координат
        p3d.x = 100;
        p3d.y = 200;
        p3d.z = 300;
        System.out.println("\nПосле изменения: " + p3d);

        // Массив 3D точек
        Point3D[] points = {
                new Point3D(0, 0, 0),
                new Point3D(1, 2, 3),
                new Point3D(10, 20, 30)
        };

        System.out.println("\nМассив 3D точек:");
        for (Point3D point : points) {
            System.out.println(point);
        }



 */
//{
// Создание 2D точки

// 3D point
//Point p2d = new Point(5, 10);
//        System.out.println("2D точка: " + p2d);
//
/// / Создание 3D точки
//Point3D p3d = new Point3D(5, 10, 15);
//        System.out.println("3D точка: " + p3d);
//
/// / Доступ к координатам
//        System.out.println("\nКоординаты 3D точки:");
//        System.out.println("x = " + p3d.x);
//        System.out.println("y = " + p3d.y);
//        System.out.println("z = " + p3d.z);
//
/// / Изменение координат
//p3d.x = 100;
//p3d.y = 200;
//p3d.z = 300;
//        System.out.println("\nПосле изменения: " + p3d);

// Массив 3D точек
//Point3D[] points = {
//        new Point3D(0, 0, 0),
//        new Point3D(1, 2, 3),
//        new Point3D(10, 20, 30)
//};
//
//        System.out.println("\nМассив 3D точек:");
//        for (Point3D point : points) {
//        System.out.println(point);
//        }
//                }

// он возвращал строку, в которой будут записаны все числа от 0 до x (включительно). x может принимать значения от 0 и выше.
/*
     public static void main(String[] args) {
        System.out.println(listNums(4));
    }
    */


/*
Необходимо реализовать метод таким образом, чтобы
он возвращал строку, в которой будут записаны все числа от x до 0 (включительно). x может принимать значения от 0 и выше.
    public static void main(String[] args) {
        System.out.println(reverseListNums(8));

 */
/*
public static void main(String[] args) {
    System.out.println(chet(10));
/*

 */
/*
public static void main(String[] args) {
        // Создание студента только с именем
        Student student1 = new Student("Андрей");
        System.out.println(student1);

        // === БЛОК: Добавление оценок ===
        System.out.println("\n=== Добавление оценок студенту Андрей ===");
        student1.addGrade(5);
        System.out.println("Добавлена оценка 5: " + student1);

        student1.addGrade(4);
        System.out.println("Добавлена оценка 4: " + student1);

        student1.addGrade(5);
        System.out.println("Добавлена оценка 5: " + student1);

        student1.addGrade(3);
        System.out.println("Добавлена оценка 3: " + student1);

        student1.addGrade(2);
        System.out.println("Добавлена оценка 2: " + student1);

        System.out.println();

        // Создание студента с оценками (6 вызовет ошибку!)
        System.out.println("=== Создание студента Дарья ===");
        try {
            Student student2 = new Student("Дарья", 5, 5, 4, -6);
            System.out.println(student2);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка при создании: " + e.getMessage());
            System.out.println("Создаём студента с корректными оценками...");
        }

        // Создаём с правильными оценками
        Student student2 = new Student("Дарья", 5, 5, 4, 5);
        System.out.println(student2);

        student2.addGrade(3);
        System.out.println("После добавления оценки 3: " + student2);

        System.out.println();

        // Получение оценок
        System.out.println("=== Проверка инкапсуляции ===");
        int[] daryaGrades = student2.getGrades();
        System.out.println("Оценки Дарьи: " + java.util.Arrays.toString(daryaGrades));

        daryaGrades[0] = 2;
        System.out.println("Изменили внешний массив: daryaGrades[0] = 2");
        System.out.println("Оригинальные оценки не изменились: " + student2);

        System.out.println();

        // Проверка валидации
        System.out.println("=== Проверка валидации оценок ===");
        try {
            student1.addGrade(6);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            student1.addGrade(1);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            student1.addGrade(0);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Корректная оценка
        System.out.println("Добавление корректной оценки 2:");
        student1.addGrade(2);
        System.out.println(student1);

        System.out.println("=== Итоговые результаты ===");
        System.out.println(student1);
        System.out.println(student2);
    }
}
 */

