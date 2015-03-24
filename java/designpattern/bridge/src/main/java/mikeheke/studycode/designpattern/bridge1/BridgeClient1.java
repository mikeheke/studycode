package mikeheke.studycode.designpattern.bridge1;

public class BridgeClient1 {

	public static void main(String[] args) {
		
		Log databaseLog = new DatabaseLog();
		Log fileLog = new FileLog();
		
		LogImp javaLog = new JavaLog();
		LogImp netLog = new NetLog();
		
		databaseLog.logImp = javaLog;
		databaseLog.execute();
		
		databaseLog.logImp = netLog;
		databaseLog.execute();
		
		fileLog.logImp = javaLog;
		fileLog.execute();
		
		fileLog.logImp = netLog;
		fileLog.execute();
	}

}
