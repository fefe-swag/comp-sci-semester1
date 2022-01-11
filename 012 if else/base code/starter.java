import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int randNum = rand.nextInt((1001- 1) + 1) + 1;
		//
		System.out.println("I picked a number between one and a thousand. Guess which number I picked! Choose wisely.");
		int userGuess = sc.nextInt();
		//
		boolean boolResult = (userGuess == randNum);
		if(boolResult)
		{
				//
				System.out.println("Congrats! You chose the number I picked!");
				//
		}
		else
		{
				//
				System.out.println("That wasn't my number; you were a little off.");
				//
		}
	}
}