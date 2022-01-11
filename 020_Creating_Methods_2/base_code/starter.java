import java.util.Scanner;
import java.util.Random;

class starter {
	//
	public static void pow(int baseNum, int exponentNum) {
		int powerNum = 1;
		//
		while(true)
		{
			if(exponentNum == 0)
			{
				System.out.println("Your number is " + powerNum);
				break;
			}
			exponentNum = exponentNum - 1;
			powerNum = powerNum * baseNum;
		}
	return;
	}
	//
	public static void main(String args[]) {
		//
		Scanner sc = new Scanner(System.in);
		//
		System.out.println("What is your base number?");
		int baseNum = sc.nextInt();
		System.out.println("What is your exponent?");
		int exponentNum = sc.nextInt();
		//
		pow(baseNum, exponentNum);
		}
	}
