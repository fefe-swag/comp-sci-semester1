package pkg;
import java.util.Scanner;
import java.util.Random;

public class myCharacter {
	public int remainPts = 25;
	public int remainPtsTwo = 0;
	public int remainPtsThr = 0;
	public int remainPtsFour = 0;
	public int remainPtsFive = 0;
	//
	public int strengthPts = 0;
	public int dexterityPts = 0;
	public int intelPts = 0;
	public int constPts = 0;
	public int charisPts = 0;
	public String roleWizard = new String("Wizard");
	public String roleWarrior = new String("Warrior");
	public String roleRogue = new String("Rogue");
	public String userRole = new String("No Role");
	public String userRoleInput = new String();
	public String returnString = new String(" ");
	public String selectWizard = new String("You've chosen the Wizard! Excelsior!");
	public String selectWarrior = new String("You've chosen the Warrior! For honor!");
	public String selectRogue = new String("You've chosen the Rogue! How cunning!");
	public String selectVoid = new String("I don't recognize that as a role. Please rerun the program.");
	//
	public myCharacter() {
		System.out.println("Your role is: " + userRole);
		System.out.println("Your strength trait is " + strengthPts);
		System.out.println("Your dexterity trait is " + dexterityPts);
		System.out.println("Your intelligence trait is " + intelPts);
		System.out.println("Your constitution trait is " + constPts);
		System.out.println("Your charisma trait is " + charisPts);
		System.out.println("------------------------------------------------");
	}
	
	public String myToString() {
		System.out.println("Your role is: " + userRole);
		System.out.println("Your strength trait is " + strengthPts);
		System.out.println("Your dexterity trait is " + dexterityPts);
		System.out.println("Your intelligence trait is " + intelPts);
		System.out.println("Your constitution trait is " + constPts);
		System.out.println("Your charisma trait is " + charisPts);
		return returnString;
	}

	public String setRole(String userRoleInput) {
		userRole = userRoleInput;
		//
		boolean userWizard = roleWizard.equals(userRole);
		boolean userWarrior = roleWarrior.equals(userRole);
		boolean userRogue = roleRogue.equals(userRole);
		//
		if(userWizard)
		{
				//
				return selectWizard;
				//
		}
		else if(userWarrior)
		{
				//
				return selectWarrior;
				//
		}
		else if(userRogue)
		{
				//
				return selectRogue;
				//
		}
		else
		{
				//
				userRole = new String("No Role");
				return selectVoid;
				//
		}
	}
	
	public int setStrength(int strengthPts) {
	
	}
	
	public int setDexterity(int dexterityPts) {
	
	}
}