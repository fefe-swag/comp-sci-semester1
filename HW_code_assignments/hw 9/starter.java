import java.util.Scanner;
import java.util.Random;

class starter {

	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int[] sussyImpostor = new int[20];
		int[] innocentCrewmate = new int[20];
		int loopCounter = 0;
		int randNum = 0;
		//
		while(loopCounter < sussyImpostor.length) {
			randNum = rand.nextInt(50) + 1;
			sussyImpostor[loopCounter] = randNum;
			loopCounter++;
		}
		//
		//
		while(true) {
			if(loopCounter == 0) {
				break;
			}
			System.out.print(sussyImpostor[loopCounter - 1] + " ");
			loopCounter--;
		}
		//
		System.out.println();
		//
		while(loopCounter < innocentCrewmate.length) {
			innocentCrewmate[loopCounter] = sussyImpostor[loopCounter];
			loopCounter++;
		}
		//
		loopCounter = 0;
		//
		while(true) {
			if(loopCounter == innocentCrewmate.length) {
				break;
			}
			System.out.print(innocentCrewmate[loopCounter] + " ");
			loopCounter++;
		}
	}
}