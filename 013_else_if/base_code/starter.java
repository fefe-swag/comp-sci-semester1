import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int randNum = rand.nextInt((1000- 1) + 1) + 1;
		//
		System.out.println("I picked a number between one and a thousand. Guess which number I picked! Choose wisely.");
		int userGuess = sc.nextInt();
		//
		boolean boolResult = (userGuess == randNum);
		boolean boolGreater = (userGuess > randNum);
		//
		if(boolResult)
		{
				//
				System.out.println("Congrats! You chose the number I picked!");
				//
		}
		else if(boolGreater)
		{
				//
				System.out.println("Nice try; you were a little too high, though.");
				System.out.println("The number I chose was " + randNum + ".");
				//
		}
		else
		{
				//
				System.out.println("Nice try; you were a little too low, though.");
				System.out.println("The number I chose was " + randNum + ".");
				//
		}
	}
}
