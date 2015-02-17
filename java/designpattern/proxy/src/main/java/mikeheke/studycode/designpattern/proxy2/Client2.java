package mikeheke.studycode.designpattern.proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import mikeheke.studycode.designpattern.proxy1.GamePlayer;
import mikeheke.studycode.designpattern.proxy1.IGamePlayer;

public class Client2 {

	public static void main(String[] args) {

		//create a concrete obj
		IGamePlayer gamePlayer = new GamePlayer("Joe");
		
		//define a handler
		InvocationHandler handler = new GamePlayIH(gamePlayer);
		
		//define a proxy
		IGamePlayer gamePlayerProxy = 
				(IGamePlayer)Proxy.newProxyInstance(gamePlayer.getClass().getClassLoader(), //ClassLoader
						        	                new Class[] {IGamePlayer.class}, //class[]
						        	                handler //Invocation concrete
						        	                );
		
		
		//========================do something
		
		gamePlayerProxy.login("bbc", "111111");
		
		gamePlayerProxy.killBoss();
		
		gamePlayerProxy.upgrade();
		
		
	}

}
