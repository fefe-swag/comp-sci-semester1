import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will not appear in
		// the command window when you compile and run this program. (dumb comment)
		Scanner sc = new Scanner(System.in);
		//
		System.out.println("Please input an integer!");
		int numTwo = sc.nextInt();
		System.out.println("Please input another integer that isn't the same as your first!");
		int numOne = sc.nextInt();
		//
		boolean boolAnswer = numTwo > numOne;
		boolean boolAnswer2 = numOne > numTwo;
		//
		if(boolAnswer)
		{
				//
				System.out.println( + numTwo + " is greater than " + numOne + ".");
				//
		}
		if(boolAnswer2)
		{
				//
				System.out.println( + numOne + " is greater than " + numTwo + ".");
				//
		}
	}
}
