import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
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
