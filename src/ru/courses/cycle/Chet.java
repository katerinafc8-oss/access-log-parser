package ru.courses.cycle;


//Необходимо реализовать метод таким образом, чтобы
//он возвращал строку, в которой будут записаны все числа от 0 до x (включительно). x может принимать значения от 0 и выше.
public class Chet {
    public static String chet(int x) {
        String res = "";
        for (int i = 0; i <= x; i += 2) {
            res=res+i+" ";
        }
        return res.trim();
    }

}
