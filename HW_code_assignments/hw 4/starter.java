import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		//
		System.out.println("Input an integer!");
		int userInt1 = sc.nextInt();
		System.out.println("Input another integer!");
		int userInt2 = sc.nextInt();
		//
		if(userInt1 % 2 == 0)
		{
			System.out.print("Your first integer is even, ");
		}
		else
		{
			System.out.print("Your first integer is odd, ");
		}
		//
		if(userInt2 % 2 == 0)
		{
			System.out.println("and your second integer is even!");
		}
		else
		{
			System.out.println("and your second integer is odd!");
		}
		//
		if(userInt1 % 3 == 0 && userInt1 % 4 == 0 && userInt1 % 5 == 0)
		{
			System.out.print("Your first integer is divisible by 3, 4 AND 5, ");
		}
		else
		{
			System.out.print("Your first integer is not divisible by 3, 4 AND 5, ");
		}
			//
		if(userInt2 % 3 == 0 && userInt2 % 4 == 0 && userInt2 % 5 == 0)
		{
			System.out.print("and your second integer is divisible by 3, 4 AND 5!");
		}
		else
		{
			System.out.print("and your second integer is not divisible by 3, 4, AND 5!");
		}
	}
}
