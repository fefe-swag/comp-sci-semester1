import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		public static int getMode(int[] x) {
			int counter = 0;
			int mode = -1;
			int counterVal = 0;
			int sus = 0;
			for(int i = 0; i < x.length; i++) {
				while(counter < x.length) {
					counter++;
					if(x[i] == x[counter]) {
						counterVal++;
						if(sus < counterVal) {
							mode = x[i];
							sus = counterVal;
						}
					}
				}
				counter = 0;
				counterVal = 0;
			}
			return mode;
		}
		
		public static int getMedian(int[] x) {
			int median = 0
			int check = 0;
			int deck = 0;
			if(x.length % 2 == 0) {
				check = x[x.length/2 - 1];
				deck = x[check + 1];
				median = deck/check;
			}
			else {
				median = x[(x.length/2) + 1];
			}
			return median;
		}
	}
}
