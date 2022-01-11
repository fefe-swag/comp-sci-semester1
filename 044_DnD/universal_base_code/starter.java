import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Warrior x = new Warrior();
		Wizard y = new Wizard();
		Druid z = new Druid("Sussy");
		
		System.out.println("warrior name: " +x.getName());
		System.out.println("wizard name: " +y.getName());
		System.out.println("druid name: " +z.getName());
	}
}
