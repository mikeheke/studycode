package mikeheke.studycode.designpattern.command1;

public class TurnOffCommand implements Command {
	
	private TV tv;

	public TurnOffCommand(TV tv) {
		super();
		this.tv = tv;
	}

	public void execute(Object... obj) {
		tv.turnOff();
	}

}
