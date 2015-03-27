package mikeheke.studycode.designpattern.command1;

public class CommandClient1 {

	public static void main(String[] args) {

		TV tv = new TV();
		
		Command turnOnCommand = new TurnOnCommand(tv);
		Command turnOffCommand = new TurnOffCommand(tv);
		Command changeChannelCommand = new ChangeChannelCommand(tv);
		
		Controller controller = new Controller(turnOnCommand, turnOffCommand, changeChannelCommand);
		
		controller.turnOn();
		controller.changeChanel(3);
		controller.turnOff();
		
		controller.turnOn();
		tv.show();
	}

}
