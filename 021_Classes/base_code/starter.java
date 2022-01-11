import java.util.Scanner;
import java.util.Random;

class Character {
	String userRole = new String("Wizard");
	int strengthPts = 5;
	int dexterityPts = 4;
	int intelPts = 6;
	int charisPts = 1;
	int constPts = 2;
}

class starter {
	public static void main(String args[]) {
		Character userStats = new Character();
		System.out.println("You have " + userStats.strengthPts + " Strength points.");
		System.out.println("You have " + userStats.dexterityPts + " Dexterity points.");
		System.out.println("You have " + userStats.intelPts + " Intelligence points.");
		System.out.println("You have " + userStats.constPts + " Constitution points.");
		System.out.println("You have " + userStats.charisPts + " Charisma points.");
	}
}
