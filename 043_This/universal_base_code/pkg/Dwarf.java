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
	
	public Dwarf(String name, int age) {
		this.name = name;
		this.age = age;
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
	
	public boolean isSameName(String name) {
		if(name == this.name) {
			return true;
		}
		else {
			return false;
		}
	}
}

