package mikeheke.studycode.designpattern.strategy1;

public class StrategyClient1 {

	public static void main(String[] args) {
		Weapon knife = new Knife();
		Weapon bow = new Bow();
		Weapon gun = new Gun();
		
		Warrior warrior = new Warrior(knife);
		warrior.fighting();
		
		System.out.println("武士切换武器...");
		warrior.setWeapon(gun);
		warrior.fighting();
		
		System.out.println("武士切换武器...");
		warrior.setWeapon(bow);
		warrior.fighting();
	}

}
