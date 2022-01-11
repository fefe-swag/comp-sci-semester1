import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Random rand = new Random();
		int randLength = rand.nextInt(151) + 50;
		int[] num = new int[randLength];
		int min = 1000;
		int max = 0;
		int avg = 0;
		int c = 0;
		System.out.println("This array has a length of " + randLength);
		//
		while(c < num.length) {
			num[c] = rand.nextInt(100) + 1;
			System.out.print(num[c] + " ");
			c++;
		}
		//
		c = 0;
		System.out.println();
		//
		while(c < num.length) {
			if(num[c] < min) {
			min = num[c];
			}
		c++;
		}
		System.out.println("The minimum number here is " + min);
		//
		c = 0;
		//
		while(c < num.length) {
			if(num[c] > max) {
			max = num[c];
			}
		c++;
		}
		System.out.println("The maximum number here is " + max);
		//
		c = 0;
		//
		while(c < num.length) {
			avg = avg + num[c];
			c++;
			//
			if(c == num.length) {
				avg = avg/num.length;
				break;
			}
		}
		System.out.println("The average number in this array is " + avg);
	}
}
