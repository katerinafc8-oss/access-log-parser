package ru.courses.cycle;

public class GuessGame {
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


}

