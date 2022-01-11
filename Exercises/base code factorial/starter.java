import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Input a number!");
	int userNum = sc.nextInt();
	int factorialNum = userNum;
	while(true)
	{
		if(factorialNum == 1)
		{
			System.out.println(userNum);
			break;
		}
	factorialNum = factorialNum - 1;
	userNum = userNum * factorialNum;
	}
	}
}