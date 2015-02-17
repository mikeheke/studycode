package mikeheke.studycode.designpattern.proxy3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Dynamic Proxy Class
 * 
 * @author mike
 *
 * @param <T>
 */
public class DynamicProxy<T> {

	public static <T> T newProxyInstance(ClassLoader classLoader,
									     Class<?>[] interfaces, 
									     InvocationHandler invocationHandler) {
		
		System.out.println("before advice...");

		return (T)Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
	}

}
