import java.util.Scanner;


class starter {
	public static void main(String args[]) {
		//
		Scanner sc = new Scanner(System.in);
		//
		System.out.print("Input an integer here: ");
		int userInput = sc.nextInt();
		int loopStopper = userInput + 4;
		while(true)
		{
			System.out.println(userInput);
			if(userInput == loopStopper)
			{
				break;
			}
			userInput = userInput + 1;
		}
	}
}
