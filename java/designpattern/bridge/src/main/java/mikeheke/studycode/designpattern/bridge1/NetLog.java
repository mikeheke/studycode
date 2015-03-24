package mikeheke.studycode.designpattern.bridge1;

public class NetLog extends LogImp {

	@Override
	public void execute() {
		System.out.println("用.net平台记录log.");
	}

}
