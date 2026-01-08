
//Необходимо реализовать метод таким образом, чтобы
//он возвращал true, если все знаки
//числа одинаковы, и false в ином случае.
package ru.courses.cycle;

public class EqualNum {
    public static boolean equalNum(int x) {
        if (x < 0) x = -x;

        int lastDigit = x % 10;

        for (; x > 0; x /= 10) {
            if (x % 10 != lastDigit) {
                return false;
            }
        }

        return true;
    }


}