package mikeheke.studycode.designpattern.command2;

public class StereoOffCommand implements Command {
	
	private Stereo stereo;

	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	public void execute() { 
		stereo.off();
	}

	public void undo() { 
		stereo.on();
	}

}
