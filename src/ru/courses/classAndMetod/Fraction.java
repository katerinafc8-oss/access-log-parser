package ru.courses.classAndMetod;
//Необходимо реализовать метод таким образом, чтобы он возвращал только дробную часть числа х. При выводе результата необходимо обеспечить точность вычислений — три
//знака после запятой
//Подсказка: вещественное число может быть преобразовано к целому путем
//отбрасывания дробной части.


public class Fraction {
    public static double fraction(double x){

        return (x-(int) x);
    }
    /*
    public static void main(String[] args) {
        System.out.printf("%.3f%n", fraction(5.3));
    }*/
}