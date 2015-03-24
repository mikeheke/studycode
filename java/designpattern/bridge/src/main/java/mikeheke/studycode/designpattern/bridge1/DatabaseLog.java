package mikeheke.studycode.designpattern.bridge1;

public class DatabaseLog extends Log {

	@Override
	public void execute() {
		System.out.println("记录log到数据库--->");
		this.logImp.execute();
	}

}
