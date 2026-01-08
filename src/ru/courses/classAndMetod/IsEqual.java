//Необходимо реализовать метод таким образом, чтобы
//он возвращал true если все три
//полученных методом числа равны

package ru.courses.classAndMetod;

public class IsEqual {
    public static boolean isEqual (int a, int b, int c) {
        return (a == b && b==c && a==c);
    }
   /* public static void main(String[] args) {
        System.out.println(isEqual(3, 3,3));
        System.out.println(isEqual(2, 5,2));
    }*/
}

