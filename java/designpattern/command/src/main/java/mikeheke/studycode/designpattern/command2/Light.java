package mikeheke.studycode.designpattern.command2;

public class Light {

	public String name;
	
	public String state;
	
	public Light(String name) {
		this.name = name;
		this.state = ConstantUtils.OFF;
	}

	public void on() {
		System.out.println("Light is on.");
		this.state = ConstantUtils.ON;
	}
	
	public void off() {
		System.out.println("Light is off.");
		this.state = ConstantUtils.OFF;
	}
}
