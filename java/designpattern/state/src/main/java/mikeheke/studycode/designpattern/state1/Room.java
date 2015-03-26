package mikeheke.studycode.designpattern.state1;

/**
 * 房间状态： 空闲，预订，入住
 * 行为：预订，取消预订，入住，退房
 * 
 * @author mike
 *
 */
public class Room {
	
	private RoomState state;
	
	public Room(RoomState state) {
		super();
		this.state = state;
	}

	/**
	 * 预订房间
	 */
	public void book() {
		state.book(this);
	}
	
	/**
	 * 取消预订
	 */
	public void cancleBook() {
		state.cancelBook(this);
	}
	
	/**
	 * 入住
	 */
	public void checkin() {
		state.checkin(this);
	}
	
	/**
	 * 退房
	 */
	public void checkout() {
		state.checkout(this);
	}

	public void show() {
		System.out.println("当前状态： "+this.getState().getStateDesc());
	}
	
	public RoomState getState() {
		return state;
	}

	public void setState(RoomState state) {
		this.state = state;
	}
}
