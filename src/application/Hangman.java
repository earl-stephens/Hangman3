package application;

import java.util.Scanner;

public class Hangman {
	
	RandomWord word = new RandomWord();
	Scanner scanner = new Scanner(System.in);
	
	char guessedLetter;
	String wordWithLetters;
	boolean completeFlag = true;
	int numberOfTurns = 4;
	
	public void run() {
		word.selectWord();

		do {
			displayWord();
			getPlayerInput();
			wordCompleteCheck();
			turnsRemaining();
		} while (completeFlag);
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
		word.setLetterInWord(guessedLetter);
		word.checkGuess();
	}
	
	public void displayWord() {
		System.out.println(word);
	}
	
	public void wordCompleteCheck() {
		completeFlag = word.checkWholeWord();
		if(!completeFlag) {
			System.out.println("You won!");
		}
	}
	
	public void turnsRemaining() {
		System.out.println("You have " + numberOfTurns + " turn(s) remaining.");

		if(numberOfTurns == 0) {
			completeFlag = false;
		}
		numberOfTurns--;
	}
	
	public void close() {
		System.out.println("Thanks for playing.");
	}
}
