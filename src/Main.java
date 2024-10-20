import java.util.Scanner;

public class Main {
    private static final Scanner stdin = new Scanner(System.in);
    public static void main(String[] args) {
        int chances = 3;

        System.out.print("Player 1: Enter a secret number: ");
        int secretNumber = stdin.nextInt();


        while (chances > 0) {

            System.out.print("Player 2: Make your guess:  ");
            int guess = stdin.nextInt();

            if (secretNumber == guess) {
                System.out.println("Congratulations! You got the correct guess!!");
                break;
            } else {
                chances--;
                if (chances > 0) {
                    System.out.println("Sorry, you guessed wrong!, You have: " + chances + " chances left!");
                } else {
                    System.out.print("Incorrect guess.\nThe secret number was: " + secretNumber);
                }

            }
        }










    }
}