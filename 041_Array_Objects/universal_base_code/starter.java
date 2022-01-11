import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Wizard[] x = new Wizard[100];
		Warrior[] y = new Warrior[100];
		int i;
		int ii;
		//
		for(i = 0; i < 100; i++) {
			x[i] = new Wizard("Crewmate");
			y[i] = new Warrior("Impostor");
		}
		//
		i = 0;
		ii = 0;
		int counter = 0;
		//
		while(true) {
		if(x[x.length - 1].isDead() == true) {
			for(i = 0; i < 100; i++) {
				if(y[i].isDead() == false) {
					counter++;
				}
			}
			System.out.println("Warriors won with " + counter+ " left in their army!");
			break;
		}
		if(y[y.length - 1].isDead() == true) {
			for(i = 0; i < 100; i++) {
				if(x[i].isDead() == false) {
					counter++;
				}
			}
				System.out.println("Wizards won with " + counter+ " left in their army!");
			break;
		}
			x[i].attack(y[ii]);
			if(x[i].isDead() == true) {
				i++;
			}
			y[ii].attack(x[i]);
			if(y[ii].isDead() == true) {
				ii++;
			}
		}
	}
}

