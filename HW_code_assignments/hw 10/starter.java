import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static void arrayDupes(int[] x) { // finds duplicates of a randomized number in a specified array!
		Random rand = new Random();
		//
		int randNum = rand.nextInt(10) + 1;
		int dupeNum = 0;
		System.out.println("Target number: "+ randNum);
		//
		for(int i = 0; i < x.length; i++) {
			if(x[i] == randNum) {
				System.out.println("Duplicate found at index "+(i+1));
				dupeNum++;
			}
		}
		System.out.println("Total number of duplicates found of random number " + randNum + " is " + dupeNum);
		return;
	}
	
	public static void consecutiveNum(int[] x) { // finds consecutive numbers in a specified array!
		System.out.println("Looking for consecutive numbers in this array...");
		//
		for(int i = 0; i < x.length - 1; i++) {
			if(x[i] == x[i+1]) {
				System.out.println("Two in a row found at indexes " + (i+1) + " and " + (i+2) + ", value of " + x[i]);
			}
		}
		return;
	}
	
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int[] ar = new int[20];
		//
		for(int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt(10) + 1;
		}
		//
		System.out.println("----------------------------------------------------------------");
		System.out.print("The 20 numbers are: ");
		for(int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println("\n----------------------------------------------------------------");
		//
		arrayDupes(ar);
		//
		System.out.println("----------------------------------------------------------------");
		//
		consecutiveNum(ar);
		//
		System.out.println("----------------------------------------------------------------");
	}
}