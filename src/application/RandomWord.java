package application;

import java.util.Random;

public class RandomWord {
	private String chosenWord;
	private String[] possibleWords = {"someone", "enough", "completely", "honestly", "pretending", "matter", "around", "paradise", "balloons", "together", "direction"};
	Random random = new Random();
	StringBuilder sb1 = new StringBuilder();
	private String characters;
	
	public String selectWord() {
		int length = possibleWords.length;
		int randomIndex = random.nextInt(length);
		chosenWord = possibleWords[randomIndex];
		
		return chosenWord;
	}
	
	public String displayTheWord() {
		for(int i = 0; i < chosenWord.length(); i++) {
			sb1.append("_ ");
		}
		characters = sb1.toString();
		return characters;
	}
	
	public void checkGuess(char guessedLetter) {
		System.out.println(guessedLetter);
	}
}
