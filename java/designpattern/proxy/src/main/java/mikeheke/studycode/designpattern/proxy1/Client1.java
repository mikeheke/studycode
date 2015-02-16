package mikeheke.studycode.designpattern.proxy1;

import java.util.Date;

public class Client1 {

	public static void main(String[] args) {

		IGamePlayer gamePlayer = new GamePlayer("John");
		IGamePlayer gamePlayerProxy = new GamePlayerProxy(gamePlayer);
		
		System.out.println(new Date());
		
		gamePlayerProxy.login("abc", "123");
		
		gamePlayerProxy.killBoss();
		
		gamePlayerProxy.upgrade();
		
	}

}
