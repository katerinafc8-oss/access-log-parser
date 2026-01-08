//Левый треугольник. Дана следующая сигнатура
//метода:
//
//public static void leftTriangle(int x);
//Необходимо реализовать метод таким образом, чтобы
//он выводил на экран треугольник из символов ‘*’ у которого х символов в высоту, а количество символов в ряду совпадает с
//номером строки.

package ru.courses.cycle;

public class LeftTriangle {
    public static void leftTriangle(int x) {
        for (int i=0; i<x;i++){
            for (int j=0; j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
