import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will not appear in
		// the command window when you compile and run this program.
		Random rand = new Random();
		int randNumOne = rand.nextInt(10);
		int randNumTwo = rand.nextInt((100 - 1) + 1) + 1;
		//
		double randNum = rand.nextDouble();
		double randNumThr = 2.5 + (randNum * (3.5-2.5));
		double randNumFour = (randNum * (589-14));
		//
		System.out.println("A number between 0 - 9; " + randNumOne + ".");
		System.out.println("A number between 1 - 100; " + randNumTwo + ".");
		System.out.println("A number between 2.5 and 3.5; " + randNumThr + ".");
		System.out.println("A double between 14 and 589; " + randNumFour + ".");
	}
}
//

