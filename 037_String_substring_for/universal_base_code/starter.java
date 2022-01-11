import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// i already did this in the
		// previous lab so this is just
		// copy pasted code
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a word: ");
		String userString = sc.nextLine();
		System.out.println("cool. here's that word, letter by letter.");
		//
		for(int i = 0; i < userString.length(); i++){
			System.out.println(i + " " + userString.substring(i, i+1));
		}
	}
}
