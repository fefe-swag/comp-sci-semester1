import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		myCharacter test = new myCharacter();
		//
		System.out.println("Would you like to be a Wizard, a Warrior, or a Rogue? (CAPS SENSITIVE!)");
		String userRoleInput = sc.nextLine();
		//
		System.out.println(test.assignment(userRoleInput));
		
		//
	}
}
