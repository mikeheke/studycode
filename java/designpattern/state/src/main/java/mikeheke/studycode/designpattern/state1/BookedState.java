package mikeheke.studycode.designpattern.state1;

public class BookedState extends RoomState {

	@Override
	protected String getStateDesc() {
		return "预订";
	}

	@Override
	protected void book(Room room) {
		System.out.println("当前为预订状态，无法进行再预订。");
	}

	@Override
	protected void cancelBook(Room room) {
		System.out.println("当前为预订状态，进行取消预订操作。");
		room.setState(new FreeState());
	}

	@Override
	protected void checkin(Room room) {
		System.out.println("当前为预订状态，进行入住操作。");
		room.setState(new BusyState());
	}

	@Override
	protected void checkout(Room room) {
		System.out.println("当前为预订状态，进行退房操作。");
	}

}
