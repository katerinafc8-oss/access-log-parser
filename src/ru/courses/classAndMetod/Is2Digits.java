//Необходимо реализовать метод таким образом, чтобы
//он принимал положительное число x и
//возвращал true если оно
//двузначное.

package ru.courses.classAndMetod;

public class Is2Digits {
    public static boolean is2Digits(int x) {
        return x >= 10 && x <= 99;
    }

  /*  public static void main(String[] args) {
        System.out.println(is2Digits(32));
        System.out.println(is2Digits(516));
        System.out.println(is2Digits(5));
}*/
}