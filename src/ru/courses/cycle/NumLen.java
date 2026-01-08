//Необходимо реализовать метод таким образом, чтобы
//он возвращал количество знаков в числе x. x может принимать значения от 0 и выше.

package ru.courses.cycle;

public class NumLen {
    public static int numLen(long x) {
        if (x == 0) return 1;
        int count = 0;
        for (; x > 0; x /= 10) {
            count = count + 1;
        }
        return count;
    }
        public static void main (String[]args){
            System.out.println(numLen(0));
        }
    }

