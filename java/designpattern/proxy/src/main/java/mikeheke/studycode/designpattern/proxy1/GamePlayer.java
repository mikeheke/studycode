package mikeheke.studycode.designpattern.proxy1;

public class GamePlayer implements IGamePlayer {

	private String name;
	
	public GamePlayer(String name) {
		super();
		this.name = name;
	}

	public void login(String username, String password) {
		System.out.println("登录名："+username+", 密码："+password+", 登录成功!");
	}

	public void killBoss() {
		System.out.println(this.name+" 正在打怪...");
	}

	public void upgrade() {
		System.out.println(this.name+" 升级了...");
	}

}
