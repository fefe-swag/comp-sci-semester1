package pkg;
import java.util.Scanner;
import java.util.Random;


public class Hangman{
	private String guessingWord;	//The word trying to be guessed
	private int numTries;			//How many tries the user has
	
	public Hangman() {
		generateWord();
		numTries = 5;
	}
		
	public Hangman(int x) {
		generateWord();
		numTries = x;
	}

	public void generateWord(){
		/* implementation not shown */
	}
	
	public int guessCheck(String letter, int start){
		int impostorBoolean = 0; // it returns!!!
		int index = -1;
		for(int i = start; i < guessingWord.length(); i++) {
			impostorBoolean = (guessingWord.substring(i, i+1)).compareTo(letter);
			if(impostorBoolean == 0) {
				index = i;
			}
		}
		return index;
	}
	
	public boolean checkWin(boolean [] arr){
		boolean winning = true;
		boolean won = true;
		for(int i = 0; i < arr.length; i++) {
			if(winning != arr[i]) {
				won = false;
			}
		}
		return won;
	}
}

