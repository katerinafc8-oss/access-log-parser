//Необходимо реализовать метод таким образом, чтобы
//он принимал символ x и
//возвращал true если это большая
//буква в диапазоне от ‘A’ до ‘Z’. При реализации метода не использовать методы класса Character.

package ru.courses.classAndMetod;
public class IsUpperCase {
    public static boolean isUpperCase(char x) {
        return x>='A' && x<='Z';
    }
   /* public static void main(String[] args) {
        System.out.println(isUpperCase('D'));
        System.out.println(isUpperCase('q'));

    }*/
}