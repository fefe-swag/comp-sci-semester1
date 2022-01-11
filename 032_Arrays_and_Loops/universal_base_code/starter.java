import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Random rand = new Random();
		int[] randArray = new int[1000];
		int arrayCount = 0;
		int randNum;
		//
		while(arrayCount < randArray.length) {
			randNum = rand.nextInt(999);
			randArray[arrayCount] = randNum;
			arrayCount++;
		}
		//
		while(true) {
			if(arrayCount == 0) {
				break;
			}
			System.out.println(randArray[arrayCount - 1]);
			arrayCount--;
		}
	}
}
