import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// thank you, mr poole
		// very cool.
		BaseClass test = new BaseClass();
		Random rand = new Random();
		int randNum;
		int loopCounter = 100;
		while(true) {
			if(loopCounter == 0)
			{
				break;
			}
			randNum = rand.nextInt(99);
			System.out.println(randNum);
			loopCounter--;
		}
	}
}