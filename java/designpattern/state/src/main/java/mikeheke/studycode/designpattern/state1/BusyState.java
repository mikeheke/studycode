package mikeheke.studycode.designpattern.state1;

public class BusyState extends RoomState {

	@Override
	protected String getStateDesc() {
		return "入住";
	}

	@Override
	protected void book(Room room) {
		System.out.println("当前为入住状态，无法进行预订。");
	}

	@Override
	protected void cancelBook(Room room) {
		System.out.println("当前为入住状态，无法进行取消预订。");
	}

	@Override
	protected void checkin(Room room) {
		System.out.println("当前为入住状态，无法进行再入住。");
	}

	@Override
	protected void checkout(Room room) {
		System.out.println("当前为入住状态，进行退房操作。");
		room.setState(new FreeState());
	}

}
