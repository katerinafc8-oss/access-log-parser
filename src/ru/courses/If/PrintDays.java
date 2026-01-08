package ru.courses.If;

public class PrintDays {

    public static void printDays(String x) {  // void вместо String
        switch (x) {
            case "Понедельник":
                System.out.println("Понедельник");
            case "Вторник":
                System.out.println("Вторник");
            case "Среда":
                System.out.println("Среда");
            case "Четверг":
                System.out.println("Четверг");
            case "Пятница":
                System.out.println("Пятница");
            case "Суббота":
                System.out.println("Суббота");
            case "Воскресенье":
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("это не день недели");
        }
    }

  /*  public static void main(String[] args) {
        printDays("Понедельник");
    }*/
}