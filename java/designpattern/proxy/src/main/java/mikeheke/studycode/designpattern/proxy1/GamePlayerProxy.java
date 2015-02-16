package mikeheke.studycode.designpattern.proxy1;

public class GamePlayerProxy implements IGamePlayer {
	
	private IGamePlayer gamePlayer;
	

	public GamePlayerProxy(IGamePlayer gamePlayer) {
		super();
		this.gamePlayer = gamePlayer;
	}

	public void login(String username, String password) {
		this.gamePlayer.login(username, password);
	}

	public void killBoss() {
		this.gamePlayer.killBoss();
	}

	public void upgrade() {
		this.gamePlayer.upgrade();
	}

}
