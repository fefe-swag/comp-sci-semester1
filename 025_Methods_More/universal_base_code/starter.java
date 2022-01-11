import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		myCharacter character = new myCharacter();
		//
		System.out.println("Would you like to be a Wizard, a Warrior, or a Rogue? (CAPS SENSITIVE!)");
		String userRoleInput = sc.nextLine();
		//
		System.out.println(character.setRole(userRoleInput));
		//
		System.out.println("You have 25 points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely, young one.");
		System.out.print("Strength (1-10): ");
		int strengthPts = sc.nextInt();
		//
		System.out.print(character.setStrength(strengthPts));
		//
		System.out.println(" points left to use.");
		System.out.print("Dexterity (1-10): ");
		int dexterityPts = sc.nextInt();
		//
		System.out.print(character.setDexterity(dexterityPts));
		//
		System.out.println(" points left to use.");
	}
}
