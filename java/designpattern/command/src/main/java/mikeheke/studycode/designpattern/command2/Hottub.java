package mikeheke.studycode.designpattern.command2;

public class Hottub {

	public String name;
	
	public String state;
	
	public int temperature;
	
	public Hottub(String name) {
		this.name = name;
		this.state = ConstantUtils.OFF;
		this.temperature = 30;
	}

	public void on() {
		System.out.println("Hottub is on.");
		this.state = ConstantUtils.ON;
	}
	
	public void off() {
		System.out.println("Hottub is off.");
		this.state = ConstantUtils.OFF;
	}
	
	public void display() {
		System.out.println("Hottub: "+this.name
							+", state: "+this.state
							+", temperature: "+this.temperature);
	}
}
