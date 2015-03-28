package mikeheke.studycode.designpattern.command2;

public class TvChannel3Command implements Command {
	
private Tv tv;
	
	private int preChannel;

	public TvChannel3Command(Tv tv) {
		this.tv = tv;
	}

	public void execute() { 
		preChannel = tv.getChannel();
		tv.setInputChannel(3);
	}

	public void undo() { 
		if (this.preChannel == 1) {
			tv.setInputChannel(1);
		} else if (this.preChannel == 2) {
			tv.setInputChannel(2);
		} else if (this.preChannel == 3) {
			tv.setInputChannel(3);
		}
	}

}
