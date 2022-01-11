import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		//
		int secretNum = rand.nextInt(999)+1;
		System.out.println("Enter a number between 1 and 1000!");
		//
		while(true)
		{
			int userGuess = sc.nextInt();
			//
			if(secretNum == userGuess)
			{
				System.out.println("You guessed correctly!");
				break;
			}
			System.out.println("That was the wrong number. Try again!");
		}
	}
}
