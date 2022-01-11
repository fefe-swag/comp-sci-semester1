import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String roleWizard = new String("Wizard");
		String roleWarrior = new String("Warrior");
		String roleRogue = new String("Rogue");
		//
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String userRole = sc.nextLine();
		//
		boolean userWizard = roleWizard.equals(userRole);
		boolean userWarrior = roleWarrior.equals(userRole);
		boolean userRogue = roleRogue.equals(userRole);
		//
		if(userWizard)
		{
				//
				System.out.println("You've chosen the Wizard! Excelsior!");
				//
		}
		else if(userWarrior)
		{
				//
				System.out.println("You've chosen the Warrior! For honor!");
				//
		}
		else if(userRogue)
		{
				//
				System.out.println("You've chosen the Rogue! How cunning!");
				//
		}
		else
		{
				//
				System.out.println("I don't recognize that as a role. Please rerun the program.");
				//
		}
	}
}