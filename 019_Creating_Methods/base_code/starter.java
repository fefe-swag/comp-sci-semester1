import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static void toString(String inputSentOne){
		System.out.println("This is using the methods!");
		System.out.println(inputSentOne);
		return;
	}
	
	public static void toStringCombined(String inputSentOne, String inputSentTwo){
		System.out.println(inputSentOne + " " + inputSentTwo);
		return;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		//
		System.out.println("Type a sentence here!");
		String inputSentOne = sc.nextLine();
		System.out.println("Type another sentence here!");
		String inputSentTwo = sc.nextLine();
		//
		toString(inputSentOne);
		toStringCombined(inputSentOne, inputSentTwo);
	}
}
