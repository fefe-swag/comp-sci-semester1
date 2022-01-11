import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);	
		//
		System.out.println("What is your full name?");
		String name = sc.nextLine();
		//
		System.out.println("How old are you?");
		int age = sc.nextInt();
		//
		System.out.println("What is your birthday month? (1-12)");
		int bdayMonth = sc.nextInt();
		//
		System.out.println("What is your birthday day? (1-31)");
		int bdayDay = sc.nextInt();
		//
		System.out.println("What is your birthday year?");
		int bdayYear = sc.nextInt();
		//
		System.out.println("How much is a dollar and fifty cents? (#.##)");
		double bank = sc.nextDouble();
		//
		System.out.println("Your name is " + name + " and you were born on " + bdayMonth + "/" + bdayDay + "/" + bdayYear + ".");
		System.out.println("You are " + age + " years old!");
		System.out.println("You have " + bank + " in your wallet. Broke.");
	}
}
