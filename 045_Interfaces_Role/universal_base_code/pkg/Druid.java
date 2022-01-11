package pkg;
import java.util.Scanner;
import java.util.Random;


public class Druid implements Role{
	Random rand = new Random();
	String name;
	int health = rand.nextInt(15) + 1;
	int attack = rand.nextInt(15) + 1;
	int randomRoll = 0;
	//
	public Druid() {
		name = "Merlin";
		health = health;
		attack = attack;
	}
	
	public Druid(String name) {
		this.name = name;
		health = health;
		attack = attack;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public int getHealth() {
		return health;
	}
	
	public String getName() {
		return name;
	}
	
	public void attack(Warrior x) {
	randomRoll = rand.nextInt(attack) + 1;
	x.setHealth(x.getHealth() - randomRoll);
	System.out.println(name + " attacks " + x.getName() + " for " + randomRoll + ", who has " + x.getHealth() + " HP.");
	}
	
	public void attack(Wizard x) {
	randomRoll = rand.nextInt(attack) + 1;
	x.setHealth(x.getHealth() - randomRoll);
	System.out.println(name + " attacks " + x.getName() + " for " + randomRoll + ", who has " + x.getHealth() + " HP.");
	}
}

