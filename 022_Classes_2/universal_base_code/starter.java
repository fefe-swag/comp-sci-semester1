import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		myCharacter userStats = new myCharacter();
		System.out.println("You have " + userStats.strengthPts + " Strength points.");
		System.out.println("You have " + userStats.dexterityPts + " Dexterity points.");
		System.out.println("You have " + userStats.intelPts + " Intelligence points.");
		System.out.println("You have " + userStats.constPts + " Constitution points.");
		System.out.println("You have " + userStats.charisPts + " Charisma points.");

		
	}
}
