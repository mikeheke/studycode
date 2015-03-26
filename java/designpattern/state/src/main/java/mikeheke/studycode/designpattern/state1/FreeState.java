package mikeheke.studycode.designpattern.state1;

public class FreeState extends RoomState {

	@Override
	protected String getStateDesc() {
		return "空闲";
	}

	@Override
	protected void book(Room room) {
		System.out.println("当前为空闲状态，进行预订操作。");
		room.setState(new BookedState());
	}

	@Override
	protected void cancelBook(Room room) {
		System.out.println("当前为空闲状态，无法进行取消预订操作。");
	}

	@Override
	protected void checkin(Room room) {
		System.out.println("当前为空闲状态，进行入住操作。");
		room.setState(new BusyState());
	}

	@Override
	protected void checkout(Room room) {
		System.out.println("当前为空闲状态，无法进行退房操作。");
	}

}
