
public class Hangman {
	public static void main(String[] args) {
		Game game = new Game("treehouse");
		Prompter prompter = new Prompter(game);

		// Want to remove tries from MAX Guesses:
		while (game.getRemainingTries()>0){
			prompter.displayProgress();
			prompter.promtForGuess();
		}




		// Removed when added a way to tell the user how many tries they have left
		/*
		boolean isHit = prompter.promtForGuess();
		if (isHit) {
			System.out.println("We got a hit!");
		}else {
			System.out.println("Missed!");
		}
		prompter.displayProgress();
		*/
	}

}
