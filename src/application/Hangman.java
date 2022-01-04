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
		String input;
		System.out.print("Enter your guess: ");
		input = scanner.nextLine();
		
		if(input.equals("")) {
			do {
			System.out.println("Enter key was pressed without any letters. Try again: "); 
			input = scanner.nextLine();
			} while(input.equals(""));
		} 

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
