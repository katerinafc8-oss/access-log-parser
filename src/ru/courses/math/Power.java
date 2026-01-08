package ru.courses.math;
import static java.lang.Math.pow;
import static java.lang.Integer.parseInt;


//Возведение в степень
//Создайте метод принимающий две строки, в которых будут записаны числа X и Y. Возвращает метод результат возведения X в степень Y. Для преобразования строки в число следует использовать метод Integer.parseInt, а для возведения в степень метод Math.pow. Вызовите разработанный метод передав туда параметры командной строки полученные точкой входа в программу. Реализуйте метод так, что бы для возведения в степень и преобразования строки использовались короткие имена статических методов (pow и parseInt).
public class Power {

    public static double power(String x, String y) {
        return pow(parseInt(x), parseInt(y));
    }
}