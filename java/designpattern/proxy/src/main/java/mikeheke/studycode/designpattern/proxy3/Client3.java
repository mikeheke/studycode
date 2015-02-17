package mikeheke.studycode.designpattern.proxy3;

import java.lang.reflect.InvocationHandler;

import mikeheke.studycode.designpattern.proxy1.GamePlayer;
import mikeheke.studycode.designpattern.proxy1.IGamePlayer;
import mikeheke.studycode.designpattern.proxy2.GamePlayIH;

public class Client3 {

	public static void main(String[] args) {

		//define a real subject
		IGamePlayer gamePlayer = new GamePlayer("Martin");
		//define a handler
		InvocationHandler invocationHandler = new GamePlayIH(gamePlayer);
		//define a proxy
		IGamePlayer gamePlayerProxy = 
				DynamicProxy.newProxyInstance(gamePlayer.getClass().getClassLoader(), 
											  gamePlayer.getClass().getInterfaces(), 
											  invocationHandler);
		
		
		
		gamePlayerProxy.login("simens", "abbc");
		
		gamePlayerProxy.killBoss();
		
		gamePlayerProxy.upgrade();
		
		
	}

}
