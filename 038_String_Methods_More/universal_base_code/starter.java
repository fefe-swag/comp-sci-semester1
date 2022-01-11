import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		int booleanValue;
		//
		System.out.print("enter a FULL name, with a space in-between the first and last name: ");
		String nameInput = sc.nextLine();
		//
		System.out.print("cool. their last name is:");
		//
		for(int i = 0; i < nameInput.length(); i++) {
			booleanValue = (nameInput.substring(i, i+1)).compareTo(" ");
			if(booleanValue == 0) {
				System.out.println(nameInput.substring(i, nameInput.length()));
			}
		}
	}
}
