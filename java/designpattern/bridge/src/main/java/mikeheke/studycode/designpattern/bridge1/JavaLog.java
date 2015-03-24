package mikeheke.studycode.designpattern.bridge1;

public class JavaLog extends LogImp {

	@Override
	public void execute() {
		System.out.println("用java平台记录log.");
	}

}
