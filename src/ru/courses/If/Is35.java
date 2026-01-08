package ru.courses.If;
//Необходимо реализовать метод таким образом, чтобы
//он возвращал true, если число x делится нацело на 3 или 5. При этом, если оно делится и на 3,
//и на 5, то вернуть надо false. Подсказка:
//оператор % позволяет получить остаток от деления.
public class Is35 {
    public static boolean is35(int x) {
        if (x%3==0 && x%5==0) return false;
        if (x%3==0 || x%5==0) return true;
        else return false;
    }

   /* public static void main(String[] args) {
        System.out.println(is35(5));
        System.out.println(is35(15));
        System.out.println(is35(8));
    }*/
}
