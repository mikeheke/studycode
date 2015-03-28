package mikeheke.studycode.designpattern.command2;

public class TvVolume10Command implements Command {
	
	private Tv tv;

	public TvVolume10Command(Tv tv) {
		this.tv = tv;
	}

	public void execute() { 
		tv.setVolume(10);
	}

	public void undo() { 
	}

}
