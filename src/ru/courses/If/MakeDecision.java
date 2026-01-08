package ru.courses.If;

//Необходимо реализовать метод таким образом, чтобы
//он возвращал строку, которая включает два принятых методом числа и корректно
//выставленный знак операции сравнения (больше, меньше, или равно).

public class MakeDecision {

    public static String makeDecision(int x, int y) {
        if (x > y) {
            return x + ">" + y;
        } else if (x < y) {
            return x + "<" + y;
        } else {
            return x + "==" + y;
        }
    }

  /*  public static void main(String[] args) {
        System.out.println(makeDecision(3, 5));
    }*/
}