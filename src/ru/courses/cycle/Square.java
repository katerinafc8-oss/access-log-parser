//Необходимо реализовать метод таким образом, чтобы
//он выводил на экран квадрат из символов ‘*’ размером х,
//у которого х символов в ряд и х
//символов в высоту.
//Подсказка: метод System.out.print выводит без
//перехода на следующую строку, в то время как System.out.println выводит с
//переходом.

package ru.courses.cycle;

public class Square {
    public static void square(int x) {
       for (int i=0; i<x;i++){
           for (int j=0; j<x;j++){
               System.out.print("*");
           }
           System.out.println("");
       }
    }

    public static void leftTriangle(int x) {
        for (int i=0; i<x;i++){
            for (int j=0; j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }


    public static void guessGame() {
        int randomNum = 3;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int attempts = 0;

        while (true) {
            System.out.println("What number am I thinking (0 to 9)? :");
            int x = sc.nextInt();
            attempts++;

            if (x != randomNum) {
                System.out.println("No, try again");
            } else {
                System.out.println("Yes, it's " + randomNum);
                System.out.println("You guessed it in " + attempts + " attempts!");
                break;  // Выход из цикла
            }
        }
    }

    public static void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            // Выводим пробелы (x - i штук)
            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }
            // Выводим звёздочки (i штук)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();  // Переход на новую строку
        }
    }

    public static void main(String[] args){
        rightTriangle(3);
    }
}

