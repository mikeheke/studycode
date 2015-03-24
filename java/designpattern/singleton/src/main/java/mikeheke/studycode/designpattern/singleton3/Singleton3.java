package mikeheke.studycode.designpattern.singleton3;

/**
 * 懒汉式
 * @author mike
 *
 */
public class Singleton3 {

	private Singleton3 singleton;
	
	private Singleton3() {}
	
	public Singleton3 getInstance() {
		if (singleton != null) {
			return singleton;
		}
		
		synchronized(Singleton3.class) {
			if (singleton != null) {
				return singleton;
			}
			
			singleton = new Singleton3();
		}
		
		return singleton;
	}
}
