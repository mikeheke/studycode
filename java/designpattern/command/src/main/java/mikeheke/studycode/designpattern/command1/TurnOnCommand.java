package mikeheke.studycode.designpattern.command1;

public class TurnOnCommand implements Command {
	
	private TV tv;

	public TurnOnCommand(TV tv) {
		super();
		this.tv = tv;
	}

	public void execute(Object... obj) {
		tv.turnOn();
	}

}
