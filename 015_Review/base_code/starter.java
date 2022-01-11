import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String roleWizard = new String("Wizard");
		String roleWarrior = new String("Warrior");
		String roleRogue = new String("Rogue");
		//
		System.out.println("What is your name?");
		String userName = sc.nextLine();
		//
		System.out.println("Very good. And what is your title?");
		String userTitle = sc.nextLine();
		//
		System.out.println("Very well. Would you like to be a Wizard, Warrior, or Rogue? (CAPS SENSITIVE!)");
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
		//
		System.out.println();
		System.out.println("You have 25 points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely, young one.");
		System.out.print("Strength (1-10): ");
		int strengthPts = sc.nextInt();
		int remainPts = 25;
		//
		boolean overMaxStrngth = (11 <= strengthPts);
		if(overMaxStrngth)
		{
				//
				System.out.print("Please input a smaller value. Strength (1-10): ");
				int strengthPtsRetry = sc.nextInt();
				int remaining = (remainPts - strengthPtsRetry);
				System.out.println("You now have " + remaining + " points left to use.");
				remainPts = remainPts - strengthPtsRetry;
				//
		}
		else
		{
				//
				int remaining = (remainPts - strengthPts);
				System.out.println("You now have " + remaining + " points left to use.");
				remainPts = remainPts - strengthPts;
				//
		} 
		int remainPtsTwo = remainPts;
		System.out.print("Dexterity (1-10): ");
		int dexterityPts = sc.nextInt();
		//
		boolean overMaxDxtrity = (11 <= dexterityPts);
		boolean overRemainDx = (remainPtsTwo < dexterityPts);
		if(overMaxDxtrity)
		{
				//
				System.out.print("Please input a smaller value. Dexterity (1-10): ");
				int dexterityPtsRetry = sc.nextInt();
				int remaining = (remainPtsTwo - dexterityPtsRetry);
				System.out.println("You now have " + remaining + " points left to use.");
				remainPtsTwo = remainPtsTwo - dexterityPtsRetry;
				//
		}
		else if(overRemainDx)
		{
				//
				System.out.print("Please input a smaller value. Dexterity (1-10): ");
				int dexterityPtsRetry = sc.nextInt();
				int remaining = (remainPtsTwo - dexterityPtsRetry);
				System.out.println("You now have " + remaining + " points left to use.");
				remainPtsTwo = remainPtsTwo - dexterityPtsRetry;
				//
		}
		else
		{
				//
				int remaining = (remainPtsTwo - dexterityPts);
				System.out.println("You now have " + remaining + " points left to use.");
				remainPtsTwo = remainPtsTwo - dexterityPts;
				//
		}
		int remainPtsThr = remainPtsTwo;
		System.out.print("Intelligence (1-10): ");
		int intelPts = sc.nextInt();
		//
		boolean overMaxIntel = (11 <= intelPts);
		boolean overRemainItl = (remainPtsThr < intelPts);
		if(overMaxIntel)
		{
				//
				System.out.print("Please input a smaller value. Intelligence (1-10): ");
				int intelPtsRetry = sc.nextInt();
				int remaining = (remainPtsThr - intelPtsRetry);
				System.out.println("You now have " + remaining + " points left to use.");
				remainPtsThr = remainPtsThr - intelPtsRetry;
				//
		}
		else if(overRemainItl)
		{
				//
				System.out.print("Please input a smaller value. Intelligence (1-10): ");
				int intelPtsRetry = sc.nextInt();
				int remaining = (remainPtsThr - intelPtsRetry);
				System.out.println("You now have " + remaining + " points left to use.");
				remainPtsThr = remainPtsThr - intelPtsRetry;
				//
		}
		else
		{
				//
				int remaining = (remainPtsThr - intelPts);
				System.out.println("You now have " + remaining + " points left to use.");
				remainPtsThr = remainPtsThr - intelPts;
				//
		}
		int remainPtsFour = remainPtsThr;
		System.out.print("Constitution (1-10): ");
		int constPts = sc.nextInt();
		//
		boolean overMaxConst = (11 <= constPts);
		boolean overRemainCns = (remainPtsFour < constPts);
		if(overMaxConst)
		{
				//
				System.out.print("Please input a smaller value. Constitution (1-10): ");
				int constPtsRetry = sc.nextInt();
				int remaining = (remainPtsFour - constPtsRetry);
				System.out.println("You now have " + remaining + " points left to use.");
				remainPtsFour = remainPtsFour - constPtsRetry;
				//
		}
		else if(overRemainCns)
		{
				//
				System.out.print("Please input a smaller value. Constitution (1-10): ");
				int constPtsRetry = sc.nextInt();
				int remaining = (remainPtsFour - constPtsRetry);
				System.out.println("You now have " + remaining + " points left to use.");
				remainPtsFour = remainPtsFour - constPtsRetry;
				//
		}
		else
		{
				//
				int remaining = (remainPtsFour - constPts);
				System.out.println("You now have " + remaining + " points left to use.");
				remainPtsFour = remainPtsFour - constPts;
				//
		}
		int remainPtsFive = remainPtsFour;
		System.out.print("Charisma (1-10): ");
		int charisPts = sc.nextInt();
		//
		boolean overMaxCharis = (11 <= charisPts);
		boolean overRemainChs = (remainPtsFive < charisPts);
		if(overMaxCharis)
		{
				//
				System.out.print("Please input a smaller value. Charisma (1-10): ");
				int charisPtsRetry = sc.nextInt();
				int remaining = (remainPtsFive - charisPtsRetry);
				System.out.println("You now have " + remaining + " points left to use.");
				remainPtsFive = remainPtsFive - charisPtsRetry;
		}
		else if(overRemainChs)
		{
				//
				System.out.print("Please input a smaller value. Charisma (1-10): ");
				int charisPtsRetry = sc.nextInt();
				int remaining = (remainPtsFive - charisPtsRetry);
				System.out.println("You now have " + remaining + " points left over.");
				remainPtsFive = remainPtsFive - charisPtsRetry;
		}
		else
		{
				//
				int remaining = (remainPtsFive - charisPts);
				System.out.println("You now have " + remaining + " points left over.");
				remainPtsFive = remainPtsFive - charisPts;
		}
		//
		System.out.println("--------------------------------------------------");
		System.out.println("You are " + userName + ", the " + userTitle + " of CVHS, and a " + userRole + " with the following stats!");
		//
		System.out.println();
		//
		System.out.println("Strength - " + (25 - remainPts));
		System.out.println("Dexterity - " + (remainPts - remainPtsTwo));
		System.out.println("Intelligence - " + (remainPtsTwo - remainPtsThr));
		System.out.println("Constitution - " + (remainPtsThr - remainPtsFour));
		System.out.println("Charisma - " + (remainPtsFour - remainPtsFive));
		//
		System.out.println();
		//
		System.out.println("Good luck in your journey, " + userName + "!");
	}
}