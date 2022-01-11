import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// for future me:
		// define these answers to variables and print out those variables
		// so that reading the code is easier, and so that it's much more 
		// manageable if you need to reuse that value.
		// i will not change it now because i am lazy and it works; but keep this in mind for later
		Scanner sc = new Scanner(System.in);
		System.out.println("The answer to question one is " + Math.max(13-6*11, 30%7*(-2)) + ".");
		//
		System.out.println("The answer to question two is " + Math.sqrt(3*8+31%7) + ".");
		//
		System.out.println("The answer to question three is " + Math.pow(37/3, 35%21) + ".");
		//
		System.out.println("The answer to question four is " + Math.max(Math.pow(2,14%3), (Math.sqrt(2*6))) + ".");
	}
}
