import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    private int randomNumber;
    private int num;
    private int numberOfGuesses;

    public GuessTheNumber() {
        Random random = new Random();
        this.randomNumber = random.nextInt(100) + 1;
        this.numberOfGuesses = 0;
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Guess the Number Game!");
        System.out.println("I have selected a random number between 1 and 100.");

        do {
            System.out.println("Enter your guess: ");
            this.num = scanner.nextInt();
            this.numberOfGuesses++;

            if (num < this.randomNumber) {
                System.out.println("Your guess is too small. Try again.");
            } else if (num > this.randomNumber) {
                System.out.println("Your guess is too large. Try again.");
            }
        } while (num != this.randomNumber);

        System.out.println("Congratulations! You guessed the number " + this.randomNumber + " correctly!");
        System.out.println("Number of guesses: " + this.numberOfGuesses);
    }

    public static void main(String[] args) {
        GuessTheNumber game = new GuessTheNumber();
        game.playGame();
    }
}

