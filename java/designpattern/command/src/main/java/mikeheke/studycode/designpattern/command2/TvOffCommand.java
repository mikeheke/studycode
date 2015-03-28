package mikeheke.studycode.designpattern.command2;

public class TvOffCommand implements Command {
	
	private Tv tv;

	public TvOffCommand(Tv tv) {
		this.tv = tv;
	}

	public void execute() { 
		tv.off();
	}

	public void undo() { 
		tv.on();
	}

}
