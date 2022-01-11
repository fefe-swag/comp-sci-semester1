import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Ascii test = new Ascii("Cactus");
		Ascii testTwo = new Ascii();
		Ascii testThr = new Ascii("Dog", "Odie", 3);
		Ascii testFour = new Ascii("Other", "yo mama", 4);
		Ascii custom = new Ascii("Custom", 2);
		//
		test.printArt();
		//
		testTwo.printArt();
		//
		testThr.printArt();
		//
		testFour.setAscii(":)");
		testFour.printArt();
		//
		custom.printArt();
		
	}
}
