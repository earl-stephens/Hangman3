package application;

import java.util.Random;

public class RandomWord {
	private String chosenWord;
	private String[] possibleWords = {"someone", "enough", "completely", "honestly", "pretending", "matter", "around", "paradise", "balloons", "together", "direction"};
	Random random = new Random();

	public char[] characters;
	private char letterInWord = '\u0000';
	
	public void setLetterInWord(char letterInWord) {
		this.letterInWord = letterInWord;
	}
	
	public String selectWord() {
		int length = possibleWords.length;
		int randomIndex = random.nextInt(length);
		chosenWord = possibleWords[randomIndex];
		characters = new char[chosenWord.length()];
		return chosenWord;
	}
	
	public String toString() {
		StringBuilder sb1 = new StringBuilder();
		for(int i = 0; i < characters.length; i++) {
			if(characters[i] == '\u0000') {
				sb1.append("_");
			} else {
				sb1.append(characters[i]);
			}
			sb1.append(" ");
		}
		return sb1.toString();
	}
	
	public void checkGuess() {
		for(int i = 0; i < chosenWord.length(); i++) {
			if(letterInWord == chosenWord.charAt(i)) {
				characters[i] = letterInWord;
			}
		}
	}
}

