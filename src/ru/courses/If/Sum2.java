
//Необходимо реализовать метод таким образом, чтобы
//он возвращал сумму чисел x и y.
//Однако, если сумма попадает в диапазон от [10, 19], то надо вернуть число 20.
package ru.courses.If;

public class Sum2 {
    public static int sum2(int x, int y) {
        if (x+y>=10 && x+y<=19) return 20;
        else return x+y;
    }

    /*public static void main(String[] args) {
        System.out.println(sum2(5, 7));
        System.out.println(sum2(8, -1));

    }*/
}
