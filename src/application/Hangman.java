package application;

public class Hangman {
	RandomWord word = new RandomWord();
	String wordWithLetters;
	
	public void run() {
		word.selectWord();
		displayWord();
	}
	
	public void displayWord() {
		wordWithLetters = word.displayTheWord();
		System.out.println(wordWithLetters);
	}
	
	public void close() {
		
	}
}
