//Метод принимает левую и правую границу [a и b] некоторого числового диапазона.
//Необходимо реализовать метод таким образом, чтобы он возвращал true, если num входит в
//указанный диапазон (включая границы). Обратите внимание, что отношение a и b заранее неизвестно (неясно кто из
//них больше, а кто меньше)

package ru.courses.classAndMetod;

public class IsInRange {
    public static boolean isInRange(int a, int b, int num) {
        return (num>=a && num<=b)||(num>=b && num<=a) ;
    }
   /* public static void main(String[] args) {
        System.out.println(isInRange(2, 15, 33));
System.out.println(isInRange(5, 1, 3));
    }*/
}