package mikeheke.studycode.designpattern.command2;

public class Tv {
	
	String name;
	
	String state;
	
	int channel;
	
	int volume;

	public Tv(String name) {
		this.name = name;
		this.channel = 1;
		this.volume = 0;
	}

	public void on() {
		System.out.println("Tv is on.");
		this.state = ConstantUtils.ON;
	}
	
	public void off() {
		System.out.println("Tv is off.");
		this.state = ConstantUtils.OFF;
	}
	
	public void setInputChannel(int channel) {
		System.out.println("Tv's channel is "+channel);
		this.channel = channel;
	}
	
	public void setVolume(int volume) {
		System.out.println("Tv's volume is "+volume);
		this.volume = volume;
	}
	
	public int getChannel() {
		return this.channel;
	}
	
	public String toString() {
		StringBuffer buf = new StringBuffer();
		buf.append("[ tv: "+this.name+", ");
		buf.append("state: "+this.state+", ");
		buf.append("channel: "+this.channel+", ");
		buf.append("volume: "+this.volume+" ");
		return buf.toString();
	}
}
