package pkg;
import java.util.Scanner;
import java.util.Random;

public class myCharacter {
	//
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
		System.out.println("------------------------------------------------");
	}

	public String assignment(String userRoleInput) {
		userRole = userRoleInput;
		//
		boolean userWizard = roleWizard.equals(userRole);
		boolean userWarrior = roleWarrior.equals(userRole);
		boolean userRogue = roleRogue.equals(userRole);
		//
		if(userWizard)
		{
				//
				System.out.println(selectWizard);
				System.out.println("Your role is: " + userRole);
				System.out.println("------------------------------------------------");
				//
		}
		else if(userWarrior)
		{
				//
				System.out.println(selectWarrior);
				System.out.println("Your role is: " + userRole);
				System.out.println("------------------------------------------------");
				//
		}
		else if(userRogue)
		{
				//
				System.out.println(selectRogue);
				System.out.println("Your role is: " + userRole);
				System.out.println("------------------------------------------------");
				//
		}
		else
		{
				//
				System.out.println(selectVoid);
				System.out.println("Your role is: No Role");
				System.out.println("------------------------------------------------");
				//
		}
		return returnString;
	}
}