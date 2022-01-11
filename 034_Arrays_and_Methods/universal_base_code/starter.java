import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	public static void toStringArray(int[] x) {
	int c = 0;
	System.out.print("Here are all the elements of your array: ");
	while(c < x.length) {
		System.out.print(x[c] + " ");
		c++;
		}
	System.out.println();
	return;
	}

	public static int getArrayAverage(int[] x) {
	int c = 0;
	int avg = 0;
	while(c < x.length) {
		avg = avg + x[c];
		c++;
		if(c == x.length) {
			avg = avg/x.length;
			break;
		}
	}
	System.out.print("The average of this array is: ");
	return avg;
	}
	
	public static int getArrayMax(int[] x) {
	int c = 0;
	int max = 0;
	while(c < x.length) {
		if(x[c] > max) {
		max = x[c];
		}
	c++;
	}
	System.out.print("The max of this array is: ");
	return max;
	}
	
	public static int getArrayMin(int[] x) {
	int c = 0;
	int min = 1000;
	while(c < x.length) {
		if(x[c] < min) {
		min = x[c];
		}
	c++;
	}
	System.out.print("The min of this array is: ");
	return min;	
	}
	
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		//
		int[] testArray = new int[100];
		int c = 0;
		//
		while(c < testArray.length) {
		testArray[c] = rand.nextInt(100) + 1;
		c++;
		}
		//
		toStringArray(testArray);
		//
		System.out.println(getArrayAverage(testArray));
		//
		System.out.println(getArrayMax(testArray));
		//
		System.out.println(getArrayMin(testArray));

		
	}
}
