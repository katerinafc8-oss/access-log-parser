package ru.courses.If;

//Необходимо реализовать метод таким образом, чтобы
//он возвращал модуль числа х (если он был положительным,
//то таким и остается, если он был отрицательным – то необходимо вернуть его без
//знака минус). При реализации метода не использовать методы класса Math.

public class If1 {

    public static int abs(int x) {
        if (x < 0) {
            return -x;
        }
        return x;
    }

   /* public static void main(String[] args) {
        System.out.println(abs(5));
        System.out.println(abs(-3));
    }*/

    public static class Sum3 {
        public static boolean sum3(int x, int y, int z) {
            if ((x+y==z) || (x+z==y) || (z+y==x)) return true;
            return false;
        }

       /* public static void main(String[] args) {
            System.out.println(sum3(5, 7, 2));
            System.out.println(sum3(8, -1, 4));

        }*/
    }
}