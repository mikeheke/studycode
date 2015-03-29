package mikeheke.studycode.designpattern.command2;

public class Stereo {

	public String name;
	
	public String state;
	
	public int volume;
	
	public Stereo(String name) {
		this.name = name;
		this.state = ConstantUtils.OFF;
		this.volume = 20;
	}

	public void on() {
		System.out.println("Stereo is on.");
		this.state = ConstantUtils.ON;
	}
	
	public void off() {
		System.out.println("Stereo is off.");
		this.state = ConstantUtils.OFF;
	}
	
	public void display() {
		System.out.println("Stereo: "+this.name
							+", state: "+this.state
							+", volume: "+this.volume);
	}
}
