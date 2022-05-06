import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        int correctNumber = 15, attemptLeft = 10;
        System.out.println("Guess a number between 1 to 50");
        Scanner sc = new Scanner(System.in);
        int[] guessingLog = new int[10];
        int attempt = 0;
        while (attemptLeft > 0) {
            int guessed = sc.nextInt();
            guessingLog[attempt++] = guessed;
            if (guessed == correctNumber) {
                System.out.println("Your guess is correct");
                attemptLeft--;
                System.out.println("You had " +attemptLeft+ " attempt left");
                break;
            }
            if (guessed > correctNumber) {
                System.out.println("You guessed higher than the correct answer");
                attemptLeft--;
            } else {
                System.out.println("You guessed lower than the correct answer");
                attemptLeft--;
            }
            System.out.println("You have " +attemptLeft+ " attempt left");
        }
        System.out.println("guessed numbers");
        for (int i = 0; i < attempt; i++) {
            System.out.println(guessingLog[i]);
        }
    }
}
