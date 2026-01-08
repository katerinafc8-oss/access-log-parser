// Необходимо реализовать метод таким образом, чтобы
//он возвращал строку, в которой будут записаны все числа от x до 0 (включительно). x может принимать значения от 0 и выше.

package ru.courses.cycle;

public class ReverseListNums {

    public static String reverseListNums(int x) {
        String res = "";
        for (int i = x; i >= 0; i--) {
            res += i + " ";
        }
        return res.trim();

    }
}