package mikeheke.studycode.designpattern.command2;


public class CommandClient2 {

	public static void main(String[] args) {
		Light light1 = new Light("Living Room's Light");
		Light light2 = new Light("Bed Room's Light");
		Tv tv = new Tv("Sharp TV");
		Stereo stereo = new Stereo("Vivo Stereo");
		Hottub hottub = new Hottub("wanjiale Hottub");
		
		RemoteControl remoteControl = new RemoteControl();
		
		LightOnCommand light1OnCmd = new LightOnCommand(light1);
		LightOffCommand light1OffCmd = new LightOffCommand(light1);
		LightOnCommand light2OnCmd = new LightOnCommand(light2);
		LightOffCommand light2OffCmd = new LightOffCommand(light2);
		TvOnCommand tvOnCmd = new TvOnCommand(tv);
		TvOffCommand tvOffCmd = new TvOffCommand(tv);
		StereoOnCommand stereoOnCmd = new StereoOnCommand(stereo);
		StereoOffCommand stereoOffCmd = new StereoOffCommand(stereo);
		HottubOnCommand hottubOnCmd = new HottubOnCommand(hottub);
		HottubOffCommand hottubOffCmd = new HottubOffCommand(hottub);
		Command[] partyOn = {light1OnCmd,light2OnCmd,tvOnCmd,stereoOnCmd,hottubOnCmd};
		Command[] partyOff = {light1OffCmd,light2OffCmd,tvOffCmd,stereoOffCmd,hottubOffCmd};
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);
		
		remoteControl.setCommand(0, light1OnCmd, light1OffCmd);
		remoteControl.setCommand(1, light2OnCmd, light2OffCmd);
		remoteControl.setCommand(2, tvOnCmd, tvOffCmd);
		remoteControl.setCommand(3, stereoOnCmd, stereoOffCmd);
		remoteControl.setCommand(4, hottubOnCmd, hottubOffCmd);
		remoteControl.setCommand(6, partyOnMacro, partyOffMacro);
		remoteControl.display();
		
		remoteControl.onButtonWasPushed(2);
		remoteControl.onButtonWasPushed(3);
		remoteControl.undoButtonWasPushed();
		remoteControl.onButtonWasPushed(1);
		remoteControl.onButtonWasPushed(0);
		System.out.println("----------");
		remoteControl.offButtonWasPushed(6);
		System.out.println("----------");
		remoteControl.onButtonWasPushed(6);
	}

}
