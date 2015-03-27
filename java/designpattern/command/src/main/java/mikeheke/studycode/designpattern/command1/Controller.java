package mikeheke.studycode.designpattern.command1;

public class Controller {
	
	private Command turnOnCommand;
	private Command turnOffCommand;
	private Command changeChannelCommand;
	
	public Controller(Command turnOnCommand, Command turnOffCommand,
			Command changeChannelCommand) {
		super();
		this.turnOnCommand = turnOnCommand;
		this.turnOffCommand = turnOffCommand;
		this.changeChannelCommand = changeChannelCommand;
	}

	public void turnOn() {
		this.turnOnCommand.execute();
	}
	
	public void turnOff() {
		this.turnOffCommand.execute();
	}
	
	public void changeChanel(int channel) {
		this.changeChannelCommand.execute(channel);
	}
	
}
