import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		Dwarf[] sus = new Dwarf[100];
		int randName;
		int randNum;
		//
		for(int i = 0; i < sus.length; i++) { // fills in Dwarf array with dwarves, randomized names and ages
			sus[i] = new Dwarf();
			randName = rand.nextInt(7) + 1;
			//
			if(randName == 1) {
				randNum = rand.nextInt(100) + 1;
				sus[i] = new Dwarf("Dopey", randNum);

			}
			else if(randName == 2) {
				randNum = rand.nextInt(100) + 1;
				sus[i] = new Dwarf("Doc", randNum);
			}
			else if(randName == 3) {
				randNum = rand.nextInt(100) + 1;
				sus[i] = new Dwarf("Happy", randNum);
			}
			else if(randName == 4) {
				randNum = rand.nextInt(100) + 1;
				sus[i] = new Dwarf("Grumpy", randNum);
			}
			else if(randName == 5) {
				randNum = rand.nextInt(100) + 1;
				sus[i] = new Dwarf("Bashful", randNum);
			}
			else if(randName == 6) {
				randNum = rand.nextInt(100) + 1;
				sus[i] = new Dwarf("Sneezy", randNum);
			}
			else {
				randNum = rand.nextInt(100) + 1;
				sus[i] = new Dwarf("Sleepy", randNum);
			}
		}
		for(int i = 0; i < sus.length; i++) { // returns age and name values of each dwarf
			System.out.print(sus[i].getName() + ", ");
			System.out.println(sus[i].getAge());
		}
		//
		int ii = 0;
		//
		for(int i = 1; i < sus.length; i++) { // checks 1st dwarf and rest of dwarves names for duplicates
			if(sus[0].isSameName(sus[i].getName())) { // "if first dwarf's name equal to other dwarves' names, skipping first dwarf"
				ii++;
			}
		}
		System.out.println("There were " + ii + " duplicates of the name " + sus[0].getName());
	}
}
