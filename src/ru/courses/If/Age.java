package ru.courses.If;

//Необходимо реализовать метод таким образом, чтобы он возвращал строку, в которой сначала будет число х, а затем одно из слов:
//
//год
//года
//лет
//Слово “год” добавляется, если число х заканчивается на 1, кроме чисел оканчивающихся на 11.
//
//Слово “года” добавляется, если число х заканчивается на 2, 3 или 4, кроме чисел оканчивающихся на 12, 13, 14.
//
//Слово “лет” добавляется во всех остальных случаях.
//
//Подсказка: оператор % позволяет получить остаток от деления.

public class Age {
    public static String age(int x) {
        int last = x % 10;
        int lastTwo = x % 100;

        if (lastTwo >= 11 && lastTwo <= 14) return x + " лет";
        if (last == 1) return x + " год";
        if (last >= 2 && last <= 4) return x + " года";
        return x + " лет";
    }

/*public static void main(String[] args) {
    System.out.println(age(1));
    System.out.println(age(12));
    System.out.println(age(16));
}*/
}