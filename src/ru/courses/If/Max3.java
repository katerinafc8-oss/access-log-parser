//Необходимо реализовать метод таким образом, чтобы
//он возвращал максимальное из трех полученных методом чисел. Подсказка:
//идеальное решение включает всего две инструкции if и не содержит вложенных if. При реализации метода не использовать методы класса Math.

package ru.courses.If;

public class Max3 {
    public static int max3(int x, int y, int z) {
        if (x >= y && x >= z) return x;
        if (y >= x && y >= z) return y;
        return z;
    }

   /* public static void main(String[] args) {
        System.out.println(max3(5, 7, 7));
        System.out.println(max3(8, -1, 4));

    }*/
}