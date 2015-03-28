package mikeheke.studycode.designpattern.command2;

public class TvVolume20Command implements Command {
	
	private Tv tv;

	public TvVolume20Command(Tv tv) {
		this.tv = tv;
	}

	public void execute() { 
		tv.setVolume(20);
	}

	public void undo() { 
	}

}
