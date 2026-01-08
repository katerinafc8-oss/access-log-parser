
//Дана следующая сигнатура метода:
//
//public static int sumLastNums(int x);
//Необходимо реализовать метод таким образом, чтобы он возвращал результат сложения двух последних знаков числа х, предполагая, что знаков в числе не менее двух. Подсказки:

package ru.courses.classAndMetod;

public class SumLastNums {
    public static int sum(int x) {
        int last = x % 10; // последнее число
        int notLast = (x / 10) % 10;// предпоследнее число
        return last+notLast;
    }

/*public static void main(String[] args) {
   System.out.println(sum(4568));// вывод подсчета суммы
}*/
}