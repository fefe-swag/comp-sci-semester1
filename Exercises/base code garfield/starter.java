import pkg.*;
import java.util.Scanner;
import java.util.Random;

class Cat {
	public String name;
	
	public Cat(){
	name = "Garfield";

	}
	
	public Cat(String a){
	name = a;

	}
	
	public void meow() {
	System.out.println(name + " meows at you.");
	return;
	}
}

class starter {

	public static void main(String args[]) {
		// Your code goes below here
		Cat nya = new Cat();
		nya.meow();
		Cat no = new Cat("Yo mama");
		no.meow();
	}
}