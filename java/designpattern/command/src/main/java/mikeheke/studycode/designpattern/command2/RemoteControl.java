package mikeheke.studycode.designpattern.command2;

public class RemoteControl {

	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;
	
	public RemoteControl() {
		NoCommand noCommand = new NoCommand();
		
		onCommands = new Command[7];
		offCommands = new Command[7];
		undoCommand = noCommand;
		
		for (int i=0; i<7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}
	
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	
	public void undoButtonWasPushed() {
		undoCommand.undo();
	}
	
	public void display() {
		StringBuffer buf = new StringBuffer("\n----------Remote Control----------\n");
		
		for (int i=0; i<onCommands.length; i++) {
			buf.append("[slot "+i+"] "+onCommands[i].getClass().getSimpleName()+"   ");
			buf.append(offCommands[i].getClass().getSimpleName()+"\n");
		}
		
		System.out.println(buf.toString());
	}
}
