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
				sus[i].setName("Dopey");
				sus[i].setAge(randNum);
			}
			else if(randName == 2) {
				randNum = rand.nextInt(100) + 1;
				sus[i].setName("Doc");
				sus[i].setAge(randNum);
			}
			else if(randName == 3) {
				randNum = rand.nextInt(100) + 1;
				sus[i].setName("Happy");
				sus[i].setAge(randNum);
			}
			else if(randName == 4) {
				randNum = rand.nextInt(100) + 1;
				sus[i].setName("Grumpy");
				sus[i].setAge(randNum);
			}
			else if(randName == 5) {
				randNum = rand.nextInt(100) + 1;
				sus[i].setName("Bashful");
				sus[i].setAge(randNum);
			}
			else if(randName == 6) {
				randNum = rand.nextInt(100) + 1;
				sus[i].setName("Sneezy");
				sus[i].setAge(randNum);
			}
			else {
				randNum = rand.nextInt(100) + 1;
				sus[i].setName("Sleepy");
				sus[i].setAge(randNum);
			}
		}
		for(int i = 0; i < sus.length; i++) { // returns age and name values of each dwarf
			System.out.print(sus[i].getName() + ", ");
			System.out.println(sus[i].getAge());
		}
	}
}
