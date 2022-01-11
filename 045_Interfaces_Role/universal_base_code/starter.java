import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Role[] sus = new Role[3];
		Random rand = new Random();
		int randAssignment = 0;
		//
		for(int i = 0; i < sus.length; i++) { // assigns each Role index a new role
			randAssignment = rand.nextInt(3) + 1; 
			if(randAssignment == 1) {
				sus[i] = new Wizard();
				System.out.println("wizard name: " +sus[i].getName());
			}
			else if(randAssignment == 2) {
				sus[i] = new Warrior();
				System.out.println("warrior name: " +sus[i].getName());
			}
			else {
				sus[i] = new Druid();
				System.out.println("druid name: " +sus[i].getName());
			}
		}
		
	}
}
