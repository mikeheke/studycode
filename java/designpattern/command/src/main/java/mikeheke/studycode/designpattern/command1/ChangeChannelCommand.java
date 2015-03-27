package mikeheke.studycode.designpattern.command1;

public class ChangeChannelCommand implements Command {
	
	private TV tv;
	
	private int channel;

	public ChangeChannelCommand(TV tv) {
		super();
		this.tv = tv;
	}

	public void execute(Object... obj) {
		if (obj != null && obj.length ==1) {
			tv.changeChanel((Integer)obj[0]);
		}
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}
	
}
