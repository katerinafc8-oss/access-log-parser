//  Метод принимает символ х, который представляет собой один из “0 1 2 3 4 5 6 7 8 9”. Необходимо реализовать метод таким образом, чтобы он преобразовывал символ в соответствующее число. При реализации метода не использовать методы класса Character. Подсказка: код символа ‘0’ — это число 48
package ru.courses.classAndMetod;

public class СharToNum {
    public static int charToNum(char x) {
        int num = x - '0';
        return num;
    }
    /*public static void main(String[] args) {
        System.out.println(charToNum('3'));
    }*/
}