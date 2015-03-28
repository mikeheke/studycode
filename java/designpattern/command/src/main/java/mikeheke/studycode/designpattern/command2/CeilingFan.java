package mikeheke.studycode.designpattern.command2;

public class CeilingFan {

	public static final int HIGH = 3;
	
	public static final int MEDIUM = 2;
	
	public static final int LOW = 1;
	
	public static final int OFF = 0;
	
	public String location;
	
	public int speed;

	public CeilingFan(String location, int speed) {
		this.location = location;
		this.speed = OFF;
	}
	
	public void high() {
		this.speed = HIGH;
	}
	
	public void medium() {
		this.speed = MEDIUM;
	}
	
	public void low() {
		this.speed = LOW;
	}
	
	public int getSpeed() {
		return this.speed;
	}
}
