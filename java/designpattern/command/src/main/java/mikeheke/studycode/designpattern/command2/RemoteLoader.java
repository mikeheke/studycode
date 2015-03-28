package mikeheke.studycode.designpattern.command2;

public class RemoteLoader {

	public static void main(String[] args) {
		Tv tv = new Tv("长虹彩电");
		Light light = new Light("大厅灯管");
		RemoteControl control = new RemoteControl();
		
		NoCommand noCmd = new NoCommand();
		LightOnCommand lightOnCmd = new LightOnCommand(light);
		LightOffCommand lightOffCmd = new LightOffCommand(light);
		TvOnCommand tvOnCmd = new TvOnCommand(tv);
		TvOffCommand tvOffCmd = new TvOffCommand(tv);
		TvChannel1Command tvChannel1Cmd = new TvChannel1Command(tv);
		TvChannel2Command tvChannel2Cmd = new TvChannel2Command(tv);
		TvChannel3Command tvChannel3Cmd = new TvChannel3Command(tv);
	
		control.setCommand(0, tvOnCmd, tvOffCmd);
		control.setCommand(1, tvChannel1Cmd, noCmd);
		control.setCommand(2, tvChannel2Cmd, noCmd);
		control.setCommand(3, tvChannel3Cmd, noCmd);
		System.out.println(control);
		
		control.onButtonWasPushed(0);
		control.onButtonWasPushed(2);
		control.onButtonWasPushed(3);
		control.undoButtonWasPushed();
		
		System.out.println(tv);
		
		//test
//		control.setCommand(0, lightOnCmd, lightOffCmd);
//		control.setCommand(1, tvOnCmd, tvOffCmd);
//		System.out.println(control);
//		
//		control.onButtonWasPushed(0);
//		control.offButtonWasPushed(0);
//		
//		control.onButtonWasPushed(1);
//		control.undoButtonWasPushed();
		
		
	}

}
