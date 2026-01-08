//Необходимо реализовать метод таким образом, чтобы
//он возвращал true если любое из
//принятых чисел делит другое нацело.

package ru.courses.classAndMetod;

public class IsDivisor {
    public static boolean isDivisor (int a, int b) {
        return (b != 0 && a%b==0)||(a != 0 && b%a==0);
        }
   /* public static void main(String[] args) {
        System.out.println(isDivisor(3, 6));
        System.out.println(isDivisor(2, 15));
    }*/
}
