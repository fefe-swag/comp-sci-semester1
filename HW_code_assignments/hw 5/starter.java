import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static void gambling() {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		//
		int cashCashMoney = 100;		// great variable name!
		int randNumOne;
		int randNumTwo;
		int randNumThr;
		int userWager;
		String userPlay = new String();
		System.out.println("Welcome to the slot machine! You have 100 dollars to spend here; and you can win BIG...BIG...BIG!!!");
		System.out.println("But it'll take a little luck...and a lot of prayer.");
		System.out.println("So...");
		while(true)
		{
			if(cashCashMoney <= 0)
				{
					System.out.println(); 
					System.out.println("Sorry... you lost all your money. Come back again another time, and see if luck's on your side then!");
					break;
				}
		System.out.println();
		System.out.print("Would you like to play? (y/n): ");
		userPlay = sc.nextLine();
			if(userPlay.equals("Yes") || userPlay.equals("yes") || userPlay.equals("y") || userPlay.equals("Y"))
				{
					System.out.println();
					System.out.println("Alright, let's play!");
				}
			else if(userPlay.equals("No") || userPlay.equals("no") || userPlay.equals("n") || userPlay.equals("N"))
				{
					System.out.println();
					System.out.println("Aw, alright! Come back another time!");
					break;
				}
			else
				{
					System.out.println();
					System.out.println("Sorry...what?");
					break;
				}
										// i swear there was a cleaner/simpler way of checking if one string was equal to multiple other strings...
										// oh well. it works
		randNumOne = rand.nextInt(10);
		randNumTwo = rand.nextInt(10);
		randNumThr = rand.nextInt(10);
		System.out.println();
		System.out.print("What's your wager? :: ");
		userWager = sc.nextInt();
		if(userWager > cashCashMoney + 1)
		{
			while(true)
			{
				System.out.println();
				System.out.print("Sorry, you wagered more than you have. Try again :: ");
				userWager = sc.nextInt();
				if(userWager < cashCashMoney)
				{
					break;
				}
			}
		}
		System.out.println();
		System.out.println(randNumOne + " || " + randNumTwo + " || " + randNumThr);
			if(randNumOne == randNumTwo && randNumTwo == randNumThr)
			{
				userWager = userWager * 3;
				cashCashMoney = cashCashMoney + userWager;
				System.out.println();
				System.out.println("Jackpot!!! Your wager was tripled! You now have " + cashCashMoney + " dollars left!");
			}
			else if((randNumOne == randNumTwo) || (randNumOne == randNumThr) || (randNumTwo == randNumThr)) 
			{
				userWager = userWager * 2;
				cashCashMoney = cashCashMoney + userWager;
				System.out.println();
				System.out.println("Nice! Your wager was doubled! You now have " + cashCashMoney + " dollars left!");
			}
			else
			{
				cashCashMoney = cashCashMoney - userWager;
				System.out.println();
				System.out.println("Better luck next time...you lost " + userWager + " dollars. You now have " + cashCashMoney + " dollars left.");
			}
		userPlay = sc.nextLine();		// i have ZERO clue why i need to reprompt in the last line of the while loop AND again 
										// in the start of the while loop
										// but ??? it's the only way it works lol
		}
	}
	public static void main(String args[]) {
		// Wow
		// How exciting
		// One line of code
		// in my actual main method
		// How cool
		// So amazing
		// Here it comes
		gambling();
		// Yeah!!!!
		// That's hype
	}
}