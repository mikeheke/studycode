package mikeheke.studycode.designpattern.strategy1;

public class Warrior {

	private Weapon weapon;

	public Warrior(Weapon weapon) {
		super();
		this.weapon = weapon;
	}
	
	public void fighting() {
		this.weapon.fighting();
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
}
