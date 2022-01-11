import java.util.Scanner;
import java.util.Random;

class dog {
	public String name;
	public int age;
	public String breed;
	public String nameInput;
	public String breedInput;
	
	public dog(){
	name = "Clifford";
	age = 3;
	breed = "big red dog";

	}
	
	public dog(String nameInput){
	name = nameInput;
	age = 1;
	breed = "dog dog";

	}
	
	public dog(String nameInput, String breedInput){
	name = nameInput;
	breed = breedInput;
	age = 1;
	
	}
	
	public dog(String nameInput, int ageInput){
	name = nameInput;
	age = ageInput;
	breed = "dog dog";
	
	}
	
	public void setName(String nameInput) {
	name = nameInput;
	return;
	}
	
	public void setAge(int ageInput) {
	age = ageInput;
	return;
	}
	
	public void setBreed(String breedInput) {
	name = nameInput;
	return;
	}
	
	public String getName() {
	return name;
	}
	
	public String getBreed() {
	return breed;
	}
	
	public int getAge() {
	return age;
	}
	
	public boolean isSleeping() {
	Random rand = new Random();
	int coinFlip = rand.nextInt(2);
		if(coinFlip == 1) { 
			return true; // true value = sleeping
		}
		else {
			return false;
		}
	}
	
	public void bark() {
	System.out.println(name + " barks!");
	return;
	}
}

class starter {

	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		dog wow = new dog("Odie");
		dog test = new dog("Dog", "chihuahua");
		System.out.print("How old do you want " + wow.name + " to be?: ");
		int ageInput = sc.nextInt();
		wow.setAge(ageInput);
		//
		System.out.println("------------------------------------------------------------");
		System.out.println(wow.getName() + " is " + wow.getAge() + " years old and is a " + wow.getBreed());
		System.out.println(test.getName() + " is " + test.getAge() + " years old and is a " + test.getBreed());
		System.out.println("------------------------------------------------------------");
		//
		if(wow.isSleeping() == true) {
			System.out.println(wow.name + " is sleeping.");
			if(test.isSleeping() == false) {
				test.bark();
			}
			else {
				System.out.println(test.name + " is sleeping.");
			}
		}
		else {
			wow.bark();
			test.bark();
		}
	}
}