//Необходимо реализовать метод таким образом, чтобы
//он возвращал true, если два любых
//числа (из трех принятых) можно сложить так, чтобы получить третье.

package ru.courses.If;
public class Sum3 {
    public static boolean sum3(int x, int y, int z) {
        if ((x+y==z) || (x+z==y) || (z+y==x)) return true;
        return false;
    }

   /* public static void main(String[] args) {
        System.out.println(sum3(5, 7, 2));
        System.out.println(sum3(8, -1, 4));

    }*/
}
