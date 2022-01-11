import pkg.*;
import java.util.Scanner;
import java.util.Random;


class turkey {
	public static void main(String args[]) {
		// Your code goes below here
		String[] asciiArray = new String[11];
		// beautiful turkey
		asciiArray[0] = ("░░░░░╔══════╗░░░░░");
		asciiArray[1] = ("░░░░░║ [  ] ║░░░░░");
		asciiArray[2] = ("░░░══╩══════╩══░░░");
		asciiArray[3] = ("░░░░<</¯¯¯¯\\>>░░░░");
		asciiArray[4] = ("░░░<</ Ò  Ó \\>>░░░");
		asciiArray[5] = ("░░░░<\\  \\/  />░░░░");
		asciiArray[6] = ("░░░░░,\\_||_/,░░░░░");
		asciiArray[7] = ("░░░░░░░^||^░░░░░░░");
		asciiArray[8] = ("░░░░░░░░||░░░░░░░░");
		asciiArray[9] = ("░░░░░░░░UU░░░░░░░░");
		asciiArray[10] = ("Happy Thanksgiving!");
		//
		int c = 0;
		while(c < asciiArray.length) {
			System.out.println(asciiArray[c]);
			c++;
		}
	}
}
