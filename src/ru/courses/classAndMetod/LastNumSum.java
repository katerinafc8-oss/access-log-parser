//Выполните с его помощью последовательное сложение пяти чисел: 5, 11, 123, 14, 1, и результат выведите на экран. Постарайтесь выполнить задачу, используя минимально возможное количество вспомогательных переменных.
//
//Ответом на данное задание является код метода main, в котором происходит вызов данной функции.

package ru.courses.classAndMetod;

public class LastNumSum {

    public static int lastNumSum(int a, int b) {
        return (a % 10) + (b % 10);
    }

   /* public static void main(String[] args) {
        int a = 5;
        System.out.println("Начало: " + a);
        a = lastNumSum(a, 11);
        System.out.println("5 + 11 = " + a);  // 6

        a = lastNumSum(a, 123);
        System.out.println("6 + 123 = " + a);  // 9

        a = lastNumSum(a, 14);
        System.out.println("9 + 14 = " + a);  // 13

        a = lastNumSum(a, 1);
        System.out.println("13 + 1 = " + a);  // 4
    }*/

    public static class IsUpperCase {
        public static boolean isUpperCase(char x) {
            return x>='A' && x<='Z';
        }
       /* public static void main(String[] args) {
            System.out.println(isUpperCase('D'));
            System.out.println(isUpperCase('q'));

        }*/
    }
}