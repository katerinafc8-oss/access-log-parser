//Необходимо реализовать метод таким образом, чтобы
//он возвращал строку, в которой будут записаны все числа от 0 до x (включительно). x может принимать значения от 0 и выше.

package ru.courses.cycle;

public class ListNums {
    public static String listNums(int x) {
        String res="";
        for (int i = 0; i <= x; i++) {
            res += (i + " ");

        }
        return res.trim();
    }

}