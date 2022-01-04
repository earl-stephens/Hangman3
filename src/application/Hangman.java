package application;

import java.util.Scanner;

public class Hangman {
	
	RandomWord word = new RandomWord();
	Scanner scanner = new Scanner(System.in);
	
	char guessedLetter;
	String wordWithLetters;
	
	public void run() {
		word.selectWord();
		displayWord();
		getPlayerInput();
	}
	
	public void getPlayerInput() {
		System.out.print("Enter your guess: ");
		String input = scanner.nextLine();
		guessedLetter = input.charAt(0);
		System.out.println(guessedLetter);
	}
	
	public void displayWord() {
		wordWithLetters = word.displayTheWord();
		System.out.println(wordWithLetters);
	}
	
	public void close() {
		
	}
}
