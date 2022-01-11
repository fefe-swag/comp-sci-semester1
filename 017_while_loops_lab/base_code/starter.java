import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		//
		System.out.print("What is your name? : ");
		String userName = sc.nextLine();
		//
		System.out.println("How many times do you want your name to be repeated? : ");
		int nameNum = sc.nextInt();
		//
		while(true)
		{
			System.out.println(userName);
			if(nameNum == 1)
			{
				break;
			}
			nameNum = nameNum-1;
		}
	}
}