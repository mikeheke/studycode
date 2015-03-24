package mikeheke.studycode.designpattern.bridge1;

public class FileLog extends Log {

	@Override
	public void execute() {
		System.out.println("记录log到文件中--->");
		this.logImp.execute();
	}

}
