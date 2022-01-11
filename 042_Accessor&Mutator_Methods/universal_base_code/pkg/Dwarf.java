package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dwarf {
	int age;
	String name;

	public Dwarf() {
		name = "";
		age = 0;
	}
	
	public void setName(String x) {
		name = x;
	}
	
	public void setAge(int y) {
		age = y;
	}
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

}

