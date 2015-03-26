package mikeheke.studycode.designpattern.state1;

public abstract class RoomState {

	protected abstract String getStateDesc();
	
	protected abstract void book(Room room);
	
	protected abstract void cancelBook(Room room);
	
	protected abstract void checkin(Room room);
	
	protected abstract void checkout(Room room);
}
