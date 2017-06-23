// Used for input/output

import java.util.Scanner;

public class Prompter {
    private Game game;

    // contructor
    public Prompter(Game game) {
        this.game = game;
    }

    public boolean promtForGuess(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String guessInput = scanner.nextLine();
        //Gives us the guess, but Game let's us know if that is correct
        char guess = guessInput.charAt(0);
        return game.applyGuess(guess);
    }
    public void displayProgress(){
        System.out.printf("Tou have %d tries left to solve: %s%n",
                game.getRemainingTries(),
                game.getCurrentProgress());
    }
}