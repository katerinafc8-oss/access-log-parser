//Необходимо реализовать метод таким образом, чтобы
//он возвращал максимальное значение из двух полученных методом чисел. При реализации метода не использовать методы класса Math.

package ru.courses.If;

public class Max {

    public static int max(int x, int y) {
        if (x > y) return x;
        if (y > x) return y;
        return x;
    }

  /*  public static void main(String[] args) {
        System.out.println(max(5, 6));
        System.out.println(max(10, 3));
        System.out.println(max(2, 2));
}*/
}