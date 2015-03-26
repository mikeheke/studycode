package mikeheke.studycode.designpattern.state1;

public class StateClient1 {

	public static void main(String[] args) {
		Room r = new Room(new FreeState());
		
		r.checkin();
		r.show();
		
		r.book();
		r.show();
		
		r.checkout();
		r.show();
		
		r.book();
		r.show();
		
		r.checkin();
		r.show();
	}

}
