package mikeheke.studycode.designpattern.proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayIH implements InvocationHandler {

	Class cls = null;
	
	Object obj = null;
	
	public GamePlayIH(Object obj) {
		super();
		this.obj = obj;
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
		System.out.println("invoke-----> "+method.getName());
		
		//object, args
		Object result = method.invoke(this.obj, args);
		
		System.out.println("execute-----> "+method.getName()+" finish!");
		
		return result;
	}

}
