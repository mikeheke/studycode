package mikeheke.studycode.designpattern.command2;

public class TvVolume0Command implements Command {
	
	private Tv tv;

	public TvVolume0Command(Tv tv) {
		this.tv = tv;
	}

	public void execute() { 
		tv.setVolume(0);
	}

	public void undo() { 
	}

}
