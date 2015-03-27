package mikeheke.studycode.designpattern.command1;

public class TV {
	
	private String tvName;
	
	private int curChannel = 1;
	
	private String tvState = "关机";
	
	public void turnOn() {
		System.out.println("执行电视机开机操作...");
		this.tvState = "开机";
	}
	
	public void turnOff() {
		System.out.println("执行电视机关机操作...");
		this.tvState = "关机";
	}
	
	public void changeChanel(int channel) {
		System.out.println("执行电视机切换频道操作，切换为频道: "+channel);
		this.curChannel = channel;
	}
	
	public void show() {
		System.out.println("电视机当前状态： "+this.tvState+", 当前频道: "+this.curChannel);
	}
	
}
