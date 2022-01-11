import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static boolean checkPrime(int primeCounter) {
	int primeNum = primeCounter;
	int primeDiv = primeCounter - 1;
	while(true)
		{
			if(primeNum % primeDiv == 0)
			{
				return false;
			}
			else
			{
				primeDiv--;
			}
			//
			if(primeDiv == 1)
			{
				return true;
			}
		}
	}
	
	public static void printPrimes(int userInput) {
		int primeCounter = userInput - 1;
		while(true)
		{
			if(primeCounter == 1)
			{
				break;
			}
		if(checkPrime(primeCounter) == true)
		{
			System.out.println(primeCounter);
		}
		primeCounter--;
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a number and we'll print out every prime under that number: ");
		int userInput = sc.nextInt();
		printPrimes(userInput);
	}
}