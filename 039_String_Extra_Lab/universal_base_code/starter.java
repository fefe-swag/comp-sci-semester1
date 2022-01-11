import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	public static void sentenceReverser(String a) { 					// given String, returns in reverse order while keeping words intact. 
		//																// words = substrings separated by a space.
		int impostorBoolean;											// functions like a boolean but is not one, due to how compareTo function is used
		int space;
		int previousSpace = a.length();
		//
		for(int i = a.length()-1; i > 0; i--) {
			impostorBoolean = (a.substring(i-1, i)).compareTo(" ");		// goes from end of sentence back, compares index of the string to a space.
			if(impostorBoolean == 0) {									// if it finds a space,
				space = i - 1;											// "space" int is set to counter - 1, since i = index of the space + 1 if booleanValue == 0
				System.out.print(a.substring(space, previousSpace));	// prints out the substring of given string from space to previousSpace,
				// 														// or from space to end of sentence if first word.
				previousSpace = space;									// self-explanatory
			}
		}
		System.out.print(" " + a.substring(0, previousSpace));			// prints out last word cause im lazy and can't figure this part out
		return;															// gaming
	}
	
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		//
		System.out.print("enter any phrase you want: ");
		String userPhrase = sc.nextLine();
		//
		//
		System.out.println("your phrase is: " + userPhrase);
		System.out.print("this phrase, in reverse order, is:");
		//
		sentenceReverser(userPhrase);
		// I FINALLY DID IT YEAHHHHHHHHHHHH
	}
}

