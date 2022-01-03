package application;

import java.util.Random;

public class RandomWord {
	private String chosenWord;
	private String[] possibleWords = {"someone", "enough", "completely", "honestly", "pretending", "matter", "around", "paradise", "balloons", "together", "direction"};
	Random random = new Random();
	
	public String selectWord() {
		int length = possibleWords.length;
		int randomIndex = random.nextInt(length);
		chosenWord = possibleWords[randomIndex];
		
		System.out.println(chosenWord);
		return chosenWord;
	}
}
