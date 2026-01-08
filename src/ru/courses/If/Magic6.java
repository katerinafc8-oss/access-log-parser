//Необходимо реализовать метод таким образом, чтобы
//он возвращал true, если одно из
//принятых методом чисел равно шести, или их сумма равна шести, или разница между
//ними равна шести.
//
//Пример 1:

package ru.courses.If;

public class Magic6 {
        public static boolean magic6(int x, int y) {
            if (x==6 || y==6) return true;
            if (x-y==6 || y-x==6) return true;
            if (x+y==6 || y+x==6) return true;
            else return false;
        }

 /*  public static void main(String[] args) {
            System.out.println(magic6(5,7));
            System.out.println(magic6(8,2));
            System.out.println(magic6(1,6));
        }*/
    }

